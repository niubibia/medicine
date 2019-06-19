package com.newer.medicine.mapper;


import com.newer.medicine.domain.Erp_audit;
import com.newer.medicine.domain.Erp_purchase;
import org.apache.ibatis.annotations.*;
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

    Erp_purchase selectById(String PURC_ID);
    // 根据采购id查询详细信息
    Erp_purchase selectByPrimaryKey(String purcId);

    List<Erp_purchase> selectById1(String PURC_ID);


    // 修改采购信息(状态)
    int updPurchase(Erp_purchase erpPurchase);
    //新增
    @Insert("insert  into erp_purchase(PURC_ID,PURC_SERIAL,PURC_TITLE,PURC_NAME,STATE,PURC_TIME,CREATER,CREATETIME,ISVA,PURC_TOTAL_PRICE) values (#{PURC_ID},'CG-2017121320010250gmsb5qa0',#{PURC_TITLE},#{PURC_NAME},5,#{PURC_TIME},'1',#{CREATETIME},1,#{PURC_TOTAL_PRICE})")
    int insertErp_purchase(@Param("PURC_ID")String PURC_ID,
                           @Param("PURC_TITLE")String PURC_TITLE,
                           @Param("PURC_NAME")String PURC_NAME,
                           @Param("PURC_TIME")String PURC_TIME,
                           @Param("CREATETIME")String CREATETIME,
                           @Param("PURC_TOTAL_PRICE")int PURC_TOTAL_PRICE);

    //审核表中查看详情
    @Select("select PURC_NAME,RAW_NAME,PURC_TIME,PURC_TITLE,PUR_TOTAL_NUMBER,PUR_TOTAL_PRICE from erp_purchase phs,erp_purchase_details dts,erp_raw raw where dts.PURC_ID=phs.PURC_ID and dts.RAW_ID=raw.RAW_ID and dts.PURC_ID=#{PURC_ID}")
    List<Erp_purchase> selectByAuditId(String PURC_ID);

    //审核
    @Update("update erp_purchase set STATE=#{STATE} where PURC_ID=#{PURC_ID}")
    int  updateByPURCid(@Param("STATE")int STATE,
                        @Param("PURC_ID")String PURC_ID);
//删除
    @Delete("delete from erp_purchase where PURC_ID=#{PURC_ID}")
    int delectErp_purchase(String PURC_ID);

//修改信息
    @Update("update erp_purchase set PURC_TITLE=#{PURC_TITLE},PURC_NAME=#{PURC_NAME},STATE=#{STATE},PURC_TOTAL_PRICE=#{PURC_TOTAL_PRICE} where PURC_ID=#{PURC_ID}")
    int updataByErp_purchase(@Param("PURC_ID")String PURC_ID,
                             @Param("PURC_TITLE")String PURC_TITLE,
                             @Param("PURC_NAME")String PURC_NAME,
                             @Param("STATE")int STATE,
                             @Param("PURC_TOTAL_PRICE")double PURC_TOTAL_PRICE);
}
