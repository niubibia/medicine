package com.newer.medicine.controller;

import com.newer.medicine.domain.Erp_Keids;
import com.newer.medicine.server.Erp_KeidsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Erp_KeidsController {
    @Autowired
    private Erp_KeidsServer erp_keidsServer;

    @RequestMapping(value = "findStation",method = RequestMethod.GET)
    public List<Erp_Keids> findStation(){
        List<Erp_Keids> erp_keids=erp_keidsServer.findStation();
        return erp_keids;
    }
}
