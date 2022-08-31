
package cl.duoc.clinica.datos;
import cl.duoc.clinica.entidades.Especialidad;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOEspecialidad {
    private final String seleccionarEsp = "SELECT * FROM ESPECIALIDAD ORDER BY ID_ESPECIALIDAD";
    private final String ultimoId = "SELECT MAX(ID_ESPECIALIDAD) ultimo_id FROM ESPECIALIDAD";
    private final String insertarEsp = "INSERT INTO ESPECIALIDAD VALUES(?,UPPER(?))";
    private final String eliminarEsp = "DELETE FROM ESPECIALIDAD WHERE ID_ESPECIALIDAD = ?";
    private final String actualizarEsp = "UPDATE ESPECIALIDAD SET NOMBRE_ESPECIALIDAD = UPPER(?) WHERE ID_ESPECIALIDAD = ?";
    private final Conexion conn = Conexion.InstanciaConn();
    private ResultSet rs;
    
    public ArrayList<Especialidad> listarEspecialidades () {
        ArrayList<Especialidad> lista = new ArrayList<>();
        
        try {           
            PreparedStatement ps = conn.getConn().prepareStatement(seleccionarEsp);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                
                int id_especialidad = rs.getInt("ID_ESPECIALIDAD");
                String nombreEspecialidad = rs.getString("NOMBRE_ESPECIALIDAD");
                
                Especialidad esp = new Especialidad(id_especialidad, nombreEspecialidad);
                lista.add(esp);
                
            }
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int nextID () {
        
        try {
            int id = 0;
            PreparedStatement ps = conn.getConn().prepareStatement(ultimoId);
            rs = ps.executeQuery();
            
            return rs.next() ? rs.getInt("ultimo_id") + 1 : 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }       
    }
    
    public boolean agregarEspecialidad(Especialidad esp) {
        
        try {
            PreparedStatement ps = conn.getConn().prepareStatement(insertarEsp);
            ps.setInt(1, esp.getIdEspecialidad());
            ps.setString(2, esp.getNombreEspecialidad());
            ps.executeQuery();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public boolean actualizarEspecialidad (Especialidad esp) {
        
        try {
            PreparedStatement exist = conn.getConn().prepareStatement("SELECT * FROM ESPECIALIDAD WHERE ID_ESPECIALIDAD = ?");
            exist.setInt(1, esp.getIdEspecialidad());
            rs = exist.executeQuery();
            PreparedStatement ps = conn.getConn().prepareStatement(actualizarEsp);
            ps.setString(1, esp.getNombreEspecialidad());
            ps.setInt(2, esp.getIdEspecialidad());            
            
            if (rs.next()) {
                ps.execute();
                return true;                
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean eliminarEspecialidad (Especialidad esp) {
        
        try {
            PreparedStatement delete = conn.getConn().prepareStatement(eliminarEsp);
            PreparedStatement exist = conn.getConn().prepareStatement("SELECT * FROM ESPECIALIDAD WHERE ID_ESPECIALIDAD = ?");
            delete.setInt(1, esp.getIdEspecialidad());
            exist.setInt(1, esp.getIdEspecialidad());
            rs = exist.executeQuery();
            
            if (rs.next()) {
                delete.execute();
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }   
}
