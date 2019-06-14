package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpOutbank;
import com.newer.medicine.domain.ErpOutbankExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ErpOutbankMapper {
    int deleteByPrimaryKey(String obId);

    int insert(ErpOutbank record);

    int insertSelective(ErpOutbank record);

    List<ErpOutbank> selectByExample(ErpOutbankExample example);

    ErpOutbank selectByPrimaryKey(String obId);

    int updateByPrimaryKeySelective(ErpOutbank record);

    int updateByPrimaryKey(ErpOutbank record);
}