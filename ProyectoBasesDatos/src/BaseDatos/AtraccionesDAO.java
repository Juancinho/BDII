package BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import proyectobasesdatos.Atraccion;

/**
 *
 * @author alumnogreibd
 */
public class AtraccionesDAO {

    private java.sql.Connection conexion;

    public AtraccionesDAO(Connection conexion) {
        this.conexion = conexion;
    }
    
    public ArrayList<String> atraccionesActivas() {
        ArrayList<String> resultado = new java.util.ArrayList<>();

        ResultSet rsAtracciones;
        PreparedStatement stmAtracciones = null;

        try {
            stmAtracciones = conexion.prepareStatement("SELECT nombre FROM atracciones"); 
            rsAtracciones = stmAtracciones.executeQuery();
            while (rsAtracciones.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                resultado.add(rsAtracciones.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmAtracciones.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
    
    
    

    public java.util.List<Atraccion> consultarAtraccion(String nombre) {
        java.util.List<Atraccion> resultado = new java.util.ArrayList<>();
        Atraccion atraccionActual;

        ResultSet rsAtracciones;
        PreparedStatement stmAtracciones = null;

        String consulta = "select nombre, aforo, alturamin, ubicacion,descripcion "
                + " from atracciones "
                + " where nombre like ? ";

        try {
            stmAtracciones = conexion.prepareStatement(consulta);
            stmAtracciones.setString(1, "%" + nombre + "%");
            rsAtracciones = stmAtracciones.executeQuery();
            while (rsAtracciones.next()) {
                atraccionActual = new Atraccion(rsAtracciones.getString("nombre"), rsAtracciones.getInt("aforo"), rsAtracciones.getInt("alturamin"), rsAtracciones.getString("ubicacion"), rsAtracciones.getString("descripcion"));
                resultado.add(atraccionActual);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    /*public java.util.List<Atraccion> consultarAtraccionPorAltura(String nombre, int alturaMin) {
        java.util.List<Atraccion> resultado = new java.util.ArrayList<>();
        Atraccion atraccionActual;

        ResultSet rsAtracciones;
        PreparedStatement stmAtracciones = null;

        String consulta = "select nombre, aforo, alturamin, ubicacion,descripcion "
                + " from atracciones "
                + " where nombre like ? "
                + " and alturamin <= ?";

        try {
            stmAtracciones = conexion.prepareStatement(consulta);
            stmAtracciones.setString(1, "%" + nombre + "%");
            stmAtracciones.setInt(2, alturaMin);
            rsAtracciones = stmAtracciones.executeQuery();
            while (rsAtracciones.next()) {
                atraccionActual = new Atraccion(rsAtracciones.getString("nombre"), rsAtracciones.getInt("aforo"), rsAtracciones.getInt("alturamin"), rsAtracciones.getString("ubicacion"), rsAtracciones.getString("descripcion"));
                resultado.add(atraccionActual);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }*/
    public ArrayList<Atraccion> consultarAtraccionAltura(int alturaMin) {  //FU2  

        ArrayList<Atraccion> resultado = new java.util.ArrayList<>();
        Atraccion atraccionActual;

        ResultSet rsAtracciones;
        PreparedStatement stmAtracciones = null;

        try {
            stmAtracciones = conexion.prepareStatement("SELECT nombre, ubicacion, aforo, alturaMin, ubicacion, descripcion FROM atracciones WHERE alturaMin <= ?"); //MANOTE: quizás sea mejor no mostrar todo, lo pongo ahora por simplicidad, luego se habla y se modifica si se ve bien
            stmAtracciones.setInt(1, alturaMin);
            rsAtracciones = stmAtracciones.executeQuery();
            while (rsAtracciones.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                atraccionActual = new Atraccion(rsAtracciones.getString("nombre"), rsAtracciones.getInt("aforo"), rsAtracciones.getInt("alturamin"), rsAtracciones.getString("ubicacion"), rsAtracciones.getString("descripcion"));
                resultado.add(atraccionActual);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmAtracciones.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
    }

    public Atraccion datosBasicosAtraccion(String nombreAtraccion) {  //FU4  

        Atraccion atraccion = null;

        ResultSet rsAtracciones;
        PreparedStatement stmAtracciones = null;

        try {
            stmAtracciones = conexion.prepareStatement("SELECT nombre, aforo, alturaMin, ubicacion, descripcion FROM atracciones WHERE nombre = ?");
            stmAtracciones.setString(1, nombreAtraccion);
            rsAtracciones = stmAtracciones.executeQuery();

            atraccion = new Atraccion(rsAtracciones.getString("nombre"), rsAtracciones.getInt("aforo"), rsAtracciones.getInt("alturamin"), rsAtracciones.getString("ubicacion"), rsAtracciones.getString("descripcion"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmAtracciones.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return atraccion;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
    }
    

}
