/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import proyectobasesdatos.Usuario;
import proyectobasesdatos.TipoUsuario;
import java.sql.*;

/**
 *
 * @author basesdatos
 */
public class DAOUsuarios {

    private java.sql.Connection conexion;

    /*
   public DAOUsuarios (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
     */

    public DAOUsuarios(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean validarUsuario(String idUsuario, String clave, String tipo) {
        boolean resultado = false;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = conexion;

        try {
            stmUsuario = con.prepareStatement("select dni, clave, tipousuario "
                    + "from usuarios "
                    + "where dni = ? and clave = ? and tipousuario = ?");
            stmUsuario.setString(1, idUsuario);
            stmUsuario.setString(2, clave);
            stmUsuario.setString(3, tipo);
            rsUsuario = stmUsuario.executeQuery();
            if (rsUsuario.next()){
                    resultado=true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public void registrarUsuario(String DNI, String Nombre, String Nacionalidad, String correo, String contraseña, String telefono, java.sql.Date fecha) throws SQLException {

        Connection con;
        PreparedStatement stmUsuario = null;
        PreparedStatement stmUsuario1 = null;
        con = conexion;

        stmUsuario = con.prepareStatement("INSERT INTO visitantes(DNI, Nombre, Nacionalidad, correoelectronico, telefono, fechanacimiento)"
                + "VALUES (?, ?, ?, ?, ?, ?)");

        stmUsuario.setString(1, DNI);
        stmUsuario.setString(2, Nombre);
        stmUsuario.setString(3, Nacionalidad);
        stmUsuario.setString(4, correo);
        stmUsuario.setString(5, telefono);
        stmUsuario.setDate(6, fecha);
        stmUsuario.executeUpdate();

        stmUsuario1 = con.prepareStatement("INSERT INTO usuarios(DNI, clave, tipousuario)"
                + "VALUES (?, ?, ?)");

        stmUsuario1.setString(1, DNI);
        stmUsuario1.setString(2, contraseña);
        stmUsuario1.setString(3, "Normal");
        stmUsuario1.executeUpdate();

    }

    public boolean cambiarContraseña(String DNI, String contraseña) {
        boolean resultado = false;
        Connection con;
        PreparedStatement stmUsuario = null;
        con = conexion;

        try {
            stmUsuario = con.prepareStatement("UPDATE usuarios SET clave = ? WHERE dni = ? AND tipousuario = ?");
            stmUsuario.setString(1, contraseña);
            stmUsuario.setString(2, DNI);
            stmUsuario.setString(3, "Administrador");
            if (stmUsuario.executeUpdate()==1){
                    resultado=true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
}
