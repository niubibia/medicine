package com.newer.medicine.mapper;

import com.newer.medicine.domain.LoadImage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author wzl
 */

@Repository
public interface LoadImageMapper {

    public LoadImage loadSell(@Param("month")Integer month,
                           @Param("annexId")String annexId);

    public LoadImage loadPay(@Param("month")Integer month,
                             @Param("annexId")String annexId);

}
