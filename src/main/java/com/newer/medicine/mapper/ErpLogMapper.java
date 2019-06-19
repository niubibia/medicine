package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpLog;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ErpLogMapper {
    public List<ErpLog> selectAllErpLogDetaill(@Param("indentId")String indentId);


    int deleteByPrimaryKey(String logId);

    //查询所有
    List<ErpLog> selectshow(@Param("key")String key,
                            @Param("page")int page,
                            @Param("limit")int limit);

    //增加
    int insert(ErpLog record);

    //总行数

    int select(@Param("key")String key);

    int insertSelective(ErpLog record);

    ErpLog selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(ErpLog record);

    int updateByPrimaryKey(ErpLog record);
}