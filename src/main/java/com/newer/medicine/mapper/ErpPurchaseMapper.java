package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpPurchase;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ErpPurchaseMapper {
/**
 * 采购下拉单查询
 */
List<ErpPurchase> findPurchase();
}
