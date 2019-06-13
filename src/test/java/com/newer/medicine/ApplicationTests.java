package com.newer.medicine;



import com.newer.medicine.domain.Erp_purchase;
import com.newer.medicine.server.Erp_purchaseServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private Erp_purchaseServer erp_purchaseServer;


    @Test
    public void contextLoads() {
        List<Erp_purchase> erp_applyassetList=erp_purchaseServer.selectErp_applyasset();
        erp_applyassetList.forEach(s->{
            System.out.println(s.getCREATETIME());
        });
    }

}
