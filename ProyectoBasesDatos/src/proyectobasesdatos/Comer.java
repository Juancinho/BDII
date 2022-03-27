/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobasesdatos;

/**
 *
 * @author alumnogreibd
 */
public class Comer {
    private String fecha, visitante, establecimiento;
    private float puntuacion;

    public Comer(String fecha, String visitante, String establecimiento, float puntuacion) {
        this.fecha = fecha;
        this.visitante = visitante;
        this.establecimiento = establecimiento;
        this.puntuacion = puntuacion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getVisitante() {
        return visitante;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    
    
    
    
}
