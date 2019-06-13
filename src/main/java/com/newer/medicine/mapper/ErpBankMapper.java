package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpBank;
import com.newer.medicine.domain.ErpBankExample;
import java.util.List;

public interface ErpBankMapper {
    int deleteByPrimaryKey(String bankId);

    int insert(ErpBank record);

    int insertSelective(ErpBank record);

    List<ErpBank> selectByExample(ErpBankExample example);

    ErpBank selectByPrimaryKey(String bankId);

    int updateByPrimaryKeySelective(ErpBank record);

    int updateByPrimaryKey(ErpBank record);
}