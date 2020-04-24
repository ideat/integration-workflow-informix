package com.mindware.integration.dao;

import com.mindware.integration.entity.Gbdbi;
import org.springframework.stereotype.Repository;

@Repository
public interface MapperGbdbi {
    Gbdbi getById(Integer gbdbicage);
}
