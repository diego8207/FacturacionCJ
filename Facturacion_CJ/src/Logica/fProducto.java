/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego Velez
 */
public class fProducto {
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String  sSQL= "";
    public Integer totalregistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"ID", "NOMBRE", "TALLA", "PRECIO DE VENTA", "DESCRIPCION"};
        String [] registro = new String[5];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from PRODUCTO where NOMBRE_PRODUCTO like '%" + buscar + "%' order by IDPRODUCTO";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while (rs.next()) {                
                registro [0] = rs.getString("IDPRODUCTO");
                registro [1] = rs.getString("NOMBRE_PRODUCTO");
                registro [2] = rs.getString("TALLA");
                registro [3] = rs.getString("PRECIO_VENTA_PRODUCTO");
                registro [4] = rs.getString("DESCRIPCION");
                
                totalregistros = totalregistros + 1;
               
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
    public boolean insertar(Producto producto){
        sSQL = "insert into PRODUCTO (NOMBRE_PRODUCTO, TALLA, PRECIO_VENTA_PRODUCTO, DESCRIPCION) "
                + "values (?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, producto.getNOMBRE_PRODUCTO());
            pst.setString(2, producto.getTALLA());
            pst.setInt(3, producto.getPRECIO_VENTA_PRODUCTO());
            pst.setString(4, producto.getDESCRIPCION());
            
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
    
    
    
    public boolean editar(Producto producto){
        sSQL = "update PRODUCTO set NOMBRE_PRODUCTO = ?, TALLA = ?, PRECIO_VENTA_PRODUCTO = ?, DESCRIPCION = ?" +
                " where IDPRODUCTO = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setString(1, producto.getNOMBRE_PRODUCTO());
            pst.setString(2, producto.getTALLA());
            pst.setInt(3, producto.getPRECIO_VENTA_PRODUCTO());
            pst.setString(4, producto.getDESCRIPCION());
            pst.setInt(5, producto.getIDPRODUCTO());
            
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
    
    public boolean eliminar(Producto producto){
        sSQL = "delete from PRODUCTO where IDPRODUCTO = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, producto.getIDPRODUCTO());
            
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
            
}
