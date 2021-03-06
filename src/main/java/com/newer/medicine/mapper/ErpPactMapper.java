package com.newer.medicine.mapper;

import java.util.List;
import java.util.Map;

import com.newer.medicine.domain.ErpPact;
import org.springframework.stereotype.Repository;

@Repository
public interface ErpPactMapper {
	
	/**
      * 根据合同id查询供货商和合同详情
	 * @param pactId
	 * @return
	 */
	Map<String, Object> selectshowid(String pactId);
	/**
    * 总行数
	 * @param map
	 * @return
	 */
	int findRowCount(Map<String, Object> map);
	
	/**
	 * 查询所有
	 * @param map
	 * @return
	 */
	List<ErpPact> selectshow(Map<String, Object> map);
	
	/**

	 * 删除

	 * @param financeId 类型id

	 * @return int

	 */
    int deleteByPrimaryKey(String pactId);
    /**

     * 添加全部

     * @param record 类型数据

     * @return string

     */
    int insert(ErpPact record);
    /**

     * 选择性添加

     * @param record 类型数据

     * @return string

     */
    int insertSelective(ErpPact record);
    /**

     * 查找单个对象

     * @param financeId 类型id

     * @return int

     */
    ErpPact selectByPrimaryKey(String pactId);
    /**

     * 选择性修改

     * @param record 类型数据

     * @return string

     */
    int updateByPrimaryKeySelective(ErpPact record);
    /**

     * 修改全部

     * @param record 类型数据

     * @return string

     */
    int updateByPrimaryKey(ErpPact record);
    /**

     * 得到所有类型

     * @return

     */
	List<ErpPact> findListPact();
	/**

	 * 得到今天最大的编号

	 * @param dateStr

	 * @return

	 */
	String pactNumbe(String dateStr);
	/**

	 * 模糊查询

	 * @param price 值

	 * @return type对象的集合

	 */
	List<ErpPact> findDimPact(Map<String, Object> map);
	/**
	 * 查询合同内容
	 * @param map
	 * @return
	 */
	List<ErpPact> findPactText();
}
