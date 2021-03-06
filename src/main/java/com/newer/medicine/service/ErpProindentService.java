package com.newer.medicine.service;

import com.newer.medicine.domain.ErpProindent;

import com.newer.medicine.mapper.ErpProindentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.newer.medicine.domain.ErpProindentDetail;
import com.newer.medicine.mapper.ErpProindentMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ErpProindentService {

    @Autowired
    private ErpProindentMapper erpProindentMapper;


    /**
     * 根据生产id查询
     * @param indentId
     * @return
     */
    public ErpProindent selectByIndentId(String indentId){
        return erpProindentMapper.selectByIndentId(indentId);
    }

    /**
     * 修改生产状态
     * @param erpProindent
     * @return
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updIndent(ErpProindent erpProindent) {
        return erpProindentMapper.updIndent(erpProindent);
    }


    public List<ErpProindent> selectByParam(
            String indentNumber,
            String indentUrgency,
            Integer state,
            String indentState,
            int page,
            int limit
    ){
        return erpProindentMapper.selectByParam(indentNumber,indentUrgency,state,indentState,page,limit);
    }


    public int selectCount(
            String indentNumber,
            String indentUrgency,
            Integer state,
            String indentState
    ){
        return erpProindentMapper.selectCount(indentNumber,indentUrgency,state,indentState);
    }

    //删除生产订单
    public int delPROINDENT(String indentId){
        return erpProindentMapper.delPROINDENT(indentId);
    }

    //按主键查找生产订单详情
    public List<ErpProindentDetail> selectById(String indentId){
        return erpProindentMapper.selectById(indentId);
    }

    //修改生产订单的数量
    public int  updateProindentsByIddd(int entdeNum,
                                       double entdePrice,
                                       String entdeId  ){
        return erpProindentMapper.updateProindentsByIddd(entdeNum,entdePrice,entdeId);
    }

    //修改订单中的总数量和总价格
    public int updateProindentsPriceeee(int indentCount,
                                        double indentMoney,
                                        String indentId){
        return erpProindentMapper.updateProindentsPriceeee(indentCount,indentMoney,indentId);

    }
}
