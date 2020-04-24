/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindware.integration.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author user
 */
@Data
public class Cjtrn {
    private BigInteger cjtrnntra;
    private Date cjtrnftra;
    private BigDecimal cjtrnncja;
    private BigDecimal cjtrnndoc;
    private double cjtrnmorg;
    private BigInteger cjtrntorg;
    private int cjtrnpref;
    private int cjtrncorr;
    private BigDecimal cjtrnimpo;
    private BigDecimal cjtrncbio;
    private int cjtrncmon;
    private String cjtrnnomb;
    private String cjtrngls1;
    private double cjtrnstat;
    private String cjtrnreve;
    private double cjtrnplaz;
    private int cjtrnagen;
    private String cjtrnuser;
    private String cjtrnhora;
    private Date cjtrnfpro;

    
}
