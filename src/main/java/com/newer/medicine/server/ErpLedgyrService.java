package com.newer.medicine.server;

import com.newer.medicine.domain.ErpLedgyr;
import com.newer.medicine.mapper.ErpLedgyrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ErpLedgyrService {
    @Autowired
    private ErpLedgyrMapper erpLedgyrMapper;
    public List<ErpLedgyr> selectErpLedger(Date saleDate,Integer pageIndex, Integer pageSize){
        return erpLedgyrMapper.selectErpLedger(saleDate,pageIndex,pageSize);
    }

    //行数
    public int selectErpLedgerCount(){
        return erpLedgyrMapper.selectErpLedgerCount();
    }

    //byId查询
    public ErpLedgyr selectByGyrId(String gyrId){
        return  erpLedgyrMapper.selectByGyrId(gyrId);
    }

    //支出
    public List<ErpLedgyr> selectFdproform(String fdproTime,Integer pageIndex,Integer pageSize){
        return erpLedgyrMapper.selectFdproform(fdproTime,pageIndex,pageSize);
    }
    //行数

    public int selectFdproformCount(){
        return erpLedgyrMapper.selectFdproformCount();
    }

    //byFdproformID查询
    public ErpLedgyr selectFdproformByGYRID(String gyrId){
        return erpLedgyrMapper.selectFdproformByGYRID(gyrId);
    }
}
