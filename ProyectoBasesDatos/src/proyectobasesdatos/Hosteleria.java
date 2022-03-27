
package proyectobasesdatos;

/**
 *
 * @author alumnogreibd
 */
public class Hosteleria {
    private String nombreEstablecimiento, ubicacion;
    private int aforo;
    private String horaInicio, horaFin;

    public Hosteleria(String nombreEstablecimiento, String ubicacion, int aforo, String horaInicio, String horaFin) {
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.ubicacion = ubicacion;
        this.aforo = aforo;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getAforo() {
        return aforo;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }


    
    
    
    
    
}
