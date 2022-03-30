
package GUI;


public class FachadaGui {
    proyectobasesdatos.ProyectoBasesDatos fa;
        Inicio in;
        Principal vp;
     public FachadaGui(proyectobasesdatos.ProyectoBasesDatos fa){
     this.fa=fa;
     this.in = new Inicio();
     this.vp = new Principal(fa);
   } 
     public void iniciaVista(){  
         
     vp.setVisible(true); 
     in.setVisible(true);     
     vp.setDao(fa.getAtraccionesDAO()); 
    }
}
