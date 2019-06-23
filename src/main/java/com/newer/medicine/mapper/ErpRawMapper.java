package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpRaw;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ErpRawMapper {
    //查询所有原材料
    List<ErpRaw> selectAllRaw(@Param("keyWords")String keyWords,
                              @Param("page")int page,
                              @Param("limit") int limit);
    //查询总记录数
    int selectRawCount(@Param("keyWords")String keyWords);
    //根据原材料id查询
    ErpRaw selectByRawId(String rawId);

    int updRaw(ErpRaw erpRaw);

    int insertRaw(ErpRaw erpRaw);

    String selectSerial(String date);


}
