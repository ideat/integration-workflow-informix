package com.mindware.integration.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Camca {

    private String camcancta;
    private int camcacage;
    private double camcatpca;
    private double camcacmon;
    private double camcamane;
    private String camcariva;
    private double camcatasa;
    private String camcainst;
    private Date camcafapt;
    private double camcasant;
    private BigDecimal camcasact;
    private double camcadncf;
    private double camcafpig;
    private Date camcafumv;
    private double camcastat;
    private Date camcafcbl;
    private double camcasdia;
    private double camcaacum;
    private double camcaacan;
    private double camcaplaz;
    private double camcaagen;
    private String camcauser;
    private String camcahora;
    private Date camcafpro;
    private int camcastus;
    private int camcattas;
    private int camcatcap;
    private Date camcafcap;
    private double camcaiacu;
    private double camcaidia;

    private String pro_codigo;
    private String est_codigo;
    private BigDecimal montoApt;

    public BigDecimal getMontoApt() {
        if(montoApt == null) montoApt =  BigDecimal.ZERO;
        return montoApt;
    }

    public void setMontoApt(BigDecimal montoApt) {
        this.montoApt = montoApt;
    }

    public String getEst_codigo() {
        return est_codigo;
    }

    public void setEst_codigo(String est_codigo) {
        this.est_codigo = est_codigo;
    }

    public String getCamcancta() {
        return camcancta;
    }

    public void setCamcancta(String camcancta) {
        this.camcancta = camcancta;
    }

    public int getCamcacage() {
        return camcacage;
    }

    public void setCamcacage(int camcacage) {
        this.camcacage = camcacage;
    }

    public double getCamcatpca() {
        return camcatpca;
    }

    public void setCamcatpca(double camcatpca) {
        this.camcatpca = camcatpca;
    }

    public double getCamcacmon() {
        return camcacmon;
    }

    public void setCamcacmon(double camcacmon) {
        this.camcacmon = camcacmon;
    }

    public double getCamcamane() {
        return camcamane;
    }

    public void setCamcamane(double camcamane) {
        this.camcamane = camcamane;
    }

    public String getCamcariva() {
        return camcariva;
    }

    public void setCamcariva(String camcariva) {
        this.camcariva = camcariva;
    }

    public double getCamcatasa() {
        return camcatasa;
    }

    public void setCamcatasa(double camcatasa) {
        this.camcatasa = camcatasa;
    }

    public String getCamcainst() {
        return camcainst;
    }

    public void setCamcainst(String camcainst) {
        this.camcainst = camcainst;
    }

    public Date getCamcafapt() {
        return camcafapt;
    }

    public void setCamcafapt(Date camcafapt) {
        this.camcafapt = camcafapt;
    }

    public double getCamcasant() {
        return camcasant;
    }

    public void setCamcasant(double camcasant) {
        this.camcasant = camcasant;
    }

    public BigDecimal getCamcasact() {
        return camcasact;
    }

    public void setCamcasact(BigDecimal camcasact) {
        this.camcasact = camcasact;
    }

    public double getCamcadncf() {
        return camcadncf;
    }

    public void setCamcadncf(double camcadncf) {
        this.camcadncf = camcadncf;
    }

    public double getCamcafpig() {
        return camcafpig;
    }

    public void setCamcafpig(double camcafpig) {
        this.camcafpig = camcafpig;
    }

    public Date getCamcafumv() {
        return camcafumv;
    }

    public void setCamcafumv(Date camcafumv) {
        this.camcafumv = camcafumv;
    }

    public double getCamcastat() {
        return camcastat;
    }

    public void setCamcastat(double camcastat) {
        this.camcastat = camcastat;
    }

    public Date getCamcafcbl() {
        return camcafcbl;
    }

    public void setCamcafcbl(Date camcafcbl) {
        this.camcafcbl = camcafcbl;
    }

    public double getCamcasdia() {
        return camcasdia;
    }

    public void setCamcasdia(double camcasdia) {
        this.camcasdia = camcasdia;
    }

    public double getCamcaacum() {
        return camcaacum;
    }

    public void setCamcaacum(double camcaacum) {
        this.camcaacum = camcaacum;
    }

    public double getCamcaacan() {
        return camcaacan;
    }

    public void setCamcaacan(double camcaacan) {
        this.camcaacan = camcaacan;
    }

    public double getCamcaplaz() {
        return camcaplaz;
    }

    public void setCamcaplaz(double camcaplaz) {
        this.camcaplaz = camcaplaz;
    }

    public double getCamcaagen() {
        return camcaagen;
    }

    public void setCamcaagen(double camcaagen) {
        this.camcaagen = camcaagen;
    }

    public String getCamcauser() {
        return camcauser;
    }

    public void setCamcauser(String camcauser) {
        this.camcauser = camcauser;
    }

    public String getCamcahora() {
        return camcahora;
    }

    public void setCamcahora(String camcahora) {
        this.camcahora = camcahora;
    }

    public Date getCamcafpro() {
        return camcafpro;
    }

    public void setCamcafpro(Date camcafpro) {
        this.camcafpro = camcafpro;
    }

    public int getCamcastus() {
        return camcastus;
    }

    public void setCamcastus(int camcastus) {
        this.camcastus = camcastus;
    }

    public int getCamcattas() {
        return camcattas;
    }

    public void setCamcattas(int camcattas) {
        this.camcattas = camcattas;
    }

    public int getCamcatcap() {
        return camcatcap;
    }

    public void setCamcatcap(int camcatcap) {
        this.camcatcap = camcatcap;
    }

    public Date getCamcafcap() {
        return camcafcap;
    }

    public void setCamcafcap(Date camcafcap) {
        this.camcafcap = camcafcap;
    }

    public double getCamcaiacu() {
        return camcaiacu;
    }

    public void setCamcaiacu(double camcaiacu) {
        this.camcaiacu = camcaiacu;
    }

    public double getCamcaidia() {
        return camcaidia;
    }

    public void setCamcaidia(double camcaidia) {
        this.camcaidia = camcaidia;
    }

    public String getPro_codigo() {
        return pro_codigo;
    }

    public void setPro_codigo(String pro_codigo) {
        this.pro_codigo = pro_codigo;
    }

}
