package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpRoleModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: medicine
 * @description: ErpRoleModelMapper
 * @author: ccziwe
 * @create: 2019-06-13 16:25
 **/
@Repository
public interface ErpRoleModelMapper {
    int deleteByPrimaryKey(String roleModelId);

    int insert(ErpRoleModel record);

    int insertSelective(ErpRoleModel record);

    ErpRoleModel selectByPrimaryKey(String roleModelId);

    int updateByPrimaryKeySelective(ErpRoleModel record);

    int updateByPrimaryKey(ErpRoleModel record);

    List<ErpRoleModel> getMessage(String roleId);
}
