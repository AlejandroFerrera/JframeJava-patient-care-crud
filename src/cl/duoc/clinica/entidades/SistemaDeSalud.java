
package cl.duoc.clinica.entidades;

public class SistemaDeSalud {
    private int idSistemaDeSalud;
    private String nombreSistemaDeSalud;

    public SistemaDeSalud() {
    }

    public SistemaDeSalud(int idSistemaDeSalud, String nombreSistemaDeSalud) {
        this.idSistemaDeSalud = idSistemaDeSalud;
        this.nombreSistemaDeSalud = nombreSistemaDeSalud;
    }

    public int getIdSistemaDeSalud() {
        return idSistemaDeSalud;
    }

    public void setIdSistemaDeSalud(int idSistemaDeSalud) {
        this.idSistemaDeSalud = idSistemaDeSalud;
    }

    public String getNombreSistemaDeSalud() {
        return nombreSistemaDeSalud;
    }

    public void setNombreSistemaDeSalud(String nombreSistemaDeSalud) {
        this.nombreSistemaDeSalud = nombreSistemaDeSalud;
    }

    @Override
    public String toString() {
        return "SistemaDeSalud{" + "idSistemaDeSalud=" + idSistemaDeSalud + ", nombreSistemaDeSalud=" + nombreSistemaDeSalud + '}';
    }
    
    
}
