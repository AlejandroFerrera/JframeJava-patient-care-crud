
package cl.duoc.clinica.datos;

import cl.duoc.clinica.entidades.SistemaDeSalud;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOSistemaDeSalud {
    private String seleccionarTodo = "SELECT * FROM SISTEMA_SALUD";
    private Conexion conn = Conexion.InstanciaConn();
    private ResultSet rs;
    
    public ArrayList<SistemaDeSalud> listarSistemas () {
        try {
            ArrayList<SistemaDeSalud> lista = new ArrayList<>();
            PreparedStatement ps = conn.getConn().prepareStatement(seleccionarTodo);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                int idSistemaDeSalud = rs.getInt("ID_SISTEMA_SALUD");
                String nombreSistemaDeSalud = rs.getString("NOMBRE_SISTEMA_SALUD");
                SistemaDeSalud sds = new SistemaDeSalud(idSistemaDeSalud, nombreSistemaDeSalud);
                lista.add(sds);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(DAOSistemaDeSalud.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
