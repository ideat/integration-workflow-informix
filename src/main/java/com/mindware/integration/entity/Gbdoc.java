package com.mindware.integration.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Gbdoc {
    private Integer gbdoccage;
    private String gbdocndid;
    private LocalDate gbdocfvid;
    private String gbdocnruc;
    private LocalDate gbdocfvru;
    private LocalDate gbdocfreg;
    private Double gbdocplaz;
    private Double gbdocagen;
    private String gbdocuser;
    private String gbdochora;
    private LocalDate gbdocfpro;
}
