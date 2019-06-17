package com.newer.medicine.server;

import com.newer.medicine.domain.Erp_Keids;
import com.newer.medicine.mapper.Erp_KeidsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Erp_KeidsServer {
    @Autowired
    private Erp_KeidsMapper erp_keidsMapper;
    public List<Erp_Keids>findStation(){

        return erp_keidsMapper.findStation();
    }
}
