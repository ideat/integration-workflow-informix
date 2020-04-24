/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindware.integration.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Gbpmt {

    private Date gbpmtfdia;
    private double gbpmtscam;
    private double gbpmttcof;
    private double gbpmttcco;
    private double gbpmttcve;
    private String gbpmtnemp;
    private int gbpmtcbco;
    private Date gbpmtfini;
    private Date gbpmtffin;
    private int gbpmtgest;
    private int gbpmtclav;
    private String gbpmtcruc;
    private int gbpmtumes;
    private double gbpmttiva;
    private double gbpmtitra;
    private int gbpmtmimp;
    private int gbpmtmcon;
    private int gbpmtplaz;
    private int gbpmttent;
    private String gbpmtmfin;
    private double gbpmttufv;
    private String gbpmtdir1;
    private String gbpmtdir2;

    //otras
    private BigDecimal tipoCambio;

}
