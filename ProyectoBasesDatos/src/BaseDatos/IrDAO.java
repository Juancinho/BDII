
package BaseDatos;

/**
 *
 * @author alumnogreibd
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class IrDAO {

    private java.sql.Connection conexion;

    public IrDAO(Connection conexion) {    //MANOTE: Para quien se encargue de la interfaz, aquí quizás falta una fachada
        this.conexion = conexion;
    }

    public void comprarEntrada(Date fecha, String vip, String dni, String nombreAtraccion) {  //FU1

        PreparedStatement stmIr = null;

        //MANOTE: Falta ccomprobación de que ese DNI ya esté registrado (pendiente de que se implemente la parte de registro/validación usuarios)
        try {
            stmIr = conexion.prepareStatement("INSERT INTO ir (fechavisita,vip, visitante, atraccion) values (?,?,?,?)");
            stmIr.setDate(1, fecha);
            stmIr.setString(2, vip);
            stmIr.setString(3, dni);            
            stmIr.setString(4, nombreAtraccion);
            stmIr.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmIr.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }  //MANOTE: No entiendo muy bien que quiere decir lo de cursores, habría que verlo
        } //MANOTE: Al parecer el .close() también cerraría el resultSet en caso de haberlo 
    }

    public void cancelarCompra(String fecha, String dni, String nombreAtraccion) {    //FU1

        PreparedStatement stmIr = null;

        //MANOTE: De nuevo faltan comprobaciones de que esta compra se pueda cancelar (que no haya pasado el evento)
        try {
            stmIr = conexion.prepareStatement("DELETE FROM ir WHERE (fechavisita, visitante, atraccion) = ('?','?','?')");
            stmIr.setString(1, fecha);
            stmIr.setString(2, dni);
            stmIr.setString(3, nombreAtraccion);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmIr.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

    }
}
