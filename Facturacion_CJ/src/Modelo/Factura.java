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
public class Factura {
    
    private int fact_num;
    private int numera_id;
    private String cli_numDoc;
    private String empre_nit;
    private Date fact_fecha;
    private String fact_cond_pago;
    private int fact_desc_porcen;
    private int fact_desc_valor;
    private Date fact_fecha_venci;
    private String fact_observaciones;
    private int fact_total;

    public Factura() {
    }

    public int getFact_num() {
        return fact_num;
    }

    public void setFact_num(int fact_num) {
        this.fact_num = fact_num;
    }

    public int getNumera_id() {
        return numera_id;
    }

    public void setNumera_id(int numera_id) {
        this.numera_id = numera_id;
    }

    public String getCli_numDoc() {
        return cli_numDoc;
    }

    public void setCli_numDoc(String cli_numDoc) {
        this.cli_numDoc = cli_numDoc;
    }

    public String getEmpre_nit() {
        return empre_nit;
    }

    public void setEmpre_nit(String empre_nit) {
        this.empre_nit = empre_nit;
    }

    public Date getFact_fecha() {
        return fact_fecha;
    }

    public void setFact_fecha(Date fact_fecha) {
        this.fact_fecha = fact_fecha;
    }

    public String getFact_cond_pago() {
        return fact_cond_pago;
    }

    public void setFact_cond_pago(String fact_cond_pago) {
        this.fact_cond_pago = fact_cond_pago;
    }

    public int getFact_desc_porcen() {
        return fact_desc_porcen;
    }

    public void setFact_desc_porcen(int fact_desc_porcen) {
        this.fact_desc_porcen = fact_desc_porcen;
    }

    public int getFact_desc_valor() {
        return fact_desc_valor;
    }

    public void setFact_desc_valor(int fact_desc_valor) {
        this.fact_desc_valor = fact_desc_valor;
    }

    public Date getFact_fecha_venci() {
        return fact_fecha_venci;
    }

    public void setFact_fecha_venci(Date fact_fecha_venci) {
        this.fact_fecha_venci = fact_fecha_venci;
    }

    public String getFact_observaciones() {
        return fact_observaciones;
    }

    public void setFact_observaciones(String fact_observaciones) {
        this.fact_observaciones = fact_observaciones;
    }

    public int getFact_total() {
        return fact_total;
    }

    public void setFact_total(int fact_total) {
        this.fact_total = fact_total;
    }
    
    
    
}
