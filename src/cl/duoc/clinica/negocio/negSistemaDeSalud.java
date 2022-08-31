
package cl.duoc.clinica.negocio;

import cl.duoc.clinica.datos.DAOSistemaDeSalud;
import cl.duoc.clinica.entidades.SistemaDeSalud;
import java.util.ArrayList;

public class negSistemaDeSalud {
    DAOSistemaDeSalud datSistema = new DAOSistemaDeSalud();
    
    public ArrayList<SistemaDeSalud> listarTodo () {
        return datSistema.listarSistemas();
    }
}
