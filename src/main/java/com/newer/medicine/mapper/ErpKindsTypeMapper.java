package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpKindsType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErpKindsTypeMapper {

    List<ErpKindsType> findAllKindsType();
}
