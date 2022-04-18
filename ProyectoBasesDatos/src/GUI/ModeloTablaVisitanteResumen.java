/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import proyectobasesdatos.VisitanteResumen;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaVisitanteResumen extends AbstractTableModel{
    private java.util.List<VisitanteResumen> visitantesResumen;

    public ModeloTablaVisitanteResumen() {
        this.visitantesResumen = new ArrayList<>();
    }
    
    
     @Override
    public int getColumnCount() {
        return 3;
    }
    
     public int getRowCount() {
        return visitantesResumen.size();
    }
     
     
     @Override

    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "DNI";
                break;
            case 1:
                nombre = "Nombre";
                break;
            case 2:
                nombre = "Dinero Gastado";
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
                clase = java.lang.Integer.class;
                break;
            case 2:
                clase = java.lang.Float.class;
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
                resultado = visitantesResumen.get(row).getDNI();
                break;
            case 1:
                resultado = visitantesResumen.get(row).getNombre();
                break;
            case 2:
                resultado = visitantesResumen.get(row).getDineroGastado();
                break;
        }
        return resultado;
    }
    
    
    public void setFilas(ArrayList<VisitanteResumen> visitantesResumen) {
        this.visitantesResumen = visitantesResumen;
        fireTableDataChanged();
    }
    
      public VisitanteResumen obtenerVisitanteResumen(int i){
        return this.visitantesResumen.get(i);
    }
}
