
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

    public EspectaculosDAO(Connection conexion) {
        this.conexion = conexion;
    }
    
    
     public ArrayList<String> espectaculosActivos() {
        ArrayList<String> resultado = new java.util.ArrayList<>();

        ResultSet rsEspectaculos;
        PreparedStatement stmEspectaculos = null;

        try {
            stmEspectaculos = conexion.prepareStatement("SELECT nombre FROM espectaculos WHERE activo LIKE 'SI'"); 
            rsEspectaculos = stmEspectaculos.executeQuery();
            while (rsEspectaculos.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                resultado.add(rsEspectaculos.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmEspectaculos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
    public ArrayList<String> añosRegistrados() {
        ArrayList<String> resultado = new java.util.ArrayList<>();

        ResultSet rsAtracciones;
        PreparedStatement stmAtracciones = null;
        
        try {
            stmAtracciones = conexion.prepareStatement("select distinct (EXTRACT(YEAR FROM fecha)) as ano from asistir order by  ano asc;"); 
            rsAtracciones = stmAtracciones.executeQuery();
            while (rsAtracciones.next()) {  
                resultado.add(String.valueOf(rsAtracciones.getInt(1)));
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
    
    public  java.util.List<Espectaculo> datosBasicosEspectaculo(String nombreEspectaculo,String tematica) {  //FU4  
        java.util.List<Espectaculo> resultado = new java.util.ArrayList<>();
        Espectaculo espectaculo = null;

        ResultSet rsEspectaculos;
        PreparedStatement stmEspectaculos = null;

        try {
            stmEspectaculos = conexion.prepareStatement("SELECT nombre, horaInicio, horaFin, tematica, descripcion, ubicacion FROM espectaculos WHERE  activo = 'SI' AND nombre LIKE ? AND tematica LIKE ?");
            stmEspectaculos.setString(1, '%'+nombreEspectaculo+'%');
            stmEspectaculos.setString(2, '%'+tematica+'%');
            
            rsEspectaculos = stmEspectaculos.executeQuery();
            while(rsEspectaculos.next()){
            espectaculo = new Espectaculo(rsEspectaculos.getString("nombre"), rsEspectaculos.getString("horaInicio"), rsEspectaculos.getString("horaFin"),  rsEspectaculos.getString("tematica"),  rsEspectaculos.getString("descripcion"),  rsEspectaculos.getString("ubicacion"));
            resultado.add(espectaculo);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmEspectaculos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;  
    }
     
    
    public  java.util.List<Espectaculo> datosBasicosEspectaculoSinTematica(String nombreEspectaculo) {  //FU4  
        java.util.List<Espectaculo> resultado = new java.util.ArrayList<>();
        Espectaculo espectaculo = null;

        ResultSet rsEspectaculos;
        PreparedStatement stmEspectaculos = null;

        try {
            stmEspectaculos = conexion.prepareStatement("SELECT nombre, horaInicio, horaFin, tematica, descripcion, ubicacion FROM espectaculos WHERE  activo = 'SI' AND nombre LIKE ?");
            stmEspectaculos.setString(1, '%'+nombreEspectaculo+'%');
            
            rsEspectaculos = stmEspectaculos.executeQuery();
            while(rsEspectaculos.next()){
            espectaculo = new Espectaculo(rsEspectaculos.getString("nombre"), rsEspectaculos.getString("horaInicio"), rsEspectaculos.getString("horaFin"),  rsEspectaculos.getString("tematica"),  rsEspectaculos.getString("descripcion"),  rsEspectaculos.getString("ubicacion"));
            resultado.add(espectaculo);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmEspectaculos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
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
    
    
    
    public ArrayList<Asistir> espectaculoMasPopularPorAnho(String anho) {  //FU3    
        ArrayList<Asistir> resultado = new java.util.ArrayList<>();
        ResultSet rsConsultaEspectaculo;
        PreparedStatement stmEspectaculo = null;
        String inicioAnho = anho + "-01" + "-01";   
        String finAnho = anho + "-12" + "-31";
        
        try {
            stmEspectaculo = conexion.prepareStatement("SELECT e.nombre, e.horaInicio, count(e.nombre) as asistencia FROM espectaculos e, asistir a WHERE e.nombre = a.espectaculo AND  a.fecha >= ? AND a.fecha <=? GROUP BY e.nombre HAVING count(e.nombre) >= all (SELECT count(e.nombre)  FROM espectaculos e, asistir a  WHERE e.nombre = a.espectaculo  AND a.fecha >= ? AND a.fecha <= ? GROUP BY  e.nombre) LIMIT 1");           
            stmEspectaculo.setDate(1, java.sql.Date.valueOf(inicioAnho));
            stmEspectaculo.setDate(2, java.sql.Date.valueOf(finAnho));
            stmEspectaculo.setDate(3, java.sql.Date.valueOf(inicioAnho));
            stmEspectaculo.setDate(4, java.sql.Date.valueOf(finAnho));
        
            rsConsultaEspectaculo = stmEspectaculo.executeQuery();
            while (rsConsultaEspectaculo.next()) {
               
                Asistir asistencia = new Asistir(rsConsultaEspectaculo.getString(1),rsConsultaEspectaculo.getString(2), rsConsultaEspectaculo.getInt(3));
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
