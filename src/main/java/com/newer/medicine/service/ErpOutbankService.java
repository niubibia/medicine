package com.newer.medicine.service;

import com.newer.medicine.domain.ErpOutbank;
import com.newer.medicine.domain.ErpOutbankExample;
import com.newer.medicine.mapper.ErpOutbankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ErpOutbankService{
    @Autowired
    ErpOutbankMapper erpOutbankMapper;

    public List<ErpOutbank> selectByObid(String obNumber){
        ErpOutbankExample erpOutbankExample=new ErpOutbankExample();
        erpOutbankExample.createCriteria().andObNumberLike("%"+obNumber+"%");
        List<ErpOutbank> erpOutbanks=erpOutbankMapper.selectByExample(erpOutbankExample);
        return erpOutbanks;
    }

    public List<ErpOutbank> selectAll(){
        ErpOutbankExample erpOutbankExample=new ErpOutbankExample();
        return erpOutbankMapper.selectByExample(erpOutbankExample);
    }

}
