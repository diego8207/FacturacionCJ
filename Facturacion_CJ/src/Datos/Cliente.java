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
public class Cliente {
    private String CODIGO_CLIENTE;
    private String IDPERSONA;
    private String DESCUENTO;

    public Cliente() {
    }

    public String getCODIGO_CLIENTE() {
        return CODIGO_CLIENTE;
    }

    public void setCODIGO_CLIENTE(String CODIGO_CLIENTE) {
        this.CODIGO_CLIENTE = CODIGO_CLIENTE;
    }

    public String getIDPERSONA() {
        return IDPERSONA;
    }

    public void setIDPERSONA(String IDPERSONA) {
        this.IDPERSONA = IDPERSONA;
    }

    public String getDESCUENTO() {
        return DESCUENTO;
    }

    public void setDESCUENTO(String DESCUENTO) {
        this.DESCUENTO = DESCUENTO;
    }
    
    
}
