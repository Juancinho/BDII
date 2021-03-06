/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobasesdatos;

/**
 *
 * @author alumnogreibd
 */
public class Trabajador {
    private String DNI, nombre, direccion;
    private float salario;
    private String telefono, fechaInicio, fechaNacimiento, nombreAtraccion, nombreEspectaculo;

    public Trabajador(String DNI, String nombre, String direccion, float salario, String telefono, String fechaInicio, String fechaNacimiento, String nombreAtraccion, String nombreEspectaculo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.salario = salario;
        this.telefono = telefono;
        this.fechaInicio = fechaInicio;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreAtraccion = nombreAtraccion;
        this.nombreEspectaculo = nombreEspectaculo;
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

    public String getNombreAtraccion() {
        return nombreAtraccion;
    }

    public String getNombreEspectaculo() {
        return nombreEspectaculo;
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

    public void setNombreAtraccion(String nombreAtraccion) {
        this.nombreAtraccion = nombreAtraccion;
    }

    public void setNombreEspectaculo(String nombreEspectaculo) {
        this.nombreEspectaculo = nombreEspectaculo;
    }
    
    
    
}
