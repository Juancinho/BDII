
package BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alumnogreibd
 */
public class ComerDAO {

    private final java.sql.Connection conexion;

    public ComerDAO(Connection conexion) { //MANOTE: Para quien se encargue de la interfaz, aquí quizás falta una fachada
        this.conexion = conexion;
    }

    public void reservar(java.sql.Date fecha, String dni, String nombreEstablecimiento) {   //FU1
        PreparedStatement stmComer = null;

        //MANOTE: Falta ccomprobación de que ese DNI ya esté registrado (pendiente de que se implemente la parte de registro/validación usuarios)
        //MANOTE: habría que pensar en un mecanismo para que no se sobrepase el aforo (función SQL, en java o cómo?? -quizás no es sencillo- MARTIN: Supongo que sera en la consulta sql pero no lo tengo claro
        //MANOTE: FALTA CONTROLAR QUE EL ARRAYLIST DE DNIS (gente que va a comer procedente de esta reserva) ESTÁN REGISTRADOS/NO ESTÁN REPETIDOS/NO SON NULOS
        try {  //MANOTE: No es muy ortodoxo este try exterior al bucle, pero no se puede poner un finally fuera de un bucle donde está en catch. No sé si funcionará esto :'(
                try {
                    stmComer = conexion.prepareStatement("INSERT INTO comer ('fecha', 'visitante', 'establecimiento') values (?,?,?)");  //MANOTE: No sé mucho cómo meter lo del NULL aquí, quizás así funcione al estar puntuacion de cuarto en la tabla
                    stmComer.setDate(1, fecha);
                    stmComer.setString(2, dni);
                    stmComer.setString(3, nombreEstablecimiento);
                    stmComer.executeUpdate();

                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
        } catch (Exception e) {  //MANOTE: Con la de SQL, hay que preguntarle al prof si sabe si hay una manera más elegante/mejor de hacer esto (o quizás vosotros lo sabéis)
        } finally {
            try {
                stmComer.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }  //MANOTE: No entiendo muy bien que quiere decir lo de cursores, habría que verlo
        } //MANOTE: Al parecer el .close() también cerraría el resultSet en caso de haberlo 

    }

    public void cancelarReserva(String fecha, String dni, String nombreEstablecimiento) {  //FU1

        PreparedStatement stmComer = null;

        //MANOTE: De nuevo faltan comprobaciones de que esta compra se pueda cancelar (que no haya pasado el evento)
        try {
            stmComer = conexion.prepareStatement("DELETE FROM comer WHERE (fecha, dni, nombreEstablecimiento) = ('?','?','?')");
            stmComer.setString(1, fecha);
            stmComer.setString(2, dni);
            stmComer.setString(3, nombreEstablecimiento);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmComer.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

    }

}
