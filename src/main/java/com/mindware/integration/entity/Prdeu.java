/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindware.integration.entity;

import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
public class Prdeu {
    
    private BigInteger prdeunpre;
    private int prdeucage;
    private int prdeutres;
    private String prdeuuser;
    private String prdeuhora;
    private Date prdeufpro;

}
