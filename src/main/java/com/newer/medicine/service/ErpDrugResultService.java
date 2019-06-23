package com.newer.medicine.service;

import com.newer.medicine.domain.ErpDrugResult;
import com.newer.medicine.mapper.ErpDrugResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program:${PROJECT.NAME}
 * @description:
 * @author:Mr.u create:2019-06-22 00::
 **/
@Service
public class ErpDrugResultService {
    @Autowired
    private ErpDrugResultMapper erpDrugResultMapper;

    public List<ErpDrugResult> findDrugResId(String rawId){
        return erpDrugResultMapper.selectByRawId(rawId);
    }
    public List<ErpDrugResult> selectByResId(String resId){
        return erpDrugResultMapper.selectByResId(resId);
    }
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteById(String drugResId){
        return erpDrugResultMapper.deleteById(drugResId);
    }
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertSelective(ErpDrugResult erpDrugResult){
        return erpDrugResultMapper.insertSelective(erpDrugResult);
    }
}
