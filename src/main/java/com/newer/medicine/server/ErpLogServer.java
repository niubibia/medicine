package com.newer.medicine.server;

import com.newer.medicine.domain.ErpLog;
import com.newer.medicine.mapper.ErpLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ErpLogServer {
    @Autowired
    private ErpLogMapper erpLogMapper;
    //查询所有
    public List<ErpLog> selectshow(String key,int page,int limit){
      List<ErpLog> erpLogs=erpLogMapper.selectshow(key,page,limit);
        return erpLogs;
    }
    /**
     * 总行数
     */
    public int select(String key) {
    int count=erpLogMapper.select(key);
        return count;
    }
}
