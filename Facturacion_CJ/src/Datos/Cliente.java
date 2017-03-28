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
public class Cliente extends Persona{
    
    private String CODIGO_CLIENTE;
    private String DESCUENTO;

    public Cliente() {
    }

    public Cliente(String CODIGO_CLIENTE, String DESCUENTO) {
        this.CODIGO_CLIENTE = CODIGO_CLIENTE;
        this.DESCUENTO = DESCUENTO;
    }
    
    

    @Override
    public String getCODIGO_CLIENTE() {
        return CODIGO_CLIENTE;
    }

    @Override
    public void setCODIGO_CLIENTE(String CODIGO_CLIENTE) {
        this.CODIGO_CLIENTE = CODIGO_CLIENTE;
    }

    public String getDESCUENTO() {
        return DESCUENTO;
    }

    public void setDESCUENTO(String DESCUENTO) {
        this.DESCUENTO = DESCUENTO;
    }
    
    
}
