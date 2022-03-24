/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectobasesdatos;





import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import BaseDatos.AtraccionesDAO;
/**
 *
 * @author alumnogreibd
 */
public class ProyectoBasesDatos {
  private java.sql.Connection conexion;
   private GUI.FachadaGui fgui;
   private AtraccionesDAO atraccionesDAO;
   public ProyectoBasesDatos(){
       fgui=new GUI.FachadaGui(this);//Inicializar la fachada GUI enlazandola con este "main" de la aplicacion
   //CONEXION
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
      atraccionesDAO = new AtraccionesDAO(conexion);
   }
   public AtraccionesDAO getAtraccionesDAO() {
        return atraccionesDAO;
    }
    public static void main(String[] args) {
        proyectobasesdatos.ProyectoBasesDatos fa = new ProyectoBasesDatos();
        fa.fgui.iniciaVista();
    }
    
}
