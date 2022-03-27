
package BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    
    
    public Hosteleria datosBasicosEstablecimiento(String nombreEstablecimiento) {  //FU4    //MANOTE: FALTA QUE ALGUIEN REHAGA ESTA CONSULTA PARA INCLUIR EL ATRIBUTO CALCULADO PUNTUACIÖN MEDIA (SE HACE A TRAVËS DE UNA SUBCONSULTA)

        Hosteleria establecimiento = null;

        ResultSet rsHosteleria;
        PreparedStatement stmHosteleria = null;

        try {
            stmHosteleria = conexion.prepareStatement("SELECT nombreEstablecimiento, ubicacion, aforo, horaInicio, horaFin FROM hosteleria WHERE nombreEstablecimiento = ?");
            stmHosteleria.setString(1, nombreEstablecimiento);
            rsHosteleria = stmHosteleria.executeQuery();

            establecimiento = new Hosteleria (rsHosteleria.getString("nombre"), rsHosteleria. getString("ubicacion"), rsHosteleria.getInt("aforo"), rsHosteleria.getString("horaInicio"), rsHosteleria.getString("horaFin"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmHosteleria.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return establecimiento;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
    }
    

}
