package BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import proyectobasesdatos.Hosteleria;

/**
 *
 * @author alumnogreibd
 */
public class HosteleriaDAO {

    private final java.sql.Connection conexion;

    public HosteleriaDAO(Connection conexion) { //MANOTE: Para quien se encargue de la interfaz, aquí quizás falta una fachada
        this.conexion = conexion;
    }
    
    public ArrayList<String> establecimientosActivos() {
        ArrayList<String> resultado = new java.util.ArrayList<>();

        ResultSet rsEstablecimientos;
        PreparedStatement stmEstablecimientos = null;

        try {
            stmEstablecimientos = conexion.prepareStatement("SELECT nombreestablecimiento FROM hosteleria"); 
            rsEstablecimientos = stmEstablecimientos.executeQuery();
            while (rsEstablecimientos.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                resultado.add(rsEstablecimientos.getString("nombreestablecimiento"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmEstablecimientos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public   java.util.List<Hosteleria>  datosBasicosEstablecimiento(String nombreEstablecimiento) {  //FU4    //MANOTE: FALTA QUE ALGUIEN REHAGA ESTA CONSULTA PARA INCLUIR EL ATRIBUTO CALCULADO PUNTUACIÖN MEDIA (SE HACE A TRAVËS DE UNA SUBCONSULTA)
               java.util.List<Hosteleria> resultado = new java.util.ArrayList<>();

        Hosteleria establecimiento = null;

        ResultSet rsHosteleria;
        PreparedStatement stmHosteleria = null;

        try {
            stmHosteleria = conexion.prepareStatement("SELECT nombreestablecimiento, ubicacion, aforo, horaInicio, horaFin FROM hosteleria WHERE nombreestablecimiento like ? ");
            stmHosteleria.setString(1, '%' +nombreEstablecimiento+ '%');
            rsHosteleria = stmHosteleria.executeQuery();
            while (rsHosteleria.next()) {
                establecimiento = new Hosteleria(rsHosteleria.getString("nombreestablecimiento"), rsHosteleria.getString("ubicacion"), rsHosteleria.getInt("aforo"), rsHosteleria.getString("horainicio"), rsHosteleria.getString("horafin"));
                resultado.add(establecimiento);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
           
        } finally {
            try {
                stmHosteleria.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;  
    }

}
