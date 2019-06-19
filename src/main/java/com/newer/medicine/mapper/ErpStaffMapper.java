package com.newer.medicine.mapper;

import com.newer.medicine.domain.ErpStaff;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ErpStaffMapper {

    public ErpStaff findByUsername(String staEmail);
}
