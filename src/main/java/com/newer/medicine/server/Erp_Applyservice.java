package com.newer.medicine.server;

import com.newer.medicine.domain.ErpApply;
import com.newer.medicine.mapper.ErpApplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Erp_Applyservice {
    @Autowired
    private ErpApplyMapper erpApplyMapper;

    /**
     * 查询供货商
     * @return
     */
    public List<ErpApply> findErp(){
        return erpApplyMapper.findErp();
    }
}
