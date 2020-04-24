/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindware.integration.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Pftit {
    private BigDecimal pftitndep;
    private int pftitcage;
    private int pftititem;
    private String pftituser;
    private String pftithora;
    private Date pftitfpro;
    private int pftitmrcb;
    private String pftitbuse;
    private String pftitbhor;
    private Date pftitbfpr;
    
    private int titular;

    
}
