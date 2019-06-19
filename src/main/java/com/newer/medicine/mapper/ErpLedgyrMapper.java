package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpLedgyr;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ErpLedgyrMapper {
    //分店财务查询所有
   List<ErpLedgyr> selectErpLedger(@Param("SALE_DATE")Date saleDate,
                                   @Param("pageIndex")Integer pageIndex,
                                   @Param("pageSize")Integer pageSize);

   //查询行数
    @Select("select count(*)  from erp_ledgyr ld,erp_sctockmp st where ld.SALE_ID=st.SALE_ID")
    int selectErpLedgerCount();

    //byId查询
    ErpLedgyr selectByGyrId(String gyrId);



    //支出
    List<ErpLedgyr> selectFdproform(@Param("FDPRO_TIME")String fdproTime,
                                    @Param("pageIndex")Integer pageIndex,
                                    @Param("pageSize")Integer pageSize);
    //查询行数
    @Select("SELECT count(*) FROM erp_ledgyr er,erp_fdproform em  where er.FDPRO_ID=em.FDPRO_ID")
    int selectFdproformCount();

    //ByGYR_ID查询
    ErpLedgyr selectFdproformByGYRID(String gyrId);
}
