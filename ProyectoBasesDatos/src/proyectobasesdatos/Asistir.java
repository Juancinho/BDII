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
    private String fecha, visitante, espectaculo;

    public Asistir(String fecha, String visitante, String espectaculo) {
        this.fecha = fecha;
        this.visitante = visitante;
        this.espectaculo = espectaculo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getVisitante() {
        return visitante;
    }

    public String getEspectaculo() {
        return espectaculo;
    }
    

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public void setEspectaculo(String espectaculo) {
        this.espectaculo = espectaculo;
    }
    
    
}
