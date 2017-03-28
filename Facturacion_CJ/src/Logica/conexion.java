/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Velez
 */
public class conexion {
//    public String db        = "macrosys_facturacion_cj";
//    public String url       = "jdbc:mysql://72.29.73.51:3306/" + db;
//    public String user      = "macrosys_facturacion_cj";
//    public String pass      = "@Max14396183"; 
    public String db        = "db_facturacion_cj";
    public String url       = "jdbc:mysql://localhost:3307/" + db;
    public String user      = "root";
    public String pass      = "root"; 

    public conexion() {
    }
    
    public Connection conectar(){
        Connection link = null;
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
}
