package com.mindware.integration.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Gbage {

    private int gbagecage;
    private String gbagenomb;
    private int gbagetdid;
    private String gbagendid;
    private String gbagenruc;
    private int gbagetper;
    private Date gbagefnac;
    private int gbagesexo;
    private int gbageeciv;
    private String gbagenaci;
    private int gbageprof;
    private String gbagedir1;
    private String gbagedir2;
    private String gbageddo1;
    private String gbageddo2;
    private String gbagetlfd;
    private String gbagetlfo;
    private String gbagencas;
    private String gbagenfax;
    private String gbagetlex;
    private double gbageciiu;
    private String gbageact1;
    private String gbageact2;
    private String gbagecalf;
    private Date gbagefreg;
    private int gbageplaz;
    private int gbageagen;
    private String gbageuser;
    private String gbagehora;
    private Date gbagefpro;
    private String gbageclas;
    private int gbagestat;
    private Date gbagefsta;
    private int gbagestaa;
    private Date gbagefsaa;
    private String gbageumrc;
    private String gbageumod;
    private Date gbagefmod;  //variables externas
    private double gbageciiu2;

    private Date gbagefmrc;
    private int gbagemrcb;
    private String gbagecomp;

    public String getGbagendid(){
        return this.gbagendid.trim();
    }


    
}
