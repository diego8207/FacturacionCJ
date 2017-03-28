/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Cliente;
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
public class fCliente {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "NOMBRE", "APELLIDO M", "APELLIDO P", "TIPO DOCUMENTO", "NUMERO DOCUMENTO", "DIRECCION", "TELEFONO", "EMAIL", "CODIGO_CLIENTE", "DESCUENTO"};
        String[] registro = new String[11];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select p.IDPERSONA, p.NOMBRE, p.AMATERNO, p.APATERNO, p.TIPO_DOCUMENTO, p.NUMERO_DOCUMENTO, p.DIRECCION, p.TELEFONO, p.EMAIL, c.CODIGO_CLIENTE, c.DESCUENTO"
                + " from PERSONA p inner join CLIENTE c on p.IDPERSONA = c.IDPERSONA"
                + " where NUMERO_DOCUMENTO like '%"
                + buscar + "%' order by IDPERSONA desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("IDPERSONA");
                registro[1] = rs.getString("NOMBRE");
                registro[2] = rs.getString("AMATERNO");
                registro[3] = rs.getString("APATERNO");
                registro[4] = rs.getString("TIPO_DOCUMENTO");
                registro[5] = rs.getString("NUMERO_DOCUMENTO");
                registro[6] = rs.getString("DIRECCION");
                registro[7] = rs.getString("TELEFONO");
                registro[8] = rs.getString("EMAIL");
                registro[9] = rs.getString("CODIGO_CLIENTE");
                registro[10] = rs.getString("DESCUENTO");

                totalregistros = totalregistros + 1;

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Cliente cliente) {
        sSQL = "insert into PERSONA (NOMBRE, AMATERNO, APATERNO, TIPO_DOCUMENTO, NUMERO_DOCUMENTO, DIRECCION, TELEFONO, EMAIL) "
                + "values (?,?,?,?,?,?,?,?)";

        sSQL2 = "insert into CLIENTE (CODIGO_CLIENTE, IDPERSONA, DESCUENTO) "
                + "values (?, (select IDPERSONA from PERSONA order by IDPERSONA desc limit 1),?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            pst.setString(1, cliente.getNOMBRE());
            pst.setString(2, cliente.getAMATERNO());
            pst.setString(3, cliente.getAPATERNO());
            pst.setString(4, cliente.getTIPO_DOCUMENTO());
            pst.setString(5, cliente.getNUMERO_DOCUMENTO());
            pst.setString(6, cliente.getDIRECCION());
            pst.setString(7, cliente.getTELEFONO());
            pst.setString(8, cliente.getEMAIL());
       
            pst2.setString(1, cliente.getCODIGO_CLIENTE());
            pst2.setString(2, cliente.getDESCUENTO());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();
                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Cliente cliente) {
        sSQL = "update PERSONA  set NOMBRE = ? , AMATERNO = ?, APATERNO = ?, TIPO_DOCUMENTO = ?, NUMERO_DOCUMENTO = ?, DIRECCION = ?, TELEFONO = ?, EMAIL = ? "
                + " where  IDPERSONA = ?";

        sSQL2 = "update cliente set DESCUENTO = ?,  CODIGO_CLIENTE = ?"
                + " where IDPERSONA = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, cliente.getNOMBRE());
            pst.setString(2, cliente.getAMATERNO());
            pst.setString(3, cliente.getAPATERNO());
            pst.setString(4, cliente.getTIPO_DOCUMENTO());
            pst.setString(5, cliente.getNUMERO_DOCUMENTO());
            pst.setString(6, cliente.getDIRECCION());
            pst.setString(7, cliente.getTELEFONO());
            pst.setString(8, cliente.getEMAIL());
            pst.setInt(9, cliente.getIDPERSONA());

            
            pst2.setString(1, cliente.getDESCUENTO());
            pst2.setString(2, cliente.getCODIGO_CLIENTE());
            pst2.setInt(3, cliente.getIDPERSONA());
            

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();
                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Cliente cliente) {
        sSQL = "delete from CLIENTE where IDPERSONA = ?";
        sSQL2 = "delete from PERSONA where IDPERSONA = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setInt(1, cliente.getIDPERSONA());

            pst2.setInt(1, cliente.getIDPERSONA());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();
                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

}
