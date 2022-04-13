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

    public void anhadirTrabajadorAtraEsp(String dni, String nombre, String direccion, String telefono, Date fechaInicio, Date fechaNacimiento, String atraccion, String espectaculo) throws SQLException {
        PreparedStatement stmTrabajador = null;
        stmTrabajador = conexion.prepareStatement("INSERT INTO trabajadoresparque (dni,nombre,direccion,telefono,fechainicio,fechanacimiento,nombreatraccion,nombreespectaculo,salario) values(?,?,?,?,?,?,?,?,?)");
        stmTrabajador.setString(1, dni);
        stmTrabajador.setString(2, nombre);
        stmTrabajador.setString(3, direccion);
        stmTrabajador.setString(4, telefono);
        stmTrabajador.setDate(5, fechaInicio);
        stmTrabajador.setDate(6, fechaNacimiento);
        stmTrabajador.setString(7, atraccion);
        stmTrabajador.setString(8, espectaculo);
         stmTrabajador.setInt(9, 2);
        stmTrabajador.executeUpdate();
        stmTrabajador.close();

    }
    public void anhadirTrabajadorAtra(String dni, String nombre, String direccion, String telefono, Date fechaInicio, Date fechaNacimiento, String atraccion) throws SQLException {
        PreparedStatement stmTrabajador = null;
        stmTrabajador = conexion.prepareStatement("INSERT INTO trabajadoresparque (dni,nombre,direccion,telefono,fechainicio,fechanacimiento,nombreatraccion,salario) values(?,?,?,?,?,?,?,?)");
        stmTrabajador.setString(1, dni);
        stmTrabajador.setString(2, nombre);
        stmTrabajador.setString(3, direccion);
        stmTrabajador.setString(4, telefono);
        stmTrabajador.setDate(5, fechaInicio);
        stmTrabajador.setDate(6, fechaNacimiento);
        stmTrabajador.setString(7,atraccion);      
         stmTrabajador.setInt(8, 2);
        stmTrabajador.executeUpdate();
        stmTrabajador.close();

    }
    public void anhadirTrabajadorEsp(String dni, String nombre, String direccion, String telefono, Date fechaInicio, Date fechaNacimiento,  String espectaculo) throws SQLException {
        PreparedStatement stmTrabajador = null;
        stmTrabajador = conexion.prepareStatement("INSERT INTO trabajadoresparque (dni,nombre,direccion,telefono,fechainicio,fechanacimiento,nombreespectaculo,salario) values(?,?,?,?,?,?,?,?)");
        stmTrabajador.setString(1, dni);
        stmTrabajador.setString(2, nombre);
        stmTrabajador.setString(3, direccion);
        stmTrabajador.setString(4, telefono);
        stmTrabajador.setDate(5, fechaInicio);
        stmTrabajador.setDate(6, fechaNacimiento);     
        stmTrabajador.setString(7, espectaculo);
         stmTrabajador.setInt(8, 2);
        stmTrabajador.executeUpdate();
        stmTrabajador.close();

    }
    public void anhadirTrabajador(String dni, String nombre, String direccion, String telefono, Date fechaInicio, Date fechaNacimiento) throws SQLException {
        PreparedStatement stmTrabajador = null;
        stmTrabajador = conexion.prepareStatement("INSERT INTO trabajadoresparque (dni,nombre,direccion,telefono,fechainicio,fechanacimiento,salario) values(?,?,?,?,?,?,?)");
        stmTrabajador.setString(1, dni);
        stmTrabajador.setString(2, nombre);
        stmTrabajador.setString(3, direccion);
        stmTrabajador.setString(4, telefono);
        stmTrabajador.setDate(5, fechaInicio);
        stmTrabajador.setDate(6, fechaNacimiento);       
         stmTrabajador.setInt(7, 2);
        stmTrabajador.executeUpdate();
        stmTrabajador.close();

    }
    public ArrayList<Trabajador> getTrabajadores() {
        Trabajador trabajador;
        ArrayList<Trabajador> resultado = new ArrayList<>();
        ResultSet rsTrabajadores;
        PreparedStatement stmTrabajadores = null;
        try {
            stmTrabajadores = conexion.prepareStatement("select * from trabajadoresparque");
            rsTrabajadores = stmTrabajadores.executeQuery();
            while (rsTrabajadores.next()) {
                trabajador = new Trabajador(rsTrabajadores.getString("dni"), rsTrabajadores.getString("nombre"), rsTrabajadores.getString("direccion"), rsTrabajadores.getFloat("salario"), rsTrabajadores.getString("telefono"), rsTrabajadores.getString("fechainicio"), rsTrabajadores.getString("fechanacimiento"), rsTrabajadores.getString("nombreatraccion"),rsTrabajadores.getString("nombreespectaculo"));
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
}
