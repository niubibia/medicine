package com.newer.medicine.service;

import com.newer.medicine.domain.ErpFdproform;
import com.newer.medicine.mapper.ErpFdproformMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: medicine
 * @description: 分店采购订单 逻辑层
 * @author: ccziwe
 * @create: 2019-06-13 15:22
 **/
@Service
public class ErpFdproformService {
    @Autowired
    private ErpFdproformMapper erpFdproformMapper;

    public List<ErpFdproform> findAll(Map<String, Object> map) {
        return erpFdproformMapper.findAll(map);
    }

    public int findRowCount(Map<String, Object> map) {
        return erpFdproformMapper.findRowCount(map);
    }

    public int deleteFdpro(String id) {
        return erpFdproformMapper.deleteFdpro(id);
    }

    public int insertSelective(ErpFdproform record) {
        return erpFdproformMapper.insertSelective(record);
    }

    public List<ErpFdproform> ratifyFindAll(Map<String, Object> map) {
        return erpFdproformMapper.ratifyFindAll(map);
    }

    public int ratifyFindAllCout(Map<String, Object> map) {
        return erpFdproformMapper.ratifyFindAllCout(map);
    }

    public int updateThrough(String id) {
        return erpFdproformMapper.updateThrough(id);
    }

    public int noThrough(String id) {
        return erpFdproformMapper.noThrough(id);
    }

    public int updateByPrimaryKeySelective(ErpFdproform record) {
        return erpFdproformMapper.updateByPrimaryKey(record);
    }

    public int updateValue(ErpFdproform record) {
        return erpFdproformMapper.updateValue(record);
    }

    public ErpFdproform selectByPrimaryKey(String fdproId) {
        return erpFdproformMapper.selectByPrimaryKey(fdproId);
    }

}
