
package GUI;


public class FachadaGui {
    proyectobasesdatos.ProyectoBasesDatos pr;
        Inicio in;
     public FachadaGui(proyectobasesdatos.ProyectoBasesDatos pr){
     this.pr=pr;
     this.in = new Inicio(pr);
   } 
     public void iniciaVista(){  
          
     in.setVisible(true);     
    }
}
