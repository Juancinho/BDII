
package BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import proyectobasesdatos.VisitanteResumen;

/**
 *
 * @author alumnogreibd
 */
public class VisitantesDAO {
    private final java.sql.Connection conexion;

    public VisitantesDAO(Connection conexion) {
        this.conexion = conexion;
    }
    
    public ArrayList<VisitanteResumen> listarPersonasConMasGasto(Integer limite){   //Parte de FA5
 
        ArrayList<VisitanteResumen> resultado = new ArrayList<>();
        VisitanteResumen visResumenActual;

        ResultSet rsVisResumen;
        PreparedStatement stmVisResumen = null;
        
        
        try {
            stmVisResumen = conexion.prepareStatement("SELECT dni, nombre, dineroGastado\n" +
                                                        "FROM visitantes\n" +
                                                        "ORDER BY dineroGastado desc\n" +
                                                        "LIMIT ?"); 
            stmVisResumen.setInt(1, limite);
            rsVisResumen = stmVisResumen.executeQuery();
            while (rsVisResumen.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                visResumenActual = new VisitanteResumen(rsVisResumen.getString("dni"), rsVisResumen.getString("nombre"), rsVisResumen.getFloat("dineroGastado"));
                resultado.add(visResumenActual);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmVisResumen.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
        
        
    }
}
