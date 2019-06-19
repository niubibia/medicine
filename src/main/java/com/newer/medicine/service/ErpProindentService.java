package com.newer.medicine.service;

import com.newer.medicine.domain.ErpProindent;
import com.newer.medicine.mapper.ErpProindentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program:${PROJECT.NAME}
 * @description:
 * @author:Mr.u create:2019-06-16 18::
 **/
@Service
public class ErpProindentService {

    @Autowired
    private ErpProindentMapper erpProindentMapper;

    /**
     * 根据生产id查询
     * @param indentId
     * @return
     */
    public ErpProindent selectByIndentId(String indentId){
        return erpProindentMapper.selectByIndentId(indentId);
    }

    /**
     * 修改生产状态
     * @param erpProindent
     * @return
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updIndent(ErpProindent erpProindent){
        return erpProindentMapper.updIndent(erpProindent);
    }
}
