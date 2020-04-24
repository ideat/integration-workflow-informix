package com.mindware.integration.dao;

import com.mindware.integration.entity.Gbdoc;
import org.springframework.stereotype.Repository;


@Repository
public interface MapperGbdoc {
   Gbdoc getById(Integer gbdoccage);
}
