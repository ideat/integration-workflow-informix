package com.mindware.integration.controller;

import com.mindware.integration.dao.MapperGbage;
import com.mindware.integration.entity.Gbage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/rest", produces = {"application/json"})
public class gbageController {

    @Autowired
    MapperGbage mapper;

    private Integer gbagecage;

    @GetMapping("/v1/gbage/getById")
    ResponseEntity<Gbage> getById(@RequestHeader Map<String,String> headers){
        headers.forEach((key,value)->{
            if(key.equals("gbagecage")) gbagecage = Integer.parseInt(value);
        });
        Gbage gbage = mapper.getById(gbagecage);

        return new ResponseEntity<>(gbage, HttpStatus.OK);
    }
}
