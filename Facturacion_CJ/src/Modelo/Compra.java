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
public class Compra {
    private int compra_id;
    private String empre_nit;
    private int compra_valor;
    private Date compra_fecha;

    public Compra() {
    }

    public int getCompra_id() {
        return compra_id;
    }

    public void setCompra_id(int compra_id) {
        this.compra_id = compra_id;
    }

    public String getEmpre_nit() {
        return empre_nit;
    }

    public void setEmpre_nit(String empre_nit) {
        this.empre_nit = empre_nit;
    }

    public int getCompra_valor() {
        return compra_valor;
    }

    public void setCompra_valor(int compra_valor) {
        this.compra_valor = compra_valor;
    }

    public Date getCompra_fecha() {
        return compra_fecha;
    }

    public void setCompra_fecha(Date compra_fecha) {
        this.compra_fecha = compra_fecha;
    }
    
}
