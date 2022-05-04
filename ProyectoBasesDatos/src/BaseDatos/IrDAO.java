package BaseDatos;

/**
 *
 * @author alumnogreibd
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;

public class IrDAO {

    private java.sql.Connection conexion;

    public IrDAO(Connection conexion) {    //MANOTE: Para quien se encargue de la interfaz, aquí quizás falta una fachada
        this.conexion = conexion;
    }

    public boolean hayEntradaComprada(Date fecha, String dni, String nombreAtraccion) {

        ResultSet rsIr;
        PreparedStatement stmIr = null;
        Boolean existe = false;

        try {
            stmIr = conexion.prepareStatement("SELECT visitante FROM ir WHERE fechavisita = ? AND visitante = ? AND  atraccion = ?");
            stmIr.setDate(1, fecha);
            stmIr.setString(2, dni);
            stmIr.setString(3, nombreAtraccion);
            rsIr = stmIr.executeQuery();
            if (rsIr.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                existe = true;
            } else {
                existe = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmIr.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return existe;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
    }

    public void comprarEntrada(Date fecha, String vip, String dni, String nombreAtraccion) {  //FU1

        PreparedStatement stmIr = null;

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

    public void cancelarCompra(Date fecha, String dni, String nombreAtraccion) {    //FU1

        PreparedStatement stmIr = null;

        //MANOTE: De nuevo faltan comprobaciones de que esta compra se pueda cancelar (que no haya pasado el evento)
        try {
            stmIr = conexion.prepareStatement("DELETE FROM ir WHERE fechavisita = ? AND visitante = ? AND  atraccion = ?");
            stmIr.setDate(1, fecha);
            stmIr.setString(2, dni);
            stmIr.setString(3, nombreAtraccion);
            stmIr.executeUpdate();

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

    
    public int devolverDinero(Date fecha, String nombreAtraccion) {
        ResultSet rsIr;
        PreparedStatement stmIr = null;
        ResultSet rsVis;
        PreparedStatement stmVis = null;
        float entradaVip=12, entradaNormal=8;
        int numero=0;//Intentar distinguir entre nadie fue y un error
        
        try {
            stmIr = conexion.prepareStatement("SELECT visitante, vip FROM ir WHERE fechavisita = ? AND  atraccion = ?");
            stmIr.setDate(1, fecha);
            stmIr.setString(2, nombreAtraccion);
            rsIr = stmIr.executeQuery();
            while (rsIr.next()) {
                numero++;
                stmVis = conexion.prepareStatement("UPDATE visitantes SET dineroGastado = dineroGastado - ? WHERE dni = ?");
                if(rsIr.getString("vip").equals("SI"))
                    stmVis.setFloat(1, entradaVip);
                else
                    stmVis.setFloat(1, entradaNormal);
                stmVis.setString(2, rsIr.getString("visitante"));
                stmVis.executeUpdate();
            }
        } catch (SQLException e) {
            numero=-1;
            System.out.println(e.getMessage());
        } finally {
            try {
                stmIr.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return numero;
    }
    
    public void regalarEntrada(String dni) {

        PreparedStatement stmIr = null;

        try {
            stmIr = conexion.prepareStatement("INSERT INTO ir (fechaVisita, VIP, visitante, atraccion)\n"
                    + "SELECT CURRENT_DATE + INTERVAL '1 day', 'SI', ?, a.nombre\n"
                    + "FROM atracciones a, ir i\n"
                    + "WHERE a.nombre = i.atraccion\n"
                    + "AND i.visitante LIKE ?\n"
                    + "GROUP BY a.nombre\n"
                    + "HAVING count(a.nombre) >= all (SELECT count(a2.nombre)\n"
                    + "FROM atracciones a2, ir i2\n"
                    + "WHERE a2.nombre = i2.atraccion\n"
                    + "AND i2.visitante LIKE ?\n"
                    + "GROUP BY  a2.nombre)\n"
                    + "LIMIT 1"
            );

            stmIr.setString(1, dni);
            stmIr.setString(2, dni);
            stmIr.setString(3, dni);
            stmIr.executeUpdate();

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
