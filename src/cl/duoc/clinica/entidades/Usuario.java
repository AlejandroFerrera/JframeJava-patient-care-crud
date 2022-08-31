
package cl.duoc.clinica.entidades;

public class Usuario {
    private int id_usuario;
    private String loginUsuario;
    private String contrasenaUsuario;

    public Usuario() {        
    }

    public Usuario(int id_usuario, String loginUsuario, String contrasenaUsuario) {
        this.id_usuario = id_usuario;
        this.loginUsuario = loginUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
    }
    
    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", loginUsuario=" + loginUsuario + ", contrasenaUsuario=" + contrasenaUsuario + '}';
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
    
}
