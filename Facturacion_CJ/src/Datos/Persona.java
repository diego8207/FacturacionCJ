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
public class Persona {
    private int IDPERSONA;
    private String CODIGO_CLIENTE;
    private String NOMBRE;
    private String AMATERNO;
    private String APATERNO;
    private String TIPO_DOCUMENTO;
    private String NUMERO_DOCUMENTO;
    private String DIRECCION;
    private String TELEFONO;
    private String  EMAIL;

    public Persona() {
    }

    public int getIDPERSONA() {
        return IDPERSONA;
    }

    public void setIDPERSONA(int IDPERSONA) {
        this.IDPERSONA = IDPERSONA;
    }

    public String getCODIGO_CLIENTE() {
        return CODIGO_CLIENTE;
    }

    public void setCODIGO_CLIENTE(String CODIGO_CLIENTE) {
        this.CODIGO_CLIENTE = CODIGO_CLIENTE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAMATERNO() {
        return AMATERNO;
    }

    public void setAMATERNO(String AMATERNO) {
        this.AMATERNO = AMATERNO;
    }

    public String getAPATERNO() {
        return APATERNO;
    }

    public void setAPATERNO(String APATERNO) {
        this.APATERNO = APATERNO;
    }

    public String getTIPO_DOCUMENTO() {
        return TIPO_DOCUMENTO;
    }

    public void setTIPO_DOCUMENTO(String TIPO_DOCUMENTO) {
        this.TIPO_DOCUMENTO = TIPO_DOCUMENTO;
    }

    public String getNUMERO_DOCUMENTO() {
        return NUMERO_DOCUMENTO;
    }

    public void setNUMERO_DOCUMENTO(String NUMERO_DOCUMENTO) {
        this.NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
    
}
