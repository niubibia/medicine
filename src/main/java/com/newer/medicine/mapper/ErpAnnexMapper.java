package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpAnnex;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ErpAnnexMapper {

    //查询全部分店
    public List<ErpAnnex> selectAllAnnexxxx(@Param("key") String key,
                                            @Param("annexTime") String annexTime,
                                            @Param("page") int page,
                                            @Param("limit") int limit);

    //查询总条数
    public int selectAllCountttt(@Param("key") String key,
                                 @Param("annexTime") String annexTime
    );

    //修改数据
    public int updateAllAnnexxxx(ErpAnnex erpAnnex);

    //新增数据
    public int insertAllAnnexxxx(ErpAnnex erpAnnex);

    //删除数据
    public int deleteAllAnnexxxx(@Param("annexId") String annexId);
}