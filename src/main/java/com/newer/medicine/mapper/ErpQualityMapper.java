package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpQuality;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 质检接口
 */
@Repository
public interface ErpQualityMapper {
    // 查询质检信息
    List<ErpQuality> selectQuality (@Param("quaIsva")int quaIsva,
                                    @Param("keyWords")String keyWords,
                                    @Param("pageIndex")int pageIndex,
                                    @Param("limit") int limit);
    // 查询质检总纪录数
    int selectCounts (@Param("keyWords")String keyWords ,@Param("quaIsva") int quaIsva);

    // 查询质检详细信息
    ErpQuality selectQualityDetail(@Param("quaId") String quaId);

    // 更改质检状态
    int updquaIsva(ErpQuality erpQuality);
    // 根据id查询
//    ErpQuality selectByQuaId(String quaId);

    // 更改信息根据id
    int updateByPrimaryKeySelective(ErpQuality erpQuality);
}
