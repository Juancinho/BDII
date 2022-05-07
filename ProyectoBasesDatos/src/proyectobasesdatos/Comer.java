
package proyectobasesdatos;

/**
 *
 * @author alumnogreibd
 */
public class Comer {
    private String fecha, visitante, establecimiento;
    private Integer puntuacion;

    public Comer(String fecha, String visitante, String establecimiento, Integer puntuacion) {
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

    public Integer getPuntuacion() {
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

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

}
