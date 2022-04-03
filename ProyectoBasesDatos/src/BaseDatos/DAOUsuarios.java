/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BaseDatos;
import BaseDatos.AbstractDAO;
import proyectobasesdatos.Usuario;
import proyectobasesdatos.TipoUsuario;
import java.sql.*;
/**
 *
 * @author basesdatos
 */
public class DAOUsuarios extends AbstractDAO {
    private java.sql.Connection conexion;
/*
   public DAOUsuarios (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
*/
   
   public DAOUsuarios (Connection conexion){
        this.conexion = conexion;
     }  

    public Usuario validarUsuario(String idUsuario, String clave){
        Usuario resultado=null;
        Connection con;
        PreparedStatement stmUsuario=null;
        ResultSet rsUsuario;

        con=conexion;

        try {
        stmUsuario=con.prepareStatement("select dni, clave, tipo_usuario "+
                                        "from usuario "+
                                        "where dni = ? and clave = ?");
        stmUsuario.setString(1, idUsuario);
        stmUsuario.setString(2, clave);
        rsUsuario=stmUsuario.executeQuery();
        if (rsUsuario.next())
        {
            resultado = new Usuario(rsUsuario.getString("dni"), rsUsuario.getString("clave"),
                                    TipoUsuario.valueOf(rsUsuario.getString("tipo_usuario")));
        }
        } catch (SQLException e){
          System.out.println(e.getMessage());
        }finally{
          try {stmUsuario.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
        return resultado;
    }
    
    public void registrarUsuario(String DNI, String Nombre, String Nacionalidad, String correo, String contraseña, String telefono, String fecha) throws SQLException{
        
        Connection con;
        PreparedStatement stmUsuario = null;
        PreparedStatement stmUsuario1 = null;
        con = conexion;
        
        stmUsuario = con.prepareStatement("INSERT INTO visitantes(DNI, Nombre, Nacionalidad, correoelectronico, telefono)" +
                "VALUES (?, ?, ?, ?, ?)");
        
        stmUsuario.setString(1, DNI);
        stmUsuario.setString(2, Nombre);
        stmUsuario.setString(3, Nacionalidad);
        stmUsuario.setString(4, correo);
        stmUsuario.setString(5, telefono);
        //stmUsuario.setString(6, fecha);
        stmUsuario.executeUpdate();
        
        stmUsuario1 = con.prepareStatement("INSERT INTO usuario(DNI, clave, tipo_usuario)" +
                "VALUES (?, ?, ?)");
        
        stmUsuario1.setString(1, DNI);
        stmUsuario1.setString(2, contraseña);
        stmUsuario1.setString(3, "Normal");
        stmUsuario1.executeUpdate();
        
        
    }
   
}
