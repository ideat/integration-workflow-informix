package com.mindware.integration.dao;

import com.mindware.integration.entity.Gbprv;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapperGbprv {

    List<Gbprv> getAll();
}
