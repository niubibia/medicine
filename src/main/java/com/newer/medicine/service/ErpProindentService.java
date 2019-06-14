package com.newer.medicine.service;

import com.newer.medicine.domain.ErpProindent;
import com.newer.medicine.mapper.ErpProindentMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErpProindentService {

    @Autowired
    private ErpProindentMapper erpProindentMapper;

    public List<ErpProindent> selectByParam(
            String indentNumber,
            String indentUrgency,
            Integer state,
            String indentState,
            int page,
            int limit
    ){
        return erpProindentMapper.selectByParam(indentNumber,indentUrgency,state,indentState,page,limit);
    }


    public int selectCount(
            String indentNumber,
            String indentUrgency,
            Integer state,
            String indentState
    ){
        return erpProindentMapper.selectCount(indentNumber,indentUrgency,state,indentState);
    }
}
