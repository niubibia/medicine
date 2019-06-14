package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpProindent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErpProindentMapper {

    public List<ErpProindent> selectByParam(
            @Param("indentNumber")String indentNumber,
            @Param("indentUrgency")String indentUrgency,
            @Param("state")Integer state,
            @Param("indentState")String indentState,
            @Param("page")int page,
            @Param("limit")int limit
    );

    public Integer selectCount(
            @Param("indentNumber")String indentNumber,
            @Param("indentUrgency")String indentUrgency,
            @Param("state")Integer state,
            @Param("indentState")String indentState
    );
}