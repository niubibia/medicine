package com.newer.medicine;


<<<<<<< Updated upstream
import com.newer.medicine.domain.ErpFdproform;
import com.newer.medicine.domain.ErpRoleModel;
import com.newer.medicine.domain.ErpStaff;
import com.newer.medicine.domain.Erp_purchase;
import com.newer.medicine.mapper.Erp_purchaseMapper;
=======

import com.newer.medicine.domain.ErpLog;
import com.newer.medicine.domain.Erp_Keids;
import com.newer.medicine.domain.Erp_purchase;
import com.newer.medicine.server.ErpLogServer;
import com.newer.medicine.server.Erp_KeidsServer;
>>>>>>> Stashed changes
import com.newer.medicine.server.Erp_purchaseServer;
import com.newer.medicine.service.ErpFdproformService;
import com.newer.medicine.service.ErpRoleModelService;
import com.newer.medicine.util.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
<<<<<<< Updated upstream
 @Autowired
    private Erp_purchaseMapper erp_purchaseMapper;
    private BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
=======
    @Autowired
    private Erp_KeidsServer erp_keidsServer;
>>>>>>> Stashed changes

@Test
    public void add(){
    System.out.println(passwordEncoder.encode("admin"));
}

<<<<<<< Updated upstream
=======
    @Test
    public void contextLoads() {

        List<Erp_Keids> erp_applyassetList=erp_keidsServer.findStation();
        erp_applyassetList.forEach(s->{
            System.out.println(s.getKinId());
        });
    }
>>>>>>> Stashed changes

}
