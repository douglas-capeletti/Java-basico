/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores.ClinicaDrPet;

/**
 *
 * @author Doug
 */
public class Consulta {

    private Bicho bicho;
    private String dataConsulta;
    private String parecer;

    public Consulta(Bicho bicho, String dataConsulta, String parecer) {
        this.bicho = bicho;
        this.dataConsulta = dataConsulta;
        this.parecer = parecer;
    }

    public Bicho getBicho() {
        return bicho;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public String getParecer() {
        return parecer;
    }

    public void setParecer(String novoParecer) {
        parecer = novoParecer;
    }

    public String toString() {
        return "Bicho: " + bicho.getNome()
                + "\nDono: " + bicho.getDono().getNome()
                + "\nData da consulta: " + dataConsulta
                + "\nParecer: " + parecer;
    }
}
