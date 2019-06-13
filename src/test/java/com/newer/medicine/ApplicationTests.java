package com.newer.medicine;


import com.newer.medicine.domain.ErpFdproform;
import com.newer.medicine.domain.ErpRoleModel;
import com.newer.medicine.domain.ErpStaff;
import com.newer.medicine.domain.Erp_purchase;
import com.newer.medicine.mapper.Erp_purchaseMapper;
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
    private Erp_purchaseMapper erp_purchaseMapper;

@Test
    public void add(){
    System.out.println("....");
}


}
