/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.clinica.entidades;

public class Especialidad {
    private int idEspecialidad;
    private String nombreEspecialidad;

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String nombreEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "idEspecialidad=" + idEspecialidad + ", nombreEspecialidad=" + nombreEspecialidad + '}';
    }
    
    
}
