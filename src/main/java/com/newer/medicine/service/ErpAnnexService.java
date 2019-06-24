package com.newer.medicine.service;

import com.newer.medicine.domain.ErpAnnex;
import com.newer.medicine.mapper.ErpAnnexMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErpAnnexService {
    @Autowired
    private ErpAnnexMapper erpAnnexMapper;

    public List<ErpAnnex> selectAllAnnexxxx(String key,
                                            String annexTime,
                                            int page,
                                            int limit){
        return erpAnnexMapper.selectAllAnnexxxx(key,annexTime,page,limit);
    }


    public int selectAllCountttt(String key,
                                 String annexTime){
        return erpAnnexMapper.selectAllCountttt(key,annexTime);
    }

    //修改数据
    public int updateAllAnnexxxx(ErpAnnex erpAnnex){
        return erpAnnexMapper.updateAllAnnexxxx(erpAnnex);
    }

    //新增数据
    public int insertAllAnnexxxx(ErpAnnex erpAnnex){
        return erpAnnexMapper.insertAllAnnexxxx(erpAnnex);
    }

    public int deleteAllAnnexxxx(String annexId){
        return erpAnnexMapper.deleteAllAnnexxxx(annexId);
    }
}
