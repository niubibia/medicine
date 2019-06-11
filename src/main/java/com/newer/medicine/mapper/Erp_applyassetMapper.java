package com.newer.medicine.mapper;

import com.newer.medicine.domain.Erp_applyasset;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Erp_applyassetMapper {
    //采购查询所有
    @Select("select APPASS_TYPE,APPASS_APPLY,STATE,APPASS_TIME from erp_applyasset")
    List<Erp_applyasset> selectErp_applyasset();
}
