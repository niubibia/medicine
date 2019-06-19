/**
 * 
 */
package com.newer.medicine.server;

import java.time.Month;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.medicine.mapper.ErpPactMapper;
import com.newer.medicine.domain.ErpIncome;
import com.newer.medicine.domain.ErpPact;
import com.newer.medicine.util.Tools;


@Service
public class ErpPactService{
	@Autowired
	private ErpPactMapper erpPactMapper;



	public List<ErpPact> selectshow(Map<String, Object> map) {

		return erpPactMapper.selectshow(map);
	}



	public int deleteByPrimaryKey(String pactId) {

		return erpPactMapper.deleteByPrimaryKey(pactId);
	}


	public int insert(ErpPact record) {

		return erpPactMapper.insert(record);
	}


	public int insertSelective(ErpPact record) {
		String data = Tools.getDateStr(new Date());//得到今天创建的最后一条数据
		record.setPactNumber(Tools.getSerial(data, "LX"));//类型编号
		record.setIsva(0);//是否有效
		Date date = new Date();
		record.setCreatetime(Tools.getDateStr(date));

		record.setPactId(Tools.getTimeStr(date));
		return erpPactMapper.insertSelective(record);
	}


	public ErpPact selectByPrimaryKey(String pactId) {

		return erpPactMapper.selectByPrimaryKey(pactId);
	}


	public int updateByPrimaryKeySelective(ErpPact record) {

		return erpPactMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(ErpPact record) {

		return erpPactMapper.updateByPrimaryKey(record);
	}


	public List<ErpPact> showListPact() {

		return erpPactMapper.findListPact();
	}


	public List<ErpPact> findDimPact(Map<String, Object> map) {

		return erpPactMapper.findDimPact(map);
	}



	public int findRowCount(Map<String, Object> map) {

		return erpPactMapper.findRowCount(map);
	}



	public Map<String, Object> selectshowid(String pactId) {

		return erpPactMapper.selectshowid(pactId);
	}



	public List<ErpPact> findPactText() {
		return erpPactMapper.findPactText();
	}


}
