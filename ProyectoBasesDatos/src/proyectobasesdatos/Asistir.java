/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobasesdatos;

/**
 *
 * @author alumnogreibd
 * Hola
 */
public class Asistir {
    private String nombre, horaInicio;
    private int asistencia;

    public Asistir(String nombre, String horaInicio, int asistencia) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.asistencia = asistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

   
    
    
}
