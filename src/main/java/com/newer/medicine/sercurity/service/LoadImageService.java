package com.newer.medicine.sercurity.service;


import com.newer.medicine.domain.LoadImage;
import com.newer.medicine.mapper.LoadImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


/**
 * @author wzl
 */

@Service
public class LoadImageService {

    @Autowired
    private LoadImageMapper loadImageMapper;

    public LoadImage loadSell(Integer month, String annexId){
        return loadImageMapper.loadSell(month,annexId);
    }

    public LoadImage loadPay(Integer month,String annexId){
        return loadImageMapper.loadPay(month,annexId);
    }
}
