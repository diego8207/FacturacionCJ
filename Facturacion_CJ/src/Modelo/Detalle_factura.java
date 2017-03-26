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
public class Detalle_factura {
    
    private int detalle_id;
    private int fact_num;
    private String prod_cod;
    private int detalle_subtotal;
    private int detalle_iva;

    public Detalle_factura() {
    }

    public int getDetalle_id() {
        return detalle_id;
    }

    public void setDetalle_id(int detalle_id) {
        this.detalle_id = detalle_id;
    }

    public int getFact_num() {
        return fact_num;
    }

    public void setFact_num(int fact_num) {
        this.fact_num = fact_num;
    }

    public String getProd_cod() {
        return prod_cod;
    }

    public void setProd_cod(String prod_cod) {
        this.prod_cod = prod_cod;
    }

    public int getDetalle_subtotal() {
        return detalle_subtotal;
    }

    public void setDetalle_subtotal(int detalle_subtotal) {
        this.detalle_subtotal = detalle_subtotal;
    }

    public int getDetalle_iva() {
        return detalle_iva;
    }

    public void setDetalle_iva(int detalle_iva) {
        this.detalle_iva = detalle_iva;
    }
    
}
