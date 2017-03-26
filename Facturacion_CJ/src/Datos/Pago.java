/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 *
 * @author Diego Velez
 */
public class Pago {
    private String IDPAGO;
    private int IDPEDIDO;
    private String TIPO_COMPROBANTE;
    private String NUM_COMPROBANTE;
    private int IVA;
    private int TOTAL_PAGO;
    private Date FECHA_EMISION;
    private Date FECHA_PAGO;
    private String ESTADO_PAGO;

    public Pago() {
    }

    public String getIDPAGO() {
        return IDPAGO;
    }

    public void setIDPAGO(String IDPAGO) {
        this.IDPAGO = IDPAGO;
    }

    public int getIDPEDIDO() {
        return IDPEDIDO;
    }

    public void setIDPEDIDO(int IDPEDIDO) {
        this.IDPEDIDO = IDPEDIDO;
    }

    public String getTIPO_COMPROBANTE() {
        return TIPO_COMPROBANTE;
    }

    public void setTIPO_COMPROBANTE(String TIPO_COMPROBANTE) {
        this.TIPO_COMPROBANTE = TIPO_COMPROBANTE;
    }

    public String getNUM_COMPROBANTE() {
        return NUM_COMPROBANTE;
    }

    public void setNUM_COMPROBANTE(String NUM_COMPROBANTE) {
        this.NUM_COMPROBANTE = NUM_COMPROBANTE;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public int getTOTAL_PAGO() {
        return TOTAL_PAGO;
    }

    public void setTOTAL_PAGO(int TOTAL_PAGO) {
        this.TOTAL_PAGO = TOTAL_PAGO;
    }

    public Date getFECHA_EMISION() {
        return FECHA_EMISION;
    }

    public void setFECHA_EMISION(Date FECHA_EMISION) {
        this.FECHA_EMISION = FECHA_EMISION;
    }

    public Date getFECHA_PAGO() {
        return FECHA_PAGO;
    }

    public void setFECHA_PAGO(Date FECHA_PAGO) {
        this.FECHA_PAGO = FECHA_PAGO;
    }

    public String getESTADO_PAGO() {
        return ESTADO_PAGO;
    }

    public void setESTADO_PAGO(String ESTADO_PAGO) {
        this.ESTADO_PAGO = ESTADO_PAGO;
    }
    
    
}
