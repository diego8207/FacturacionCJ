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
public class Municipio {
    private int IDMUNICIPIO;
    private int IDDEPARTAMENTO;
    private String NOMBRE_MUNICIPIO;

    public Municipio() {
    }

    public int getIDMUNICIPIO() {
        return IDMUNICIPIO;
    }

    public void setIDMUNICIPIO(int IDMUNICIPIO) {
        this.IDMUNICIPIO = IDMUNICIPIO;
    }

    public int getIDDEPARTAMENTO() {
        return IDDEPARTAMENTO;
    }

    public void setIDDEPARTAMENTO(int IDDEPARTAMENTO) {
        this.IDDEPARTAMENTO = IDDEPARTAMENTO;
    }

    public String getNOMBRE_MUNICIPIO() {
        return NOMBRE_MUNICIPIO;
    }

    public void setNOMBRE_MUNICIPIO(String NOMBRE_MUNICIPIO) {
        this.NOMBRE_MUNICIPIO = NOMBRE_MUNICIPIO;
    }
    
    
}
