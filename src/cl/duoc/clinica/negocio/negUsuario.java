
package cl.duoc.clinica.negocio;

import cl.duoc.clinica.datos.DAOUsuario;
import cl.duoc.clinica.entidades.Usuario;

public class negUsuario {
    
    public boolean inicioSesion(String login, String pass) {
        
        DAOUsuario dao = new DAOUsuario(); 
        Usuario usuario = dao.buscaUsuario(login);
        
        return usuario == null ? false : usuario.getContrasenaUsuario().equals(pass);
    }
}
