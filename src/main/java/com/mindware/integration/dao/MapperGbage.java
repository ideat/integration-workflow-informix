package com.mindware.integration.dao;

import com.mindware.integration.entity.Gbage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapperGbage {
    Gbage getById(Integer gbagecage);

    List<Gbage> getByNombre(String gbagenomb);

    List<Gbage> getByCarnet(String gbagendid);
}
