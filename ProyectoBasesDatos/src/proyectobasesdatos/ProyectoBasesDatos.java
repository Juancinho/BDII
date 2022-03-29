
package proyectobasesdatos;





import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import BaseDatos.DAOUsuarios;
import BaseDatos.AtraccionesDAO;
import java.sql.*;
/**
 *
 * @author alumnogreibd
 */
public class ProyectoBasesDatos {
  private java.sql.Connection conexion;
   private GUI.FachadaGui fgui;
   private AtraccionesDAO atraccionesDAO;
   private DAOUsuarios daoUsuarios;
   public ProyectoBasesDatos() throws SQLException{
       fgui=new GUI.FachadaGui(this);//Inicializar la fachada GUI enlazandola con este "main" de la aplicacion
   //CONEXION
   /*
       Properties configuracion = new Properties();        
       FileInputStream arqConfiguracion;
     try {
            arqConfiguracion = new FileInputStream("baseDatos.properties");
            configuracion.load(arqConfiguracion);
            arqConfiguracion.close();

            Properties usuario = new Properties();
     

            String gestor = configuracion.getProperty("gestor");

            usuario.setProperty("user", configuracion.getProperty("usuario"));
            usuario.setProperty("password", configuracion.getProperty("clave"));
            this.conexion=java.sql.DriverManager.getConnection("jdbc:"+gestor+"://"+
                    configuracion.getProperty("servidor")+":"+
                    configuracion.getProperty("puerto")+"/"+
                    configuracion.getProperty("baseDatos"),
                    usuario);
     } 
     catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
           
        } catch (IOException i) {
            System.out.println(i.getMessage());            
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
*/
   try{
   Class.forName("org.postgresql.Driver");     
   }catch(ClassNotFoundException ex){
       System.out.println("Error");
   }
   String url = "jdbc:postgresql://localhost:5432/Parque";
   String usuario = "alumnogreibd";
   String contrasenha = "greibd2021";
   this.conexion = DriverManager.getConnection(url,usuario,contrasenha);
      atraccionesDAO = new AtraccionesDAO(conexion);
      daoUsuarios = new DAOUsuarios(conexion);
   }
   public AtraccionesDAO getAtraccionesDAO() {
        return atraccionesDAO;
    }
   
   
   public Usuario validarUsuario(String idUsuario, String clave){
        return daoUsuarios.validarUsuario(idUsuario, clave);
    }
   
    public static void main(String[] args) throws SQLException {
        proyectobasesdatos.ProyectoBasesDatos fa = new ProyectoBasesDatos();
        fa.fgui.iniciaVista();
    }
    
}
