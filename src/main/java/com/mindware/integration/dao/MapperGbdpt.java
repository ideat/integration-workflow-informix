package com.mindware.integration.dao;

import com.mindware.integration.entity.Gbdpt;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapperGbdpt {
    List<Gbdpt> getAll();
}
