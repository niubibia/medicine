package com.newer.medicine.service;

import com.newer.medicine.domain.ErpLog;
import com.newer.medicine.mapper.ErpLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErpLogService {
    @Autowired
    private ErpLogMapper erpLogMapper;

    public List<ErpLog> selectAllErpLogDetaill(String indentId){
        return erpLogMapper.selectAllErpLogDetaill(indentId);
    }
}
