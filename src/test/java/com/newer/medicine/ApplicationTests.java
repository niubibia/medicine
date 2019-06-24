package com.newer.medicine;

import com.newer.medicine.domain.*;
import com.newer.medicine.mapper.ErpLedgyrMapper;
import com.newer.medicine.mapper.Erp_auditMapper;
import com.newer.medicine.mapper.Erp_purchaseMapper;
import com.newer.medicine.mapper.Erp_purchase_detailsMapper;
import com.newer.medicine.server.ErpLedgyrService;
import com.newer.medicine.server.Erp_KeidsServer;
import com.newer.medicine.server.Erp_purchaseServer;
import com.newer.medicine.service.ErpRawService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

 @Autowired
    private Erp_purchaseMapper erp_purchaseMapper;
 @Autowired
 private Erp_purchase_detailsMapper erp_purchase_detailsMapper;
 @Autowired
 private ErpLedgyrMapper erpLedgyrMapper;
 @Autowired
 private ErpRawService erpRawService;
 @Test
 public void add3(){
   List<ErpLedgyr> ledgyrList=erpLedgyrMapper.selectErpLedger(new Date(),1,2);
   ledgyrList.forEach(s->{
       System.out.println(s.getAnnexId());
   });

 }




    @Test
    public void contextLoads() {

    }
@Test
    public void add(){
    List<ErpRaw> erpRawList = erpRawService.selectAllRaw("",0,10);
    System.out.println(erpRawList.size());
}

}
