
package GUI;


public class FachadaGui {
    proyectobasesdatos.ProyectoBasesDatos pr;
        MenuUsuarios in;
     public FachadaGui(proyectobasesdatos.ProyectoBasesDatos pr){
     this.pr=pr;
     this.in = new MenuUsuarios(pr);
   } 
     public void iniciaVista(){  
          
     in.setVisible(true);     
    }
}
