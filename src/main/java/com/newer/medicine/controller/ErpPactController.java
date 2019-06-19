/**
 * 
 */
package com.newer.medicine.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newer.medicine.domain.ErpPact;
import com.newer.medicine.server.ErpPactService;
import com.newer.medicine.util.SsmMessage;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class ErpPactController{

	@Autowired
	private ErpPactService service;
	/**
	 * 增加类型
	 * @param record 类型对象
	 * @return 返回信息类
	 */
	@PostMapping ("/insertSelectivePact")
	@ResponseBody
	public SsmMessage insertSelectivePact(ErpPact record){
		SsmMessage mes = new SsmMessage();
		int rows = service.insertSelective(record);
		if(rows>-1){
			mes.setMes("增加成功");
			mes.setState(1);
		}else{
			mes.setMes("增加失败");
			mes.setState(0);
		}
		return mes;
	}
	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping("showListPact")
	@ResponseBody
	public Map showListPact(){
		List<ErpPact> list = service.showListPact();
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", "");
		map.put("msg", "");
		map.put("count", list.size());
		map.put("data", list);
		return map;
	}
	/**
	 * 删除
	 * @param pactId 类型id
	 * @return 返回信息类
	 */
	@RequestMapping("deletePact")
	@ResponseBody
	public SsmMessage deletePact(String pactId){
		SsmMessage mes = new SsmMessage();
		ErpPact pact = new ErpPact();
		pact.setPactId(pactId);
		pact.setIsva(1);
		int rows = service.updateByPrimaryKeySelective(pact);
		if(rows>-1){
			mes.setMes("删除成功");
			mes.setState(1);
		}else{
			mes.setMes("删除失败");
			mes.setState(0);
		}
		return mes;
	}
	/**
	 * 修改
	 * @param record 类型对象
	 * @return 返回信息类
	 */
	@RequestMapping("updateByPrimaryKeySelective")
	@ResponseBody
	public SsmMessage updateByPrimaryKeySelective(ErpPact record){
		SsmMessage mes = new SsmMessage();
		if(record.getPactId()!=null){
			int rows = service.updateByPrimaryKeySelective(record);
			if(rows>-1){
				mes.setMes("修改成功");
				mes.setState(1);
			}else{
				mes.setMes("修改失败");
				mes.setState(0);
			}
		}else{
			mes.setMes("类型id无效");
			mes.setState(0);
		}
		return mes;
	}
	/**
	 * 模糊查询
	 * @param pricer 值
	 * @return 返回对象的map
	 */
	@RequestMapping("findDimPact")
	@ResponseBody Map findDimPact(String pricer){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("pricer", pricer);
		List<ErpPact> list = service.findDimPact(map);
		map.put("code", "");
		map.put("mes", "");
		map.put("count", list.size());
		map.put("data", list);
		return map;
	}
}
