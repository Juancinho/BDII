/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectobasesdatos.Trabajador;

/**
 *
 * @author alumnogreibd
 */
public class TrabajadoresDAO {

    private java.sql.Connection conexion;

    public TrabajadoresDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void anhadirTrabajadorAtraEsp(String dni, String nombre, String direccion, String telefono,  Date fechaNacimiento, String atraccion, String espectaculo, float salario) throws SQLException {
        PreparedStatement stmTrabajador = null;
        stmTrabajador = conexion.prepareStatement("INSERT INTO trabajadoresparque (dni,nombre,direccion,telefono,fechainicio,fechanacimiento,nombreatraccion,nombreespectaculo,salario) values(?,?,?,?,now(),?,?,?,?)");
        stmTrabajador.setString(1, dni);
        stmTrabajador.setString(2, nombre);
        stmTrabajador.setString(3, direccion);
        stmTrabajador.setString(4, telefono);
        stmTrabajador.setDate(5, fechaNacimiento);
        stmTrabajador.setString(6, atraccion);
        stmTrabajador.setString(7, espectaculo);
        stmTrabajador.setFloat(8, salario);
        stmTrabajador.executeUpdate();
        stmTrabajador.close();

    }

    public void anhadirTrabajadorAtra(String dni, String nombre, String direccion, String telefono,  Date fechaNacimiento, String atraccion, float salario) throws SQLException {
        PreparedStatement stmTrabajador = null;
        stmTrabajador = conexion.prepareStatement("INSERT INTO trabajadoresparque (dni,nombre,direccion,telefono,fechainicio,fechanacimiento,nombreatraccion,salario) values(?,?,?,?,now(),?,?,?)");
        stmTrabajador.setString(1, dni);
        stmTrabajador.setString(2, nombre);
        stmTrabajador.setString(3, direccion);
        stmTrabajador.setString(4, telefono);
        stmTrabajador.setDate(5, fechaNacimiento);
        stmTrabajador.setString(6, atraccion);
        stmTrabajador.setFloat(7, salario);
        stmTrabajador.executeUpdate();
        stmTrabajador.close();

    }

    public void anhadirTrabajadorEsp(String dni, String nombre, String direccion, String telefono,  Date fechaNacimiento, String espectaculo, float salario) throws SQLException {
        PreparedStatement stmTrabajador = null;
        stmTrabajador = conexion.prepareStatement("INSERT INTO trabajadoresparque (dni,nombre,direccion,telefono,fechainicio,fechanacimiento,nombreespectaculo,salario) values(?,?,?,?,now(),?,?,?)");
        stmTrabajador.setString(1, dni);
        stmTrabajador.setString(2, nombre);
        stmTrabajador.setString(3, direccion);
        stmTrabajador.setString(4, telefono);     
        stmTrabajador.setDate(5, fechaNacimiento);
        stmTrabajador.setString(6, espectaculo);
        stmTrabajador.setFloat(7, salario);
        stmTrabajador.executeUpdate();
        stmTrabajador.close();

    }

    public void anhadirTrabajador(String dni, String nombre, String direccion, String telefono,  Date fechaNacimiento, float salario) throws SQLException {
        PreparedStatement stmTrabajador = null;
        stmTrabajador = conexion.prepareStatement("INSERT INTO trabajadoresparque (dni,nombre,direccion,telefono,fechainicio,fechanacimiento,salario) values(?,?,?,?,now(),?,?)");
        stmTrabajador.setString(1, dni);
        stmTrabajador.setString(2, nombre);
        stmTrabajador.setString(3, direccion);
        stmTrabajador.setString(4, telefono);        
        stmTrabajador.setDate(5, fechaNacimiento);
        stmTrabajador.setFloat(6, salario);
        stmTrabajador.executeUpdate();
        stmTrabajador.close();

    }

    public ArrayList<Trabajador> getTrabajadores() {
        Trabajador trabajador;
        ArrayList<Trabajador> resultado = new ArrayList<>();
        ResultSet rsTrabajadores;
        PreparedStatement stmTrabajadores = null;
        try {
            stmTrabajadores = conexion.prepareStatement("select * from trabajadoresparque order by fechainicio");
            rsTrabajadores = stmTrabajadores.executeQuery();
            while (rsTrabajadores.next()) {
                trabajador = new Trabajador(rsTrabajadores.getString("dni"), rsTrabajadores.getString("nombre"), rsTrabajadores.getString("direccion"), rsTrabajadores.getFloat("salario"), rsTrabajadores.getString("telefono"), rsTrabajadores.getString("fechainicio"), rsTrabajadores.getString("fechanacimiento"), rsTrabajadores.getString("nombreatraccion"), rsTrabajadores.getString("nombreespectaculo"));
                resultado.add(trabajador);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TrabajadoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public void despedirTrabajador(String dni) {

        PreparedStatement stmTrabajadores = null;
        try {
            stmTrabajadores = conexion.prepareStatement("DELETE from trabajadoresparque where dni = ?");
            stmTrabajadores.setString(1, dni);
            stmTrabajadores.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HostelerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getTrabajadoresRecientes() {

        PreparedStatement stmTrabajadores = null;
        ResultSet rsTrabajadores;
        String reciente = "";
        try {
            stmTrabajadores = conexion.prepareStatement("select dni from trabajadoresparque t where fechainicio >=all(select fechainicio from trabajadoresparque)order by salario desc limit 1");
            rsTrabajadores = stmTrabajadores.executeQuery();
            while (rsTrabajadores.next()) {
                reciente = rsTrabajadores.getString("dni");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HostelerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reciente;
    }

    public String getAtraccionMenosTrabajadores() {

        String resultado = null;
        ResultSet rsTrabajadores;
        PreparedStatement stmTrabajadores = null;
        try {
            stmTrabajadores = conexion.prepareStatement("select count(nombre),nombreatraccion from trabajadoresparque \n"
                    + "where nombreatraccion is not null\n"
                    + "group by nombreatraccion\n"
                    + "order by count asc \n"
                    + " limit 1");
            rsTrabajadores = stmTrabajadores.executeQuery();
            while (rsTrabajadores.next()) {
                resultado = rsTrabajadores.getString("nombreatraccion");
                //System.out.println(resultado);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TrabajadoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }
    public String AnhadirAdmin(String dni, String nombre, String direccion, String telefono, java.sql.Date nacimiento, float sueldo) {
        String clave=null;
        PreparedStatement stmTrabajador = null;
        try{
            conexion.setAutoCommit(false);
            anhadirTrabajador(dni, nombre, direccion, telefono, nacimiento, sueldo);
            stmTrabajador = conexion.prepareStatement("INSERT INTO usuarios(dni,clave,tipousuario) values(?,?,?)");
            stmTrabajador.setString(1, dni);
            clave = crearContraseña(dni);
            stmTrabajador.setString(2, clave);
            stmTrabajador.setString(3, "Administrador");
            stmTrabajador.executeUpdate();
            stmTrabajador.close();
            conexion.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            if (conexion != null) {
                try {
                    System.out.println("Se procede a abortar la transacción");
                    conexion.rollback();
                } catch (SQLException excep) {
                    System.out.println(excep.getMessage());
                }
            }
        }
        return clave;
    }
    
    public String crearContraseña(String dni){
        String clave = "";
 
	for (int i = 0; i < 5; i++) {
            clave+=(dni.charAt((int)(Math.random() * dni.length())));
	}
 
	return clave;
    }
}
