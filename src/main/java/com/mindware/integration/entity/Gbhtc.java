/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindware.integration.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author user
 */
@Data
public class Gbhtc {

    private Date gbhtcfech;
    private BigDecimal gbhtctcof;
    private BigDecimal gbhtctcco;
    private BigDecimal gbhtctcve;
    private BigDecimal gbhtctufv;
    private String gbhtcuser;
    private String gbhtchora;
    private Date gbhtcfpro;


}
