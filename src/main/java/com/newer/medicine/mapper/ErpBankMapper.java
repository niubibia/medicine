package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpBank;
import com.newer.medicine.domain.ErpBankExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ErpBankMapper {
    int deleteByPrimaryKey(String bankId);

    int insert(ErpBank record);

    int insertSelective(ErpBank record);

    List<ErpBank> selectByExample(ErpBankExample example);

    ErpBank selectByPrimaryKey(String bankId);

    int updateByPrimaryKeySelective(ErpBank record);

    int updateByPrimaryKey(ErpBank record);

    String selectSerial(String data);
}