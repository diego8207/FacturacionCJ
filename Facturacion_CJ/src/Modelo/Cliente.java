/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Diego Velez
 */
public class Cliente {
    
    private String cli_numDoc;
    private String cli_tipoDoc;
    private String cli_nomApe;
    private String cli_direccion;
    private String cli_tel;
    private String cli_cel;
    private String cli_ciudad;

    public Cliente() {
    }

    public String getCli_numDoc() {
        return cli_numDoc;
    }

    public void setCli_numDoc(String cli_numDoc) {
        this.cli_numDoc = cli_numDoc;
    }

    public String getCli_tipoDoc() {
        return cli_tipoDoc;
    }

    public void setCli_tipoDoc(String cli_tipoDoc) {
        this.cli_tipoDoc = cli_tipoDoc;
    }

    public String getCli_nomApe() {
        return cli_nomApe;
    }

    public void setCli_nomApe(String cli_nomApe) {
        this.cli_nomApe = cli_nomApe;
    }

    public String getCli_direccion() {
        return cli_direccion;
    }

    public void setCli_direccion(String cli_direccion) {
        this.cli_direccion = cli_direccion;
    }

    public String getCli_tel() {
        return cli_tel;
    }

    public void setCli_tel(String cli_tel) {
        this.cli_tel = cli_tel;
    }

    public String getCli_cel() {
        return cli_cel;
    }

    public void setCli_cel(String cli_cel) {
        this.cli_cel = cli_cel;
    }

    public String getCli_ciudad() {
        return cli_ciudad;
    }

    public void setCli_ciudad(String cli_ciudad) {
        this.cli_ciudad = cli_ciudad;
    }
    
}
