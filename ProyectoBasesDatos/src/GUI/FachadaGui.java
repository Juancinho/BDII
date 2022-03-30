
package GUI;


public class FachadaGui {
    proyectobasesdatos.ProyectoBasesDatos fa;
        Inicio in;
     public FachadaGui(proyectobasesdatos.ProyectoBasesDatos fa){
     this.fa=fa;
     this.in = new Inicio();
   } 
     public void iniciaVista(){  
          
     in.setVisible(true);     
    }
}
