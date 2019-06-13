package com.newer.medicine.service;

import com.newer.medicine.domain.ErpRoleModel;
import com.newer.medicine.mapper.ErpRoleModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: medicine
 * @description:
 * @author: ccziwe
 * @create: 2019-06-13 16:27
 **/
@Service
public class ErpRoleModelService {
    private ErpRoleModelMapper erpRoleModelMapper;


    public int insertSelective(ErpRoleModel record) {
        return erpRoleModelMapper.insertSelective(record);
    }

    public List<ErpRoleModel> getMessage(String roleId) {
        return erpRoleModelMapper.getMessage(roleId);
    }


}
