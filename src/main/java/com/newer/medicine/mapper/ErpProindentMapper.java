package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpProindent;
import com.newer.medicine.domain.ErpProindentDetail;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErpProindentMapper {

    public List<ErpProindent> selectByParam(
            @Param("indentNumber")String indentNumber,
            @Param("indentUrgency")String indentUrgency,
            @Param("state")Integer state,
            @Param("indentState")String indentState,
            @Param("page")int page,
            @Param("limit")int limit
    );

    public Integer selectCount(
            @Param("indentNumber")String indentNumber,
            @Param("indentUrgency")String indentUrgency,
            @Param("state")Integer state,
            @Param("indentState")String indentState
    );

    //删除生产订单
    @Update("update erp_proindent set ISVA=0 where INDENT_ID=#{indentId}")
    public int delPROINDENT(@Param("indentId")String indentId);

    //按主键查找生产订单详情
    public List<ErpProindentDetail> selectById(@Param("indentId")String indentId);

    //修改生产订单的数量
    @Update("update erp_proindent_detail set ENTDE_NUM=#{entdeNum},ENTDE_PRICE=#{entdePrice}  where ENTDE_ID=#{entdeId}")
    public int  updateProindentsByIddd(@Param("entdeNum")int entdeNum,
                                       @Param("entdePrice")double entdePrice,
                                             @Param("entdeId")String entdeId  );

    //修改订单中的总数量和总价格
    @Update("update erp_proindent set INDENT_COUNT=#{indentCount},INDENT_MONEY=#{indentMoney}  where INDENT_ID=#{indentId}")
    public int updateProindentsPriceeee(@Param("indentCount")int indentCount,
                                        @Param("indentMoney")double indentMoney,
                                        @Param("indentId")String indentId);
}