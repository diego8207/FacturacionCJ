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
public class Libro_contable {
    
    private int cont_id;
    private Date cont_fecha;
    private String cont_concepto;
    private String cont_tipo_mov;
    private int cont_valor;
    private int cont_base;
    private int saldo;

    public Libro_contable() {
    }

    public int getCont_id() {
        return cont_id;
    }

    public void setCont_id(int cont_id) {
        this.cont_id = cont_id;
    }

    public Date getCont_fecha() {
        return cont_fecha;
    }

    public void setCont_fecha(Date cont_fecha) {
        this.cont_fecha = cont_fecha;
    }

    public String getCont_concepto() {
        return cont_concepto;
    }

    public void setCont_concepto(String cont_concepto) {
        this.cont_concepto = cont_concepto;
    }

    public String getCont_tipo_mov() {
        return cont_tipo_mov;
    }

    public void setCont_tipo_mov(String cont_tipo_mov) {
        this.cont_tipo_mov = cont_tipo_mov;
    }

    public int getCont_valor() {
        return cont_valor;
    }

    public void setCont_valor(int cont_valor) {
        this.cont_valor = cont_valor;
    }

    public int getCont_base() {
        return cont_base;
    }

    public void setCont_base(int cont_base) {
        this.cont_base = cont_base;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
