package com.newer.medicine.mapper;


import com.newer.medicine.domain.Erp_purchase;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Erp_purchaseMapper {
    //采购查询所有
    @Select("select*from erp_purchase")
    List<Erp_purchase> selectErp_applyasset();

    @Select("select count(*) from erp_purchase")
    int selectErp_applyassetCount();
}
