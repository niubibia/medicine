package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpFdproform;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: medicine
 * @description: 分店采购订单 接口
 * @author: ccziwe
 * @create: 2019-06-13 15:45
 **/
@Repository
public interface ErpFdproformMapper {
    /**
     * 根据分店id查询所有
     *
     * @param map
     * @return
     */
    List<ErpFdproform> findAll(Map<String, Object> map);


    /**
     * 根据分店id查询所有的行数
     *
     * @param map
     * @return
     */
    int findRowCount(Map<String, Object> map);


    /**
     * 删除
     *
     * @param id
     * @return
     */
    int deleteFdpro(String id);

    /**
     * 增加全部
     *
     * @param record
     * @return
     */
    int insertSelective(ErpFdproform record);

    /**
     * 根据查询所有
     *
     * @param map
     * @return
     */
    List<ErpFdproform> ratifyFindAll(Map<String, Object> map);

    /**
     * 根据查询所有的行数
     *
     * @param map
     * @return
     */
    int ratifyFindAllCout(Map<String, Object> map);

    /**
     * 审核通过时修改状态
     *
     * @param id
     * @return
     */
    int updateThrough(String id);

    /**
     * 修改全部
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(ErpFdproform record);

    /**
     * 不通过时修改状态
     *
     * @param id
     * @return
     */
    int noThrough(String id);

    /**
     * 取得修改时的值
     *
     * @param record
     * @return
     */
    int updateValue(ErpFdproform record);

    /**
     * 条件修改
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(ErpFdproform record);

    /**
     * 根据id查询
     *
     * @param fdproId
     * @return
     */
    ErpFdproform selectByPrimaryKey(String fdproId);
}
