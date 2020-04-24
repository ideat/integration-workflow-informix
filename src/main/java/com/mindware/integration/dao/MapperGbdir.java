package com.mindware.integration.dao;

import com.mindware.integration.entity.Gbdir;
import org.springframework.stereotype.Repository;

@Repository
public interface MapperGbdir {

    Gbdir getById(Integer gbdircage);
}

