
package cl.duoc.clinica.datos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    public static Conexion instConn;
    private Connection conn;
    
    private String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private String user = "clinica";
    private String pass = "123456";
    
    private Conexion()
    {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = (Connection) DriverManager.getConnection(URL,user,pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public synchronized static Conexion InstanciaConn()
    {
        if(instConn==null)
        {
            instConn=new Conexion();
        }
        return instConn;
    }
    
    public Connection getConn()
    {
        return conn;
    }
    
    public void Cerrar()
    {
        instConn = null;
    }
}

