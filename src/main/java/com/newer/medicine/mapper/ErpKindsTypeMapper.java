package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpKindsType;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErpKindsTypeMapper {


    List<ErpKindsType> findAllKindsType();


    public List<ErpKindsType> selectAllKindTypeee(@Param("key")String key,
                                                  @Param("page")int page,
                                                  @Param("limit")int limit);

    public int selectAllKindTypeeeCount(@Param("key")String key);

    @Update("update erp_kinds_type set TYPE_NAME=#{typeName},REMARK=#{remark} where TYPE_ID=#{typeId}")
    public int updateAllKindTypeee(ErpKindsType erpKindsType);

    @Insert("insert into erp_kinds_type values(#{typeId},#{typeSerial},#{typeName},#{remark},#{creater},#{createtime})")
    public int insertAllKindTypeee(ErpKindsType erpKindsType);

    @Delete("delete from erp_kinds_type where TYPE_ID=#{typeId}")
    public int deleteAllKindTypeee(@Param("typeId")String typeId);

}

