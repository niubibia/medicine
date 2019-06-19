package com.newer.medicine.mapper;

import com.newer.medicine.domain.Erp_Keids;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Erp_KeidsMapper {
    //查询所有
    List<Erp_Keids>findStation();
}
