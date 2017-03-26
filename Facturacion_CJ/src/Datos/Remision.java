/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Diego Velez
 */
public class Remision {
    private int IDREMISION;
    private int IDPRODUCTO;
    private int IDPEDIDO;
    private int CANTIDAD;
    private int PRECIO_VENTA;
    private String ESTADO_REMISION;

    public Remision() {
    }

    public int getIDREMISION() {
        return IDREMISION;
    }

    public void setIDREMISION(int IDREMISION) {
        this.IDREMISION = IDREMISION;
    }

    public int getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(int IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public int getIDPEDIDO() {
        return IDPEDIDO;
    }

    public void setIDPEDIDO(int IDPEDIDO) {
        this.IDPEDIDO = IDPEDIDO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public int getPRECIO_VENTA() {
        return PRECIO_VENTA;
    }

    public void setPRECIO_VENTA(int PRECIO_VENTA) {
        this.PRECIO_VENTA = PRECIO_VENTA;
    }

    public String getESTADO_REMISION() {
        return ESTADO_REMISION;
    }

    public void setESTADO_REMISION(String ESTADO_REMISION) {
        this.ESTADO_REMISION = ESTADO_REMISION;
    }
    
    
}
