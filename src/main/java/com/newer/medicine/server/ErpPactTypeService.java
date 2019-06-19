package com.newer.medicine.server;

import com.newer.medicine.domain.ErpPactType;
import com.newer.medicine.mapper.ErpPactTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErpPactTypeService {
    @Autowired
    private ErpPactTypeMapper erpPactTypeMapper;
    public List<ErpPactType> findPactType(){
        return erpPactTypeMapper.findPactType();
    }
}
