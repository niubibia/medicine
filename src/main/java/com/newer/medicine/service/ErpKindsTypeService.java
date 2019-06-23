package com.newer.medicine.service;

import com.newer.medicine.domain.ErpKindsType;

import com.newer.medicine.mapper.ErpKindsMapper;
import com.newer.medicine.mapper.ErpKindsTypeMapper;
import org.apache.ibatis.annotations.Param;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class ErpKindsTypeService {

    @Autowired
    private ErpKindsTypeMapper erpKindsTypeMapper;

    public List<ErpKindsType> selectAllKindTypeee(String key,
                                                  int page,
                                                  int limit){
        return erpKindsTypeMapper.selectAllKindTypeee(key,page,limit);
    }

    public int selectAllKindTypeeeCount(String key){
        return erpKindsTypeMapper.selectAllKindTypeeeCount(key);
    }

    public int updateAllKindTypeee(ErpKindsType erpKindsType){
        return erpKindsTypeMapper.updateAllKindTypeee(erpKindsType);
    }

    public int insertAllKindTypeee(ErpKindsType erpKindsType){
        return erpKindsTypeMapper.insertAllKindTypeee(erpKindsType);
    }

    public int deleteAllKindTypeee(String typeId){
        return erpKindsTypeMapper.deleteAllKindTypeee(typeId);

    }
    public List<ErpKindsType> findAllKindsType(){
        return erpKindsTypeMapper.findAllKindsType();
    }
}
