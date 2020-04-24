package com.mindware.integration.dao;

import com.mindware.integration.entity.Gbdac;
import org.springframework.stereotype.Repository;

@Repository
public interface MapperGbdac {

    Gbdac getById(Integer gbdaccage);

}
