package com.newer.medicine.service;

import com.newer.medicine.domain.Sctockmp;

import java.util.List;
import java.util.Map;

public interface SctockmpService {
    int deleteByPrimaryKey(String saleId);

    int insert(Sctockmp record);

    int insertSelective(Sctockmp record);


    /**
     * 查询今天的订单数量
     * @return 订单数量
     */
    public int findToDay();

    /**
     * 根据订单ID查询订单
     * @param saleId 订单ID
     * @return 订单对象
     */
    public Sctockmp selectByPrimaryKey(String saleId);

    /**
     * 根据订单ID修改订单信息
     * @param saleId 订单ID
     * @return 影响行数
     */
    public int updateByPrimaryKeySelective(Sctockmp sctockmp);

    int updateByPrimaryKey(Sctockmp record);

    /**
     * 根据订单ID查询当前订单批发状态
     *
     * @param saleId 订单ID
     * @return 订单状态
     */
    public int findWholesaleStateBySaleId(String saleId);

    /**
     * 审核通过，增加批发状态
     * @param saleId 订单ID
     * @return 影响行数
     * @author ouyang
     * @date 2017年12月1日08:48:14
     */
    public int updateWholesaleStateAdd(String saleId);

    /**
     * 查询订单列表
     * @param map 搜索的参数
     * @return 订单集合
     */
    public List<Map<String, Object>> findAll(Map<String, Object> map);

    /**
     * 查询订单列表数量
     * @param map 搜索的参数
     * @return 订单集合
     */
    public int findAllSize(Map<String, Object> map);

}
