
package GUI;


public class FachadaGui {
    
    proyectobasesdatos.ProyectoBasesDatos pr;
    MenuInicio in;
    
    public FachadaGui(proyectobasesdatos.ProyectoBasesDatos pr){
        this.pr=pr;
        this.in = new MenuInicio(pr);
    }
    
    public void iniciaVista(){  
        in.setVisible(true);
    }
}
