package com.newer.medicine.server;

import com.newer.medicine.domain.Erp_applyasset;
import com.newer.medicine.mapper.Erp_applyassetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Erp_applyassetServer {
    @Autowired
    private Erp_applyassetMapper erp_applyassetMapper;
    public  List<Erp_applyasset> selectErp_applyasset(){
        List<Erp_applyasset> erp_applyassetList=erp_applyassetMapper.selectErp_applyasset();
        return erp_applyassetList;
    }
}
