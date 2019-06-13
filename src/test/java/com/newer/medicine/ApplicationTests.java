package com.newer.medicine;


import com.newer.medicine.domain.ErpFdproform;
import com.newer.medicine.domain.ErpRoleModel;
import com.newer.medicine.domain.ErpStaff;
import com.newer.medicine.domain.Erp_purchase;
import com.newer.medicine.server.Erp_purchaseServer;
import com.newer.medicine.service.ErpFdproformService;
import com.newer.medicine.service.ErpRoleModelService;
import com.newer.medicine.util.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private Erp_purchaseServer erp_purchaseServer;
    @Autowired
    private ErpFdproformService erpFdproformService;
    @Autowired
    private ErpRoleModelService erpRoleModelService;


    @Test
    public void contextLoads() {
        List<Erp_purchase> erp_applyassetList = erp_purchaseServer.selectErp_applyasset();
        erp_applyassetList.forEach(s -> {
            System.out.println(s.getCREATETIME());
        });
    }

    @Test
    public void sd() {
        Map<String, Object> pagmap = new HashMap<String, Object>();//new一个map集合
        pagmap.put("limit", 5);//将每页最大行数存入pagmap集合
        pagmap.put("page", 5);//将每页最大显示行数存入pagmap集合
        pagmap.put("keywords", "");//将关键字存入pagmap集合
        pagmap.put("min", 1);//最小值
        pagmap.put("max", 50);//最大值
        pagmap.put("annexId", 1);//分店Id
        List<ErpFdproform> erpFdproforms = erpFdproformService.findAll(pagmap);
        erpFdproforms.forEach(e -> {
            System.out.println(e.getAnnexId());
        });
    }

    @Test
    public void awe() {
        List<ErpRoleModel> roleModels = erpRoleModelService.getMessage("1");
        roleModels.forEach(r->{
            System.out.println(r.getModelId());
        });
    }
}
