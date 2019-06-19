package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpQualityDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface ErpQualityDetailMapper {

    int insertSelective(ErpQualityDetail erpQualityDetail);
}
