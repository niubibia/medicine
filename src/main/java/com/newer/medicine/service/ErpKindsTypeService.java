package com.newer.medicine.service;

import com.newer.medicine.domain.ErpKindsType;
import com.newer.medicine.mapper.ErpKindsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:${PROJECT.NAME}
 * @description:
 * @author:Mr.u create:2019-06-21 14::
 **/
@Service
public class ErpKindsTypeService {
    @Autowired
    private ErpKindsTypeMapper erpKindsTypeMapper;

    public List<ErpKindsType> findAllKindsType(){
        return erpKindsTypeMapper.findAllKindsType();
    }
}
