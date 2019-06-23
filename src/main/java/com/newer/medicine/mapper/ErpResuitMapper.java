package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpResuit;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErpResuitMapper {

    List<ErpResuit> findAllResuit();

    List<ErpResuit> listResuit(@Param("keyWord")String keyWord,
                               @Param("page")int page,
                               @Param("limit")int limit);
    int listResuitCount(@Param("keyWord")String keyWord);

    int updResuit(ErpResuit erpResuit);

    int insertResuit(ErpResuit erpResuit);

    String selectSerial(String date);
}
