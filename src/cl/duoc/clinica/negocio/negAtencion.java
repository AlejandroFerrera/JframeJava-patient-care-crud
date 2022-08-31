
package cl.duoc.clinica.negocio;

import cl.duoc.clinica.datos.DAOAtencion;
import cl.duoc.clinica.entidades.Atencion;
import java.util.ArrayList;

public class negAtencion {
    DAOAtencion dao = new DAOAtencion();
    
    public ArrayList<Atencion> listarAtenciones() {
        return dao.listarAtenciones();
    }
    
    public int nextId() {
        return dao.nextId();
    }
    
    public boolean agregarAtencion (Atencion at) {
        return dao.insertarAtencion(at);
    }
    
    public boolean modificarAtencion (Atencion at) {
        return dao.modificarAtencion(at);
    }
    
    public boolean eliminarAtencion (Atencion at) {
        return dao.eliminarAtencion(at);
    }
}
