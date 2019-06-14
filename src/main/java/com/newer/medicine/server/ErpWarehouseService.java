package com.newer.medicine.server;

import com.newer.medicine.domain.ErpWarehouse;
import com.newer.medicine.mapper.ErpWarehouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErpWarehouseService {

    @Autowired
    private ErpWarehouseMapper erpWarehouseMapper;

    /**
     * 查询库存药品
     *
     * @return
     */
    public List<ErpWarehouse> findAllWareKind(String kindName, int pageIndex, int limit) {
        if (kindName == null) {
            kindName = "";
        }
        return erpWarehouseMapper.findAllWareKind(kindName, pageIndex, limit);
    }

    /**
     * 查询库存药品总纪录数
     *
     * @param kindName
     * @return
     */
    public int countWareKind(String kindName) {
        return erpWarehouseMapper.countWareKind(kindName);
    }

    /**
     * 查询库存原材料
     *
     * @param rawName
     * @return
     */
    public List<ErpWarehouse> findAllWareRaw(String rawName, int pageIndex, int limit) {
        if (rawName == null) {
            rawName = "";
        }
        return erpWarehouseMapper.findAllWareRaw(rawName, pageIndex, limit);
    }

    /**
     * 查询库存原材料总记录数
     *
     * @param rawName
     * @return
     */
    public int countWareRaw(String rawName) {
        if(rawName==null){
            rawName = "";
        }
        return erpWarehouseMapper.countWareRaw(rawName);
    }

    /**
     * 根据仓库id查询库存信息
     *
     * @param wareId
     * @return
     */
    public ErpWarehouse selectIndevtByWareId(String wareId) {
        return erpWarehouseMapper.selectIndevtByWareId(wareId);
    }
}
