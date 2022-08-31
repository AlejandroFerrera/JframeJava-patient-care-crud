
package cl.duoc.clinica.datos;

import cl.duoc.clinica.entidades.Usuario;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOUsuario {
    private String selectUsuario = "SELECT * FROM USUARIO WHERE LOGIN = ?";
    private Conexion conn = Conexion.InstanciaConn();
    private ResultSet rs;
    
    public Usuario buscaUsuario (String login) {
        
        try {
            Usuario usuario = new Usuario();
            PreparedStatement ps = conn.getConn().prepareStatement(selectUsuario);
            ps.setString(1, login);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                usuario.setId_usuario(rs.getInt("ID_USUARIO"));
                usuario.setLoginUsuario(rs.getString("LOGIN"));
                usuario.setContrasenaUsuario(rs.getString("CONTRASENA"));
                return usuario;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
}
