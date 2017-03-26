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
public class Sede {
    private int ID_SEDE;
    private String CODIGO_CLIENTE;
    private int IDMUNICIPIO;
    private String DIRECCION_SEDE;
    private String TELEFONO_SEDE;
    private String EMAIL_SEDE;
    private String LATITUD;
    private String LONGITUD;

    public Sede() {
    }

    public int getID_SEDE() {
        return ID_SEDE;
    }

    public void setID_SEDE(int ID_SEDE) {
        this.ID_SEDE = ID_SEDE;
    }

    public String getCODIGO_CLIENTE() {
        return CODIGO_CLIENTE;
    }

    public void setCODIGO_CLIENTE(String CODIGO_CLIENTE) {
        this.CODIGO_CLIENTE = CODIGO_CLIENTE;
    }

    public int getIDMUNICIPIO() {
        return IDMUNICIPIO;
    }

    public void setIDMUNICIPIO(int IDMUNICIPIO) {
        this.IDMUNICIPIO = IDMUNICIPIO;
    }

    public String getDIRECCION_SEDE() {
        return DIRECCION_SEDE;
    }

    public void setDIRECCION_SEDE(String DIRECCION_SEDE) {
        this.DIRECCION_SEDE = DIRECCION_SEDE;
    }

    public String getTELEFONO_SEDE() {
        return TELEFONO_SEDE;
    }

    public void setTELEFONO_SEDE(String TELEFONO_SEDE) {
        this.TELEFONO_SEDE = TELEFONO_SEDE;
    }

    public String getEMAIL_SEDE() {
        return EMAIL_SEDE;
    }

    public void setEMAIL_SEDE(String EMAIL_SEDE) {
        this.EMAIL_SEDE = EMAIL_SEDE;
    }

    public String getLATITUD() {
        return LATITUD;
    }

    public void setLATITUD(String LATITUD) {
        this.LATITUD = LATITUD;
    }

    public String getLONGITUD() {
        return LONGITUD;
    }

    public void setLONGITUD(String LONGITUD) {
        this.LONGITUD = LONGITUD;
    }
    
    
    
}
