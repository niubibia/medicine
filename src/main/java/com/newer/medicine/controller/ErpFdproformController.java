package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpFdproform;
import com.newer.medicine.domain.ErpStaff;
import com.newer.medicine.service.ErpFdproformService;
import com.newer.medicine.util.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: medicine
 * @description: 分店采购 - 分店审核
 * @author: ccziwe
 * @create: 2019-06-13 15:00
 **/

@RestController
@RequestMapping("api")
public class ErpFdproformController {
    @Autowired
    private ErpFdproformService fdproformService;
    /**
     * 查询采购审核所有数据
     *
     * @param page
     * @param limit
     * @param keywords
     * @param min
     * @param max
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("ratifyFindAll")
    private Map<String, Object> ratifyFindAll(int page, int limit, String keywords, String min, String max, HttpSession session) {
        Map<String, Object> map = new HashMap<String, Object>();//new一个map集合
        Map<String, Object> pagmap = new HashMap<String, Object>();//new一个map集合
        ErpStaff staff = (ErpStaff) session.getAttribute("staff");//取得存入服务器中的session
        Pages ps = new Pages();//new一个pages对象
        ps.setCurPage(page);//当前页数
        ps.setMaxResult(limit);//最大显示行数
        pagmap.put("limit", ps.getMaxResult());//将每页最大行数存入pagmap集合
        pagmap.put("page", ps.getFirstRows());//将每页最大显示行数存入pagmap集合
        pagmap.put("keywords", keywords);//将关键字存入pagmap集合
        pagmap.put("min", min);//最小值
        pagmap.put("max", max);//最大值
        pagmap.put("annexId", staff.getAnnexId());//分店Id
        List<ErpFdproform> list = fdproformService.ratifyFindAll(pagmap);//取得方法对应的list集合
        int count = fdproformService.ratifyFindAllCout(pagmap);//取得总行数
        System.out.println("++++++++++++++++++++++++++++++++++++++" + count);
        map.put("count", count);
        map.put("data", list);
        map.put("code", 0);
        map.put("msg", "");
        return map;
    }

}
