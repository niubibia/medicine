package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpProindent;
import org.springframework.stereotype.Repository;

@Repository
public interface ErpProindentMapper {
    // 根据生产id查询
    ErpProindent selectByIndentId(String indentId);
    // 修改生产状态
    int updIndent(ErpProindent erpProindent);
}
