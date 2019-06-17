package com.newer.medicine.mapper;

import com.newer.medicine.domain.Erp_audit;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Erp_auditMapper {
    @Select("select * from erp_audit where PURC_ID=#{PURC_ID}")
   List<Erp_audit>  selectByPURCid(@Param("PURC_ID")String PURC_ID);
}
