package com.mindware.integration;

import com.mindware.integration.dao.MapperGbage;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class IntegrationApplicationTests {

    @Autowired
    MapperGbage mapper;
    @Test
    void contextLoads() {
        mapper.getById(18);
    }

}
