
package proyectobasesdatos;

/**
 *
 * @author alumnogreibd
 */
public class Hostelero {
    
    private String DNI, nombre, direccion;
    private float salario;
    private String telefono, fechaInicio, fechaNacimiento, nombreEstablecimiento;

    public Hostelero(String DNI, String nombre, String direccion, float salario, String telefono, String fechaInicio, String fechaNacimiento, String nombreEstablecimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.salario = salario;
        this.telefono = telefono;
        this.fechaInicio = fechaInicio;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public float getSalario() {
        return salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }
    
    

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }
    
    
    
    
    
}
