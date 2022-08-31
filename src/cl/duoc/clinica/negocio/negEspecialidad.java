
package cl.duoc.clinica.negocio;

import cl.duoc.clinica.datos.DAOEspecialidad;
import cl.duoc.clinica.entidades.Especialidad;
import java.util.ArrayList;

public class negEspecialidad {
    DAOEspecialidad datEspecialidad = new DAOEspecialidad();
    
    public ArrayList<Especialidad> listarTodo() {
        return datEspecialidad.listarEspecialidades();
    }
    
    public int nextId () {
        return datEspecialidad.nextID();
    }
    
    public boolean agregar (Especialidad esp) {
        return datEspecialidad.agregarEspecialidad(esp);
    }
    
    public boolean actualizar (Especialidad esp) {
        return datEspecialidad.actualizarEspecialidad(esp);
    }
    
    public boolean eliminar (Especialidad esp) {
        return datEspecialidad.eliminarEspecialidad(esp);
    }
}
