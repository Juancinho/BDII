/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobasesdatos;

/**
 *
 * @author alumnogreibd
 */
public class Ir {
    private String fechaVisita, VIP, visitante, atraccion;

    public Ir(String fechaVisita, String VIP, String visitante, String atraccion) {
        this.fechaVisita = fechaVisita;
        this.VIP = VIP;
        this.visitante = visitante;
        this.atraccion = atraccion;
    }

    public String getFechaVisita() {
        return fechaVisita;
    }

    public String getVIP() {
        return VIP;
    }

    public String getVisitante() {
        return visitante;
    }

    public String getAtraccion() {
        return atraccion;
    }

    
    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public void setAtraccion(String atraccion) {
        this.atraccion = atraccion;
    }
    
    
    
}
