/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Diego Velez
 */
public class Numeracion_fact {
    
    private int numera_id;
    private String numera_form_numer;
    private Date numera_fecha_aut;
    private int numera_prefijo_ini;
    private int numera_prefijo_fin;

    public Numeracion_fact() {
    }

    public int getNumera_id() {
        return numera_id;
    }

    public void setNumera_id(int numera_id) {
        this.numera_id = numera_id;
    }

    public String getNumera_form_numer() {
        return numera_form_numer;
    }

    public void setNumera_form_numer(String numera_form_numer) {
        this.numera_form_numer = numera_form_numer;
    }

    public Date getNumera_fecha_aut() {
        return numera_fecha_aut;
    }

    public void setNumera_fecha_aut(Date numera_fecha_aut) {
        this.numera_fecha_aut = numera_fecha_aut;
    }

    public int getNumera_prefijo_ini() {
        return numera_prefijo_ini;
    }

    public void setNumera_prefijo_ini(int numera_prefijo_ini) {
        this.numera_prefijo_ini = numera_prefijo_ini;
    }

    public int getNumera_prefijo_fin() {
        return numera_prefijo_fin;
    }

    public void setNumera_prefijo_fin(int numera_prefijo_fin) {
        this.numera_prefijo_fin = numera_prefijo_fin;
    }
}
