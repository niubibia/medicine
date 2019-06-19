package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpQuality;
import com.newer.medicine.domain.ErpQualityDetail;
import com.newer.medicine.service.ErpQualityService;
import com.newer.medicine.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program:${PROJECT.NAME}
 * @description:
 * @author:Mr.u create:2019-06-14 14::
 **/
@RestController
@RequestMapping("/api")
public class ErpQualityController {

    @Autowired
    private ErpQualityService erpQualityService;

    /**
     * 查询质检信息
     * @param quaIsva   质检状态
     * @param pageIndex
     * @param limit
     * @return
     */
    @RequestMapping(value = "listQuality",method = RequestMethod.GET)
    public Map<String,Object> selectQuality (@RequestParam(value = "price") int quaIsva,
                                             @RequestParam(value = "pricer",required = false) String keyWords,
                                             @RequestParam("page") int pageIndex,
                                             @RequestParam("limit") int limit){
        Map<String,Object> data = new HashMap<>();
        List<ErpQuality> erpQualityList = erpQualityService.selectQuality(quaIsva,keyWords,limit*(pageIndex-1), limit);
        int count = erpQualityService.selectCounts(keyWords,quaIsva);
        data.put("code",0);
        data.put("msg","");
        //总记录条数
        data.put("count",count);
        //查询出来的记录
        data.put("data",erpQualityList);
        return data;
    }

    /**
     * 质检详细信息
     * @param quaId
     * @return
     */
    @RequestMapping(value = "qualityDetail",method = RequestMethod.GET)
    public ResponseEntity<?> selectQualityDetail(@RequestParam("quaId") String quaId){
        ErpQuality erpQuality = erpQualityService.selectQualityDetail(quaId);
        return new ResponseEntity<>(erpQuality,HttpStatus.OK);
    }
    // 更改质检状态及加入入库单信息
    @RequestMapping(value = "updquaIsva" ,method = RequestMethod.PUT)
    public ResponseEntity<?> updquaIsva(@RequestParam("quaId") String quaId,
                                        @RequestParam("bankCount") Integer bankCount,
                                        @RequestParam("remark") String remark){
        int rows = erpQualityService.updquaIsva(quaId, bankCount, remark);
        return new ResponseEntity<>(rows,HttpStatus.OK);
    }

    @RequestMapping(value = "updIsvaAndInsertqudt" ,method = RequestMethod.PUT)
    public ResponseEntity<?> updIsvaAndInsertqudt(@RequestParam(value = "rawId",required = false) String rawId,
                                                  @RequestParam(value = "kinId",required = false) String kinId,
                                                  @RequestParam("qdetGood") String qdetGood,
                                                  @RequestParam("qdetBab") String qdetBad,
                                                  @RequestParam("remark") String remark,
                                                  @RequestParam("quaId")String quaId,
                                                  @RequestParam("quaGood")Integer quaGood,
                                                  @RequestParam("quaBab") Integer quaBad,
                                                  @RequestParam("quaIsva") Integer quaIsva,
                                                  @RequestParam(value = "indentId",required = false) String indentId,
                                                  @RequestParam(value = "purcId",required = false) String purcId){
        ErpQuality erpQuality = new ErpQuality();
        System.out.println(purcId+"---"+indentId+",,"+quaIsva);
        erpQuality.setQuaId(quaId);
        erpQuality.setQuaGood(quaGood);
        erpQuality.setQuaBab(quaBad);
        erpQuality.setQuaIsva(quaIsva);
        erpQuality.setPurcId(purcId);
        erpQuality.setIndentId(indentId);
        erpQuality.setRemark(remark);
        List<ErpQualityDetail> qualityDetailList = new ArrayList<>();
        String [] qg = qdetGood.split(",");
        String [] qb = qdetBad.split(",");
        if(rawId!=null){
            String [] ri = rawId.split(",");
            for (int i = 0; i < ri.length; i++) {
                ErpQualityDetail q = new ErpQualityDetail();
                q.setRawId(ri[i]);
                q.setQuaId(quaId);
                q.setQdetGood(Integer.parseInt(qg[i]));
                q.setQdetBab(Integer.parseInt(qb[i]));
                q.setRemark(remark);
                q.setCreatetime(Tools.getCurDateTime());
                qualityDetailList.add(q);
            }
        }
        if(kinId!=null){
            String [] ki = kinId.split(",");
            for (int i = 0; i < ki.length; i++) {
                ErpQualityDetail q = new ErpQualityDetail();
                q.setKinId(ki[i]);
                q.setQuaId(quaId);
                q.setQdetGood(Integer.parseInt(qg[i]));
                q.setQdetBab(Integer.parseInt(qb[i]));
                q.setRemark(remark);
                q.setCreatetime(Tools.getCurDateTime());
                qualityDetailList.add(q);
            }
        }
        int rows = erpQualityService.updIsvaAndInsertqudt(erpQuality,qualityDetailList);
        return new ResponseEntity<>(rows,HttpStatus.OK);
    }
}
