package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpKinds;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErpKindsMapper {
    public List<ErpKinds> selectAllErpKindsss(@Param("indentId")String indentId);

    //审核
    @Update("update erp_proindent set state=2,INDENT_STATE=4 where INDENT_ID=#{indentId}")
    public int updateCheckState(@Param("indentId")String indentId);
}