/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego Velez
 */
public class fcategoria_producto {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"IDCATEGORIA", "NOMBRECATEGORIA"};
        String[] registro = new String[2];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from CATEGORIA_PRODUCTO where NOMBRECATEGORIA like '%" + buscar + "%' order by IDCATEGORIA";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("IDCATEGORIA");
                registro[2] = rs.getString("NOMBRECATEGORIA");

                totalregistros = totalregistros + 1;

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean insertar(Categoria categoria) {
        sSQL = "insert into CATEGORIA (NOMBRECATEGORIA) "
                + "values (?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, categoria.getNOMBRECATEGORIA());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public int obtenerIdCategoria(String nombreCategoria) {
        sSQL = "select IDCATEGORIA from CATEGORIA_PRODUCTO where NOMBRECATEGORIA = '"+nombreCategoria+"' ";
        
        int id = 0;
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
//            pst.setString(1, nombreCategoria); 
            ResultSet rs = pst.executeQuery(sSQL);
            rs.next();
            id = rs.getInt("IDCATEGORIA");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return id;
    }
    
    public ArrayList<String> llenarComboCategorias(){
        ArrayList<String> categorias = new ArrayList<String>();
        sSQL = "select NOMBRECATEGORIA from CATEGORIA_PRODUCTO";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while (rs.next()) {                
                categorias.add(rs.getString("NOMBRECATEGORIA"));
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return categorias;
    }
    
    public String consultarNombreCateg(int id){
        
        String nombre="";
        sSQL = "select NOMBRECATEGORIA from CATEGORIA_PRODUCTO where IDCATEGORIA = " + id;
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery(sSQL);
            rs.next();
            nombre = rs.getString("NOMBRECATEGORIA");
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return nombre;
    }

}
