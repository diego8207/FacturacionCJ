package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionOracle {
Connection conn = null;

    public ConexionOracle() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "creacionesj", "creacionesj");
            if (conn != null) {
                System.out.println("Conexión a base de datos satisfactoriamente");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println("error de conexion con ORACLE ...  \n" + e);
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void desconectar() {
        conn = null;
    }    
}
