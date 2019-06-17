package com.newer.medicine.mapper;


import com.newer.medicine.domain.Erp_purchase;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Erp_purchaseMapper {
    //采购查询所有
    List<Erp_purchase> selectErpApplyasset(@Param("PURC_TITLE")String PURC_TITLE,
                                           @Param("PURC_NAME")String PURC_NAME,
                                           @Param("page") int pageIndex,
                                           @Param("limit") int pageSize
                                           );

    @Select("select count(*) from erp_purchase")
    int selectErp_applyassetCount();

    //By id查看详情
    @Select("select phs.PURC_NAME,phs.PURC_TITLE,phs.PURC_TIME,raw.RAW_NAME,dts.PUR_TOTAL_NUMBER,dts.PUR_TOTAL_PRICE from erp_purchase phs,erp_purchase_details dts,erp_raw raw where dts.PURC_ID=phs.PURC_ID and dts.RAW_ID=raw.RAW_ID and phs.PURC_ID=#{PURC_ID}")
    List<Erp_purchase> selectById(String PURC_ID);


}
