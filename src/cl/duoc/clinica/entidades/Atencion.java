
package cl.duoc.clinica.entidades;

import java.util.Date;

public class Atencion {
    private int idAtencion;
    private String rutPaciente;
    private String nombrePaciente;
    private int edadPaciente;
    private Date fechaNacimientoPaciente;
    private int idEspecialidad;
    private String EspecialidadPaciente;
    private int idSistemaDeSalud;
    private String SistemaDeSaludPaciente;

    public Atencion() {
    }

    public Atencion(int idAtencion, String rutPaciente, String nombrePaciente, int edadPaciente, Date fechaNacimientoPaciente, int idEspecialidad, String EspecialidadPaciente, int idSistemaDeSalud, String SistemaDeSaludPaciente) {
        this.idAtencion = idAtencion;
        this.rutPaciente = rutPaciente;
        this.nombrePaciente = nombrePaciente;
        this.edadPaciente = edadPaciente;
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
        this.idEspecialidad = idEspecialidad;
        this.EspecialidadPaciente = EspecialidadPaciente;
        this.idSistemaDeSalud = idSistemaDeSalud;
        this.SistemaDeSaludPaciente = SistemaDeSaludPaciente;
    }

    public int getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(int idAtencion) {
        this.idAtencion = idAtencion;
    }

    public String getRutPaciente() {
        return rutPaciente;
    }

    public void setRutPaciente(String rutPaciente) {
        this.rutPaciente = rutPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public Date getFechaNacimientoPaciente() {
        return fechaNacimientoPaciente;
    }

    public void setFechaNacimientoPaciente(Date fechaNacimientoPaciente) {
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getEspecialidadPaciente() {
        return EspecialidadPaciente;
    }

    public void setEspecialidadPaciente(String EspecialidadPaciente) {
        this.EspecialidadPaciente = EspecialidadPaciente;
    }

    public int getIdSistemaDeSalud() {
        return idSistemaDeSalud;
    }

    public void setIdSistemaDeSalud(int idSistemaDeSalud) {
        this.idSistemaDeSalud = idSistemaDeSalud;
    }

    public String getSistemaDeSaludPaciente() {
        return SistemaDeSaludPaciente;
    }

    public void setSistemaDeSaludPaciente(String SistemaDeSaludPaciente) {
        this.SistemaDeSaludPaciente = SistemaDeSaludPaciente;
    }

    @Override
    public String toString() {
        return "Atencion{" + "idAtencion=" + idAtencion + ", rutPaciente=" + rutPaciente + ", nombrePaciente=" + nombrePaciente + ", edadPaciente=" + edadPaciente + ", fechaNacimientoPaciente=" + fechaNacimientoPaciente + ", idEspecialidad=" + idEspecialidad + ", EspecialidadPaciente=" + EspecialidadPaciente + ", idSistemaDeSalud=" + idSistemaDeSalud + ", SistemaDeSaludPaciente=" + SistemaDeSaludPaciente + '}';
    }

    
    
    
}
