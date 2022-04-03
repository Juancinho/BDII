
package BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alumnogreibd
 */
public class AsistirDAO {

    private final java.sql.Connection conexion;

    public AsistirDAO(Connection conexion) { //MANOTE: Para quien se encargue de la interfaz, aquí quizás falta una fachada
        this.conexion = conexion;
    }

    public void comprarEntrada(java.sql.Date fecha, String dni, String nombreEspectaculo) {  //FU1

        PreparedStatement stmAsistir = null;

        //MANOTE: Falta ccomprobación de que ese DNI ya esté registrado (pendiente de que se implemente la parte de registro/validación usuarios)
        try {
            stmAsistir = conexion.prepareStatement("INSERT INTO asistir (fecha, visitante, espectaculo) values (?,?,?)");
            stmAsistir.setDate(1, fecha);
            stmAsistir.setString(2, dni);
            stmAsistir.setString(3, nombreEspectaculo);
            stmAsistir.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmAsistir.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }  //MANOTE: No entiendo muy bien que quiere decir lo de cursores, habría que verlo
        } //MANOTE: Al parecer el .close() también cerraría el resultSet en caso de haberlo 

    }

    public void cancelarCompra(String fecha, String dni, String nombreEspectaculo) {  //FU1

        PreparedStatement stmAsistir = null;

        //MANOTE: De nuevo faltan comprobaciones de que esta compra se pueda cancelar (que no haya pasado el evento)
        try {
            stmAsistir = conexion.prepareStatement("DELETE FROM asistir WHERE (fecha, dni, nombreEspectaculo) = ('?','?','?')");
            stmAsistir.setString(1, fecha);
            stmAsistir.setString(2, dni);
            stmAsistir.setString(3, nombreEspectaculo);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmAsistir.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

    }

}
