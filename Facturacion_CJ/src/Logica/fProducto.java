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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
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
        fcategoria_producto fcateg = new fcategoria_producto();
        String [] titulos = {"ID", "CATEGORIA", "NOMBRE", "CODIGO", "PRECIO DE VENTA", "LINEA", "STOCK"};
        String [] registro = new String[7];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from PRODUCTO where NOMBRE_PRODUCTO like '%" + buscar + "%' order by IDPRODUCTO";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while (rs.next()) {                
                registro [0] = rs.getString("IDPRODUCTO");
                
                registro [1] = fcateg.consultarNombreCateg(rs.getInt("IDCATEGORIA"));
                
                registro [2] = rs.getString("NOMBRE_PRODUCTO");
                registro [3] = rs.getString("CODIGO_PRODUCTO");
                registro [4] = rs.getString("PRECIO_VENTA_PRODUCTO");
                registro [5] = rs.getString("LINEA_PRODUCTO");
                registro [6] = rs.getString("STOCK");
                
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
        sSQL = "insert into PRODUCTO (IDCATEGORIA, NOMBRE_PRODUCTO, CODIGO_PRODUCTO, PRECIO_VENTA_PRODUCTO, LINEA_PRODUCTO, STOCK) "
                + "values (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, producto.getIDCATEGORIA());
            pst.setString(2, producto.getNOMBRE_PRODUCTO());
            pst.setString(3, producto.getCODIGO_PRODUCTO());
            pst.setInt(4, producto.getPRECIO_VENTA_PRODUCTO());
            pst.setInt(5, producto.getLINEA_PRODUCTO());
            pst.setInt(6, producto.getSTOCK());
            
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
        sSQL = "update PRODUCTO set IDCATEGORIA = ?, NOMBRE_PRODUCTO = ?, CODIGO_PRODUCTO = ?, PRECIO_VENTA_PRODUCTO = ?, LINEA_PRODUCTO = ?" +
                " where IDPRODUCTO = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setInt(1, producto.getIDCATEGORIA());
            pst.setString(2, producto.getNOMBRE_PRODUCTO());
            pst.setString(3, producto.getCODIGO_PRODUCTO());
            pst.setInt(4, producto.getPRECIO_VENTA_PRODUCTO());
            pst.setInt(5, producto.getLINEA_PRODUCTO());
            pst.setInt(6, producto.getIDPRODUCTO());
            
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
    
   
//    public DefaultComboBoxModel getListaProductos( String cadenaEscrita){
//        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
//        ResultSet rs;
//        try {
//            PreparedStatement pstm = cn.prepareStatement(" SELECT " 
//            + " NOMBRE_PRODUCTO "
//            + " FROM PRODUCTO "
//            + " WHERE NOMBRE_PRODUCTO "
//            + " LIKE '"+cadenaEscrita+"%'");
//            rs = (ResultSet) pstm.executeQuery();
//            
//            while (rs.next()) {                
//                modelo.addElement(rs.getString("NOMBRE_PRODUCTO"));
//            }
//            
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return modelo;
//    }
    
    public ResultSet getListaProductos( String cadenaEscrita){
        
        ResultSet rs = null;
        try {
            PreparedStatement pstm = cn.prepareStatement(" SELECT " 
            + " NOMBRE_PRODUCTO, PRECIO_VENTA_PRODUCTO "
            + " FROM PRODUCTO "
            + " WHERE NOMBRE_PRODUCTO "
            + " LIKE '"+cadenaEscrita+"%'");
            rs = (ResultSet) pstm.executeQuery();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet ConsultarProNombreProducto(String nombreProducto){
        ResultSet rs = null;
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT "
                    + " CODIGO_PRODUCTO, IDPRODUCTO, STOCK, PRECIO_VENTA_PRODUCTO "
                    + " FROM PRODUCTO"
                    + " WHERE NOMBRE_PRODUCTO LIKE '"+nombreProducto+"'");
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return rs;
    }
            
}
