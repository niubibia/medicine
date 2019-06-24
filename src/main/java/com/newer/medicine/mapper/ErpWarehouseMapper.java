package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpWarehouse;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 库存
 */
@Repository
public interface ErpWarehouseMapper {

    // 查询所有库存药品
    List<ErpWarehouse> findAllWareKind(@Param("kindName") String kindName,
                                       @Param("pageIndex") int pageIndex,
                                       @Param("limit") int limit);
    // 查询所有库存药品总纪录数
    int countWareKind(@Param("kindName") String kindName);
    // 查询所有库存原材料
    List<ErpWarehouse> findAllWareRaw(@Param("rawName") String rawName,
                                      @Param("pageIndex") int pageIndex,
                                      @Param("limit") int limit);
    // 查询所有库存原材料总纪录数
    int countWareRaw(@Param("rawName") String rawName);
    // 根据仓库id查询库存明细
    ErpWarehouse selectIndevtByWareId(@Param("wareId") String wareId);


}
