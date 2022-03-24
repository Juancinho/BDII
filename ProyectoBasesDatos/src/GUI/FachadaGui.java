
package GUI;


public class FachadaGui {
    proyectobasesdatos.ProyectoBasesDatos fa;
    Principal vp;
     public FachadaGui(proyectobasesdatos.ProyectoBasesDatos fa){
     this.fa=fa;
     this.vp = new Principal(fa);
   } 
     public void iniciaVista(){     
     vp.setVisible(true); 
     vp.setDao(fa.getAtraccionesDAO()); 
    }
}
