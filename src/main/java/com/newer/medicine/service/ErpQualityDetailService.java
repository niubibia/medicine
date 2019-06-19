package com.newer.medicine.service;

import com.newer.medicine.domain.ErpQualityDetail;
import com.newer.medicine.mapper.ErpQualityDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program:${PROJECT.NAME}
 * @description:
 * @author:Mr.u create:2019-06-16 21::
 **/
@Service
public class ErpQualityDetailService {

    @Autowired
    private ErpQualityDetailMapper erpQualityDetailMapper;

    /**
     * 新增质检详细信息纪录
     * @param erpQualityDetail
     * @return
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertSelective(ErpQualityDetail erpQualityDetail){
        return erpQualityDetailMapper.insertSelective(erpQualityDetail);
    }
}
