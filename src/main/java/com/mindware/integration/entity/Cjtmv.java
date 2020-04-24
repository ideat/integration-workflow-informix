/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindware.integration.entity;

import lombok.Data;

/**
 *
 * @author user
 */
@Data
public class Cjtmv {
    private int cjtmvpref;
    private int cjtmvcorr;
    private String cjtmvdesc;
    private String cjtmvctbl;
    private double cjtmvadic;

    public int getCjtmvpref() {
        return cjtmvpref;
    }

    public void setCjtmvpref(int cjtmvpref) {
        this.cjtmvpref = cjtmvpref;
    }

    public int getCjtmvcorr() {
        return cjtmvcorr;
    }

    public void setCjtmvcorr(int cjtmvcorr) {
        this.cjtmvcorr = cjtmvcorr;
    }

    public String getCjtmvdesc() {
        return cjtmvdesc;
    }

    public void setCjtmvdesc(String cjtmvdesc) {
        this.cjtmvdesc = cjtmvdesc;
    }

    public String getCjtmvctbl() {
        return cjtmvctbl;
    }

    public void setCjtmvctbl(String cjtmvctbl) {
        this.cjtmvctbl = cjtmvctbl;
    }

    public double getCjtmvadic() {
        return cjtmvadic;
    }

    public void setCjtmvadic(double cjtmvadic) {
        this.cjtmvadic = cjtmvadic;
    }
    
    @Override
    public String toString(){
        return "CJ-"+this.cjtmvpref+"-"+this.getCjtmvcorr()+"-"+this.cjtmvdesc.trim();
    }
    
}
