
package GUI;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import proyectobasesdatos.Comer;

/**
 *
 * @author alumnogreibd
 */


public class ModeloTablaComer extends AbstractTableModel {
    private java.util.List<Comer> comidas;

    public ModeloTablaComer() {
        this.comidas = new ArrayList<>();
    }

    
    @Override
    public int getColumnCount() {
        return 4;
    }


    public int getRowCount() {
        return comidas.size();
    }

 
    @Override

    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Fecha";
                break;
            case 1:
                nombre = "Visitante";
                break;
            case 2:
                nombre = "Restaurante";
                break; 
            case 3:
                nombre = "Puntuación";
                break;
        }
        return nombre;
    }

    
    @Override

    public Class getColumnClass(int col) {
        Class clase = null;

        switch (col) {
            case 0:
                clase = java.lang.String.class;
                break;
            case 1:
                clase = java.lang.String.class;
                break;
            case 2:
                clase = java.lang.String.class;
                break;
            case 3:
                clase = java.lang.Integer.class;
                break;
        }
        return clase;
    }

   
    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Object resultado = null;

        switch (col) {
            case 0:
                resultado = comidas.get(row).getFecha();
                break;
            case 1:
                resultado = comidas.get(row).getVisitante();
                break;
            case 2:
                resultado = comidas.get(row).getEstablecimiento();
                break;
            case 3:
                resultado = comidas.get(row).getPuntuacion();
                break;

        }
        return resultado;
    }
    
    
    public void setFilas(java.util.List<Comer> comidas) {
        this.comidas = comidas;
        fireTableDataChanged();
    }
    
      public Comer obtenerComida(int i){
        return this.comidas.get(i);
    }

  
}
