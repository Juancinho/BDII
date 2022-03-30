
package GUI;


public class FachadaGui {
    proyectobasesdatos.ProyectoBasesDatos fa;
        Inicio vp;
     public FachadaGui(proyectobasesdatos.ProyectoBasesDatos fa){
     this.fa=fa;
     this.vp = new Inicio();
   } 
     public void iniciaVista(){     
     vp.setVisible(true); 
    // vp.setDao(fa.getAtraccionesDAO()); 
    }
}
