package com.newer.medicine.service;

import com.newer.medicine.domain.ErpKinds;
import com.newer.medicine.mapper.ErpKindsMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErpKindService {

    @Autowired
    private ErpKindsMapper erpKindsMapper;

    public List<ErpKinds> selectAllErpKindsss(String indentId){
        return erpKindsMapper.selectAllErpKindsss(indentId);
    }

    public int updateCheckState(String indentId){
        return erpKindsMapper.updateCheckState(indentId);
    }
}
