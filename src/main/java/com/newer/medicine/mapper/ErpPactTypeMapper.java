package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpPactType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ErpPactTypeMapper {
    /**
     * 查询合同类型
     * @return
     */
    List<ErpPactType> findPactType();
}
