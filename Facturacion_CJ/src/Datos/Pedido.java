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
public class Pedido {
    private int IDPEDIDO;
    private int ID_SEDE;
    private Date FECHA_PEDIDO;
    private Date FECHA_ENVIO;
    private String OBSERVACION;
    private String ESTADO_PEDIDO;

    public Pedido() {
    }

    public int getIDPEDIDO() {
        return IDPEDIDO;
    }

    public void setIDPEDIDO(int IDPEDIDO) {
        this.IDPEDIDO = IDPEDIDO;
    }

    public int getID_SEDE() {
        return ID_SEDE;
    }

    public void setID_SEDE(int ID_SEDE) {
        this.ID_SEDE = ID_SEDE;
    }

    public Date getFECHA_PEDIDO() {
        return FECHA_PEDIDO;
    }

    public void setFECHA_PEDIDO(Date FECHA_PEDIDO) {
        this.FECHA_PEDIDO = FECHA_PEDIDO;
    }

    public Date getFECHA_ENVIO() {
        return FECHA_ENVIO;
    }

    public void setFECHA_ENVIO(Date FECHA_ENVIO) {
        this.FECHA_ENVIO = FECHA_ENVIO;
    }

    public String getOBSERVACION() {
        return OBSERVACION;
    }

    public void setOBSERVACION(String OBSERVACION) {
        this.OBSERVACION = OBSERVACION;
    }

    public String getESTADO_PEDIDO() {
        return ESTADO_PEDIDO;
    }

    public void setESTADO_PEDIDO(String ESTADO_PEDIDO) {
        this.ESTADO_PEDIDO = ESTADO_PEDIDO;
    }
    
    
            
            
    
    
}
