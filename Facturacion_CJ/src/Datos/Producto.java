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
public class Producto {
    private int IDPRODUCTO;
    private int IDCATEGORIA;
    private String NOMBRE_PRODUCTO;
    private String CODIGO_PRODUCTO;
    private int PRECIO_VENTA_PRODUCTO;
    private int LINEA_PRODUCTO;
    private int STOCK;

    public Producto() {
    }

    public int getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(int IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public int getIDCATEGORIA() {
        return IDCATEGORIA;
    }

    public void setIDCATEGORIA(int IDCATEGORIA) {
        this.IDCATEGORIA = IDCATEGORIA;
    }

    public String getNOMBRE_PRODUCTO() {
        return NOMBRE_PRODUCTO;
    }

    public void setNOMBRE_PRODUCTO(String NOMBRE_PRODUCTO) {
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
    }

    public String getCODIGO_PRODUCTO() {
        return CODIGO_PRODUCTO;
    }

    public void setCODIGO_PRODUCTO(String CODIGO_PRODUCTO) {
        this.CODIGO_PRODUCTO = CODIGO_PRODUCTO;
    }

    public int getPRECIO_VENTA_PRODUCTO() {
        return PRECIO_VENTA_PRODUCTO;
    }

    public void setPRECIO_VENTA_PRODUCTO(int PRECIO_VENTA_PRODUCTO) {
        this.PRECIO_VENTA_PRODUCTO = PRECIO_VENTA_PRODUCTO;
    }

    public int getLINEA_PRODUCTO() {
        return LINEA_PRODUCTO;
    }

    public void setLINEA_PRODUCTO(int LINEA_PRODUCTO) {
        this.LINEA_PRODUCTO = LINEA_PRODUCTO;
    }

    public int getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(int STOCK) {
        this.STOCK = STOCK;
    }
 
}
