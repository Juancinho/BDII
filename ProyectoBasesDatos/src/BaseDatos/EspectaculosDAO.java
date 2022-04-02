
package BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import proyectobasesdatos.Espectaculo;
import proyectobasesdatos.Asistir;
/**
 *
 * @author alumnogreibd
 */
public class EspectaculosDAO {

    private final java.sql.Connection conexion;

    public EspectaculosDAO(Connection conexion) { //MANOTE: Para quien se encargue de la interfaz, aquí quizás falta una fachada
        this.conexion = conexion;
    }
    
    public Espectaculo datosBasicosEspectaculo(String nombreEspectaculo) {  //FU4  

        Espectaculo espectaculo = null;

        ResultSet rsEspectaculos;
        PreparedStatement stmEspectaculos = null;

        try {
            stmEspectaculos = conexion.prepareStatement("SELECT activo, nombre, horaInicio, horaFin, tematica, descripcion, ubicacion FROM espectaculos WHERE  nombre = ?");
            stmEspectaculos.setString(1, nombreEspectaculo);
            rsEspectaculos = stmEspectaculos.executeQuery();

            espectaculo = new Espectaculo(rsEspectaculos.getString("activo"), rsEspectaculos.getString("nombre"), rsEspectaculos.getString("horaInicio"), rsEspectaculos.getString("horaFin"),  rsEspectaculos.getString("tematica"),  rsEspectaculos.getString("descripcion"),  rsEspectaculos.getString("ubicacion"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmEspectaculos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return espectaculo;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
    }
    
    
    
    


    
    /*
    public ResultSet espectaculoMasPopularPorAnho(String anho) {  //FU3    //MANOTE: Nota importante: este método devuelve un resultset (que es u¡como una tabla de SQL) que solo tiene una fila. Lo he hehco así porque no sé cómo quiere el que hace la interfaz que se le pase esto (un arraylist de arralist sería una opción -nótese que son datos String, String, Integer- algo enrevesada). Lo he puesto así en un primer momento pero tiene que mirarse esto 
        //Nótese que no puedo devolver tampoco un espectáculo porque dicha clase no tiene un campo que se corresponda con un count

        //No sé si tendria sentido hacer comprobaciones aquí sobre el año
        ResultSet rsConsultaEspectaculo = null;
        PreparedStatement stmEspectaculo = null;
        String inicioAnho = anho + "-01" + "-01";   //MANOTE: hay que comporbar que esto funcione bien!!!
        String finAnho = anho + "-12" + "-31";

        try {
            stmEspectaculo = conexion.prepareStatement("SELECT e.nombre, e.horaInicio, count(e.nombre) as asistencia"
                    + "FROM espectaculos e, asistir a"
                    + "WHERE e.nombre = a.espectaculo "
                    + "AND  a.fecha >= ?"
                    + "AND a.fecha <=,?"
                    + "GROUP BY e.nombre"
                    + "HAVING count(e.nombre) >= all (SELECT count(e.nombre) "
                    + "FROM espectaculos e, asistir a "
                    + "WHERE e.nombre = a.espectaculo "
                    + "AND a.fecha >= ?"
                    + "AND a.fecha <= ?"
                    + "GROUP BY  e.nombre)"
                    + "LIMIT 1");

            stmEspectaculo.setDate(1, java.sql.Date.valueOf(inicioAnho));
            stmEspectaculo.setDate(2, java.sql.Date.valueOf(finAnho));
            stmEspectaculo.setDate(3, java.sql.Date.valueOf(inicioAnho));
            stmEspectaculo.setDate(4, java.sql.Date.valueOf(finAnho));
            rsConsultaEspectaculo = stmEspectaculo.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmEspectaculo.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return rsConsultaEspectaculo;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado

    }
    */
    
    
    
    
    public ArrayList<Asistir> espectaculoMasPopularPorAnho(String anho) {  //FU3    //MANOTE: Nota importante: este método devuelve un resultset (que es u¡como una tabla de SQL) que solo tiene una fila. Lo he hehco así porque no sé cómo quiere el que hace la interfaz que se le pase esto (un arraylist de arralist sería una opción -nótese que son datos String, String, Integer- algo enrevesada). Lo he puesto así en un primer momento pero tiene que mirarse esto 
        //Nótese que no puedo devolver tampoco un espectáculo porque dicha clase no tiene un campo que se corresponda con un count

        //No sé si tendria sentido hacer comprobaciones aquí sobre el año
        
        ArrayList<Asistir> resultado = new java.util.ArrayList<>();
        ResultSet rsConsultaEspectaculo = null;
        PreparedStatement stmEspectaculo = null;
        String inicioAnho = anho + "-01" + "-01";   //MANOTE: hay que comporbar que esto funcione bien!!!
        String finAnho = anho + "-12" + "-31";
        Asistir asistencia;
        System.out.println("HOLA");
        try {
            stmEspectaculo = conexion.prepareStatement("SELECT e.nombre, e.horaInicio, count(e.nombre) as asistencia FROM espectaculos e, asistir a WHERE e.nombre = a.espectaculo AND  a.fecha >= ? AND a.fecha <=? GROUP BY e.nombre HAVING count(e.nombre) >= all (SELECT count(e.nombre)  FROM espectaculos e, asistir a  WHERE e.nombre = a.espectaculo  AND a.fecha >= ? AND a.fecha <= ? GROUP BY  e.nombre) LIMIT 1");

            stmEspectaculo.setDate(1, java.sql.Date.valueOf(inicioAnho));
            stmEspectaculo.setDate(2, java.sql.Date.valueOf(finAnho));
            stmEspectaculo.setDate(3, java.sql.Date.valueOf(inicioAnho));
            stmEspectaculo.setDate(4, java.sql.Date.valueOf(finAnho));
            rsConsultaEspectaculo = stmEspectaculo.executeQuery();
            while (rsConsultaEspectaculo.next()) {
               
                asistencia = new Asistir(rsConsultaEspectaculo.getString("nombre"),rsConsultaEspectaculo.getString("horaInicio"), rsConsultaEspectaculo.getInt("asistencia"));
                System.out.println(asistencia.getNombre());
                resultado.add(asistencia);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmEspectaculo.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;   

    }
    
}
