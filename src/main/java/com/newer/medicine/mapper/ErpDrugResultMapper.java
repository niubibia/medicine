package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpDrugResult;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErpDrugResultMapper {

    List<ErpDrugResult> selectByRawId(String rawId);

    List<ErpDrugResult> selectByResId(String resId);

    int deleteById(String drugResId);

    int insertSelective(ErpDrugResult erpDrugResult);
}
