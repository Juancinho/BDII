/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectobasesdatos.Hostelero;

/**
 *
 * @author alumnogreibd
 */
public class HostelerosDAO {

    private java.sql.Connection conexion;

    public HostelerosDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void anhadirHostelero(String dni, String nombre, String direccion, String telefono, Date fechaInicio, Date fechaNacimiento, String restaurante, float salario) throws SQLException {
        PreparedStatement stmTrabajador = null;
        stmTrabajador = conexion.prepareStatement("INSERT INTO hosteleros (dni,nombre,direccion,telefono,fechainicio,fechanacimiento,nombreestablecimiento,salario) values(?,?,?,?,?,?,?,?)");
        stmTrabajador.setString(1, dni);
        stmTrabajador.setString(2, nombre);
        stmTrabajador.setString(3, direccion);
        stmTrabajador.setString(4, telefono);
        stmTrabajador.setDate(5, fechaInicio);
        stmTrabajador.setDate(6, fechaNacimiento);
        stmTrabajador.setString(7, restaurante);
        stmTrabajador.setFloat(8, salario);
        stmTrabajador.executeUpdate();
        stmTrabajador.close();

    }

    public ArrayList<Hostelero> getHosteleros() {
        Hostelero hostelero;
        ArrayList<Hostelero> resultado = new ArrayList<>();
        ResultSet rsHosteleros;
        PreparedStatement stmHosteleros = null;
        try {
            stmHosteleros = conexion.prepareStatement("select * from hosteleros order by fechainicio");
            rsHosteleros = stmHosteleros.executeQuery();
            while (rsHosteleros.next()) {
                hostelero = new Hostelero(rsHosteleros.getString("dni"), rsHosteleros.getString("nombre"), rsHosteleros.getString("direccion"), rsHosteleros.getFloat("salario"), rsHosteleros.getString("telefono"), rsHosteleros.getString("fechainicio"), rsHosteleros.getString("fechanacimiento"), rsHosteleros.getString("nombreestablecimiento"));
                resultado.add(hostelero);
            }

        } catch (SQLException ex) {
            Logger.getLogger(HostelerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public void despedirHostelero(String dni) {

        PreparedStatement stmHosteleros = null;
        try {
            stmHosteleros = conexion.prepareStatement("DELETE from hosteleros where dni = ?");
            stmHosteleros.setString(1, dni);
            stmHosteleros.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HostelerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getHostelerosRecientes() {

        PreparedStatement stmHosteleros = null;
        ResultSet rsHosteleros;
        String reciente = "";
        try {
            stmHosteleros = conexion.prepareStatement("	select dni from hosteleros t where fechainicio >=all(select fechainicio from hosteleros)order by salario desc limit 1");
            rsHosteleros = stmHosteleros.executeQuery();
            while (rsHosteleros.next()) {
                reciente = rsHosteleros.getString("dni");

            }
        } catch (SQLException ex) {
            Logger.getLogger(HostelerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reciente;
    }

}
