/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Diego Velez
 */
public class Producto {
    
    private String prod_cod;
    private String prod_descrip;
    private int prod_precio;
    private int prod_saldo;
    private String prod_estado;

    public Producto() {
    }

    public String getProd_cod() {
        return prod_cod;
    }

    public void setProd_cod(String prod_cod) {
        this.prod_cod = prod_cod;
    }

    public String getProd_descrip() {
        return prod_descrip;
    }

    public void setProd_descrip(String prod_descrip) {
        this.prod_descrip = prod_descrip;
    }

    public int getProd_precio() {
        return prod_precio;
    }

    public void setProd_precio(int prod_precio) {
        this.prod_precio = prod_precio;
    }

    public int getProd_saldo() {
        return prod_saldo;
    }

    public void setProd_saldo(int prod_saldo) {
        this.prod_saldo = prod_saldo;
    }

    public String getProd_estado() {
        return prod_estado;
    }

    public void setProd_estado(String prod_estado) {
        this.prod_estado = prod_estado;
    }
    
}
