package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpApply;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ErpApplyMapper {
    /**
     * 查询供货商
     * @return
     */
//    @Select("select  APPLY_ID, APPLY_NUMBER, APPLY_NAME, APPLY_BOSS, APPLY_ADR, APPLY_PHONE, APPLY_EMAIL," +
//            "APPLY_ISVO, ISVA from erp_apply where ISVA = 1")
   List<ErpApply> findErp();
}