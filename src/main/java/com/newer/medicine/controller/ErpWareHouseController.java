package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpWarehouse;
import com.newer.medicine.server.ErpWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ErpWareHouseController {

    @Autowired
    private ErpWarehouseService erpWarehouseService;

    /**
     * 查询药品库存列表
     * @param kindName  药品名
     * @param pageIndex 起始页
     * @param pageSize  页大小
     * @return
     */
    @RequestMapping(value = "findAllWareKind",method = RequestMethod.GET)
    public Map<String,Object> findAllWareKind(@RequestParam(value = "prie",required = false) String kindName,
                                      @RequestParam("page")int pageIndex,
                                      @RequestParam("limit")int pageSize
                                      ){
        Map<String,Object> data=new HashMap<>();
        if (kindName==null) {
           kindName = "";
        }
        List<ErpWarehouse> erpWarehouseList=erpWarehouseService.findAllWareKind(kindName,(pageIndex-1)*pageSize,pageSize);
        int totalCount=erpWarehouseService.countWareKind(kindName);
        data.put("code",0);
        data.put("msg","");
        //总记录条数
        data.put("count",totalCount);
        //查询出来的记录
        data.put("data",erpWarehouseList);
        return data;
    }

    /**
     * 查询库存原材料
     * @param rawName 原材料名
     * @return
     */
    @RequestMapping(value = "findAllWareRaw" ,method = RequestMethod.GET)
    public Map<String,Object> findAllWareRaw(@RequestParam(value = "priea",required = false) String rawName,
                                            @RequestParam("page")int pageIndex,
                                            @RequestParam("limit")int pageSize){
        Map<String,Object> data = new HashMap<>();
        if(rawName==null){
            rawName = "";
        }
        List<ErpWarehouse> erpWarehouseList = erpWarehouseService.findAllWareRaw(rawName, pageIndex, pageSize);
        System.out.println(erpWarehouseList.toString());
        int count = erpWarehouseService.countWareRaw(rawName);
        data.put("code",0);
        data.put("msg","");
        //总记录条数
        data.put("count",count);
        //查询出来的记录
        data.put("data",erpWarehouseList);
        return data;
    }

    /**
     * 查询库存详细信息
     * @param
     * @return
     */
    @GetMapping("/indevtDetail")
    public ResponseEntity<?> indevtDetailByWareId(HttpServletRequest request){
//        System.out.println("weraId"+wareId);
        String wareId = request.getParameter("wareId");
        System.out.println("aweriD:"+wareId);
        return new ResponseEntity<>(erpWarehouseService.selectIndevtByWareId(wareId),HttpStatus.OK);
    }
}
