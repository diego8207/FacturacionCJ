/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Diego Velez
 */
public class fPersona {
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String  sSQL= "";
    public Integer totalregistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"ID", "NOMBRE", "APELLIDO M", "APELLIDO P", "TIPO DOCUMENTO", "NUMERO DOCUMENTO", "DIRECCION", "TELEFONO", "EMAIL"};
        String [] registro = new String[9];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from persona where NOMBRE like '%" + buscar + "%' order by IDPERSONA";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while (rs.next()) {                
                registro [0] = rs.getString("IDPERSONA");
                registro [2] = rs.getString("NOMBRE");
                registro [3] = rs.getString("AMATERNO");
                registro [4] = rs.getString("APATERNO");
                registro [5] = rs.getString("TIPO_DOCUMENTO");
                registro [6] = rs.getString("NUMERO_DOCUMENTO");
                registro [7] = rs.getString("DIRECCION");
                registro [8] = rs.getString("TELEFONO");
                registro [9] = rs.getString("EMAIL");
                
                totalregistros = totalregistros + 1;
               
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar(Persona persona){
        sSQL = "insert into producto (idproducto, nombre_producto, talla, precio_venta_producto, descripcion) "
                + "values (?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, persona.getIDPERSONA());
            pst.setString(2, persona.getNOMBRE());
            pst.setString(3, persona.getAPATERNO());
            pst.setString(4, persona.getAPATERNO());
            pst.setString(5, persona.getTIPO_DOCUMENTO());
            pst.setString(6, persona.getNUMERO_DOCUMENTO());
            pst.setString(7, persona.getDIRECCION());
            pst.setString(8, persona.getTELEFONO());
            pst.setString(9, persona.getEMAIL());
            
            int n = pst.executeUpdate();
            
            if(n != 0) {
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }  
    }
    
    
    public DefaultComboBoxModel getListaClientes(String cadenaEscrita) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ResultSet rs;
        try { 
            PreparedStatement pstm = cn.prepareStatement("SELECT "
                    + " NUMERO_DOCUMENTO, CONCAT(NOMBRE, ' ', APATERNO, ' ', AMATERNO) AS CLIENTE"
                    + " FROM PERSONA "
                    + " WHERE NOMBRE "
                    + " LIKE '" + cadenaEscrita + "%'");
            rs = (ResultSet) pstm.executeQuery();
            
            while (rs.next()) {
                modelo.addElement(rs.getString("CLIENTE"));
                System.out.println(rs.getString("CLIENTE"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return modelo;
    }
    
    public ResultSet ConsultarPorNombreCliente(String nomCliente){
        ResultSet rs = null;
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT"
                    + " DIRECCION, NUMERO_DOCUMENTO, TELEFONO"
                    + " FROM PERSONA"
                    + " WHERE CONCAT(NOMBRE, ' ', APATERNO, ' ', AMATERNO) LIKE '"+nomCliente+"'");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("ERROR AL CONSULTAR EN METODO 'ConsultarPorNombreCliente' en fPersona : " + ex);
        }
        return rs;
    }
}
