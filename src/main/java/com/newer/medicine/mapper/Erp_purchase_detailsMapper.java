package com.newer.medicine.mapper;

import com.newer.medicine.domain.Erp_purchase_details;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Erp_purchase_detailsMapper {

    @Insert("insert  into erp_purchase_details(PUR_DET_ID,PURC_ID,RAW_ID,PUR_DET_SERIAL,PUR_TOTAL_NUMBER,PUR_TOTAL_PRICE) values (#{PUR_DET_ID},'33','44',null,#{PUR_TOTAL_NUMBER},#{PUR_TOTAL_PRICE})")
    int insertErp_purchase_details(@Param("PUR_DET_ID")String PUR_DET_ID,
                                   @Param("PUR_TOTAL_NUMBER")int PUR_TOTAL_NUMBER,
                                   @Param("PUR_TOTAL_PRICE")double PUR_TOTAL_PRICE);
}
