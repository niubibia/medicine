package com.newer.medicine.service;

import com.newer.medicine.domain.Erp_audit;
import com.newer.medicine.mapper.Erp_auditMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Erp_auditService {
    @Autowired
    private Erp_auditMapper erp_auditMapper;
    public List<Erp_audit> selectByPURCid(String PURC_ID){
        return erp_auditMapper.selectByPURCid(PURC_ID);
    }
}
