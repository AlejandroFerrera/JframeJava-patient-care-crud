package cl.duoc.clinica.datos;

import cl.duoc.clinica.entidades.Atencion;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOAtencion {

    private final String seleccionarTodo = "SELECT A.ID_ATENCION, A.RUT_PACIENTE, A.NOMBRE_PACIENTE, EXTRACT(YEAR FROM SYSDATE) - EXTRACT(YEAR FROM A.FECHA_NACIMIENTO_PACIENTE) EDAD_PACIENTE, A.FECHA_NACIMIENTO_PACIENTE, A.ID_ESPECIALIDAD, ESP.NOMBRE_ESPECIALIDAD,A.ID_SISTEMA_SALUD, SS.NOMBRE_SISTEMA_SALUD  "
            + "                             FROM ATENCION A LEFT JOIN ESPECIALIDAD ESP ON(A.ID_ESPECIALIDAD = ESP.ID_ESPECIALIDAD) "
            + "                             LEFT JOIN SISTEMA_SALUD SS ON(A.ID_SISTEMA_SALUD = SS.ID_SISTEMA_SALUD)  "
            + "                             ORDER BY ID_ATENCION";

    private final String ultimoId = "SELECT MAX(ID_ATENCION) ULTIMO_ID FROM ATENCION";

    private final String insertarAtencion = "INSERT INTO ATENCION(ID_ATENCION, RUT_PACIENTE, NOMBRE_PACIENTE, FECHA_NACIMIENTO_PACIENTE, ID_ESPECIALIDAD, ID_SISTEMA_SALUD) "
            + "                              VALUES(?, ?, ?, ?, ?, ?)";

    private final String modificarAtencion = "UPDATE ATENCION SET RUT_PACIENTE = ?, "
            + "                                                   NOMBRE_PACIENTE = ?, "
            + "                                                   FECHA_NACIMIENTO_PACIENTE = ?,"
            + "                                                   ID_ESPECIALIDAD = ?, ID_SISTEMA_SALUD = ? "
            + "                               WHERE ID_ATENCION = ?";

    private final String eliminarAtencion = "DELETE FROM ATENCION WHERE ID_ATENCION = ?";

    private Conexion conn = Conexion.InstanciaConn();
    private ResultSet rs;

    public ArrayList<Atencion> listarAtenciones() {

        try {
            ArrayList<Atencion> lista = new ArrayList<>();
            PreparedStatement ps = conn.getConn().prepareStatement(seleccionarTodo);
            rs = ps.executeQuery();

            while (rs.next()) {

                int idAtencion = rs.getInt("ID_ATENCION");
                String rutPaciente = rs.getString("RUT_PACIENTE");
                String nombrePaciente = rs.getString("NOMBRE_PACIENTE");
                int edadPaciente = rs.getInt("EDAD_PACIENTE");
                Date fechaNacimento = rs.getDate("FECHA_NACIMIENTO_PACIENTE");
                int idEspecialidad = rs.getInt("ID_ESPECIALIDAD");
                String nombreEspecialidad = rs.getString("NOMBRE_ESPECIALIDAD");
                int idSistemaSalud = rs.getInt("ID_SISTEMA_SALUD");
                String nombreSistemaSalud = rs.getString("NOMBRE_SISTEMA_SALUD");

                Atencion at = new Atencion(idAtencion, rutPaciente, nombrePaciente, edadPaciente, fechaNacimento, idEspecialidad, nombreEspecialidad, idSistemaSalud, nombreSistemaSalud);
                lista.add(at);

            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(DAOAtencion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int nextId() {

        try {
            int id = 0;
            PreparedStatement ps = conn.getConn().prepareStatement(ultimoId);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("ULTIMO_ID") + 1;
                return id;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAtencion.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }
    public boolean insertarAtencion(Atencion at) {
        try {
            
            java.sql.Date fechaNacimiento = new java.sql.Date(at.getFechaNacimientoPaciente().getTime());
            
            PreparedStatement ps = conn.getConn().prepareStatement(insertarAtencion);
            ps.setInt(1, at.getIdAtencion());
            ps.setString(2, at.getRutPaciente());
            ps.setString(3, at.getNombrePaciente());
            ps.setDate(4, fechaNacimiento);
            ps.setInt(5, at.getIdEspecialidad());
            ps.setInt(6, at.getIdSistemaDeSalud());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOAtencion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean modificarAtencion (Atencion at) {
        try {
            
            java.sql.Date fechaNacimiento = new java.sql.Date(at.getFechaNacimientoPaciente().getTime());
            PreparedStatement exist = conn.getConn().prepareStatement("SELECT * FROM ATENCION WHERE ID_ATENCION = ?");
            exist.setInt(1, at.getIdAtencion());
            rs = exist.executeQuery();
            if (rs.next()) {
                PreparedStatement ps = conn.getConn().prepareStatement(modificarAtencion);
                ps.setString(1, at.getRutPaciente());
                ps.setString(2, at.getNombrePaciente());
                ps.setDate(3, fechaNacimiento);
                ps.setInt(4, at.getIdEspecialidad());
                ps.setInt(5, at.getIdSistemaDeSalud());
                ps.setInt(6, at.getIdAtencion());
                ps.execute();
                return true;
            } else {
                return false;
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(DAOAtencion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }       
    }
    
    public boolean eliminarAtencion (Atencion at) {
        try {
            PreparedStatement ps = conn.getConn().prepareStatement(eliminarAtencion);
            PreparedStatement exist = conn.getConn().prepareStatement("SELECT * FROM ATENCION WHERE ID_ATENCION = ?");
            exist.setInt(1, at.getIdAtencion());
            rs = exist.executeQuery();
            
            if (rs.next()) {
                ps.setInt(1, at.getIdAtencion());
                ps.execute();
            return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOAtencion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
