package BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.ResultSet;
import proyectobasesdatos.Comer;

/**
 *
 * @author alumnogreibd
 */
public class ComerDAO {

    private final java.sql.Connection conexion;

    public ComerDAO(Connection conexion) { //MANOTE: Para quien se encargue de la interfaz, aquí quizás falta una fachada
        this.conexion = conexion;
    }

    public boolean hayReservaHecha(Date fecha, String dni, String nombreRestaurante) {

        ResultSet rsComer;
        PreparedStatement stmComer = null;
        Boolean existe = false;

        try {
            stmComer = conexion.prepareStatement("SELECT visitante FROM comer WHERE fecha = ? AND visitante = ? AND  establecimiento = ?");
            stmComer.setDate(1, fecha);
            stmComer.setString(2, dni);
            stmComer.setString(3, nombreRestaurante);
            rsComer = stmComer.executeQuery();
            if (rsComer.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                existe = true;
            } else {
                existe = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmComer.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return existe;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
    }

    public void reservar(java.sql.Date fecha, String dni, String nombreEstablecimiento) {   //FU1
        PreparedStatement stmComer = null;

        //MANOTE: Falta ccomprobación de que ese DNI ya esté registrado (pendiente de que se implemente la parte de registro/validación usuarios)
        //MANOTE: habría que pensar en un mecanismo para que no se sobrepase el aforo (función SQL, en java o cómo?? -quizás no es sencillo- MARTIN: Supongo que sera en la consulta sql pero no lo tengo claro
        //MANOTE: FALTA CONTROLAR QUE EL ARRAYLIST DE DNIS (gente que va a comer procedente de esta reserva) ESTÁN REGISTRADOS/NO ESTÁN REPETIDOS/NO SON NULOS
        try {  //MANOTE: No es muy ortodoxo este try exterior al bucle, pero no se puede poner un finally fuera de un bucle donde está en catch. No sé si funcionará esto :'(
            try {
                stmComer = conexion.prepareStatement("INSERT INTO comer (fecha, visitante, establecimiento) values (?,?,?)");  //MANOTE: No sé mucho cómo meter lo del NULL aquí, quizás así funcione al estar puntuacion de cuarto en la tabla
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

    public void cancelarReserva(Date fecha, String dni, String nombreEstablecimiento) {  //FU1

        PreparedStatement stmComer = null;

        //MANOTE: De nuevo faltan comprobaciones de que esta compra se pueda cancelar (que no haya pasado el evento)
        try {
            stmComer = conexion.prepareStatement("DELETE FROM comer WHERE fecha = ? AND visitante = ? AND  establecimiento = ?");
            stmComer.setDate(1, fecha);
            stmComer.setString(2, dni);
            stmComer.setString(3, nombreEstablecimiento);
            stmComer.executeUpdate();

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

    public void puntuar(Date fecha, String dni, String nombreEstablecimiento, Integer puntuacion) {  //FU1

        PreparedStatement stmPuntuar = null;

        try {
            stmPuntuar = conexion.prepareStatement("UPDATE comer SET puntuacion = ? WHERE fecha = ? AND visitante = ? AND  establecimiento = ?");
            stmPuntuar.setDate(1, fecha);
            stmPuntuar.setString(2, dni);
            stmPuntuar.setString(3, nombreEstablecimiento);
            stmPuntuar.setInt(4, puntuacion);
            stmPuntuar.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmPuntuar.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

    }

    public ArrayList<Comer> comidasPendientesDeEvaluar(String dni) {

        ResultSet rsComer;
        PreparedStatement stmComer = null;
        ArrayList<Comer> comidas = new ArrayList<>();
        Comer comerAcrual;
        try {
            stmComer = conexion.prepareStatement("SELECT fecha,visitante,establecimiento,puntuacion FROM comer WHERE visitante = ? AND fecha < current_date AND puntuacion IS NULL ORDER BY fecha asc");
            ; //No se puede evaluar una comida que no ha sucedido
            stmComer.setString(1, dni);
            rsComer = stmComer.executeQuery();
            while (rsComer.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                comerAcrual = new Comer(rsComer.getDate("fecha").toString(), rsComer.getString("visitante"), rsComer.getString("establecimiento"), rsComer.getInt("puntuacion"));
                comidas.add(comerAcrual);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmComer.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return comidas;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
    }

    public ArrayList<Comer> comidasEvaluadas(String dni) {

        ResultSet rsComer;
        PreparedStatement stmComer = null;
        ArrayList<Comer> comidas = new ArrayList<>();
        Comer comerAcrual;
        try {
            stmComer = conexion.prepareStatement("SELECT fecha,visitante,establecimiento,puntuacion FROM comer WHERE visitante = ? AND puntuacion IS NOT NULL ORDER BY fecha asc");
            stmComer.setString(1, dni);
            rsComer = stmComer.executeQuery();
            while (rsComer.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                comerAcrual = new Comer(rsComer.getDate("fecha").toString(), rsComer.getString("visitante"), rsComer.getString("establecimiento"), rsComer.getInt("puntuacion"));
                comidas.add(comerAcrual);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmComer.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return comidas;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
    }

    public ArrayList<Comer> comidasEvaluadasResumen(String dni) {

        ResultSet rsComer;
        PreparedStatement stmComer = null;
        ArrayList<Comer> comidas = new ArrayList<>();
        Comer comerAcrual;
        try {
            stmComer = conexion.prepareStatement("SELECT MAX(fecha),visitante,establecimiento,AVG(puntuacion) FROM comer WHERE visitante = ? AND puntuacion IS NOT NULL GROUP BY establecimiento,visitante + ORDER BY AVG(puntuacion) desc");
            stmComer.setString(1, dni);
            rsComer = stmComer.executeQuery();
            while (rsComer.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                comerAcrual = new Comer(rsComer.getDate("MAX(fecha)").toString(), rsComer.getString("visitante"), rsComer.getString("establecimiento"), rsComer.getInt("AVG(puntuacion)"));
                comidas.add(comerAcrual);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmComer.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return comidas;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
    }

    public static Integer getInteger(ResultSet rs, String columnName) throws SQLException {
        int v = rs.getInt(columnName);
        if (rs.wasNull()){  //lamentablemente esto solo se puede comprobar una vez que se ha hecho el getInt
            return null;
        } else{
            return v
        }
        return rs.wasNull() ? null : v;
    }

}
