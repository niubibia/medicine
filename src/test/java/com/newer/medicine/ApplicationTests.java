package com.newer.medicine;

import com.newer.medicine.domain.Erp_Keids;
import com.newer.medicine.mapper.Erp_purchaseMapper;
import com.newer.medicine.server.Erp_KeidsServer;
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

 @Autowired
    private Erp_purchaseMapper erp_purchaseMapper;
    private BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();

    @Autowired
    private Erp_KeidsServer erp_keidsServer;


@Test
    public void add(){
    System.out.println(passwordEncoder.encode("admin"));
}


    @Test
    public void contextLoads() {

        List<Erp_Keids> erp_applyassetList=erp_keidsServer.findStation();
        erp_applyassetList.forEach(s->{
            System.out.println(s.getKinId());
        });
    }


}
