/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectobasesdatos;


public class GestionUsuarios {
     
    ProyectoBasesDatos pbd;
    
   
    public GestionUsuarios(ProyectoBasesDatos pbd){
     this.pbd=pbd;
    }  
    
    
  public Boolean comprobarAutentificacion(String idUsuario, String clave){
      Usuario u;

      u= pbd.validarUsuario(idUsuario, clave);
      if (u!=null){
          return u.getTipoUsuario()==TipoUsuario.Administrador;
      } else return false;
  }
  
 
  
}
