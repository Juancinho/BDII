/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.table.AbstractTableModel;
import proyectobasesdatos.Atraccion;//Importamos la clase atraccion

public class ModeloTablaAtraccion extends AbstractTableModel {
    private java.util.List<Atraccion> atracciones;

    public ModeloTablaAtraccion() {
        this.atracciones = new java.util.ArrayList<>();
    }

    
    @Override
    public int getColumnCount() {
        return 5;
    }


    public int getRowCount() {
        return atracciones.size();
    }

 
    @Override

    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Nombre";
                break;
            case 1:
                nombre = "Aforo";
                break;
            case 2:
                nombre = "Altura Mínima";
                break;
            case 3:
                nombre = "Ubicación";
                break;
            case 4:
                nombre = "Descripción";
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
                clase = java.lang.Integer.class;
                break;
            case 3:
                clase = java.lang.String.class;
                break;
            case 4:
                clase = java.lang.String.class;
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
                resultado = atracciones.get(row).getNombre();
                break;
            case 1:
                resultado = atracciones.get(row).getAforo();
                break;
            case 2:
                resultado = atracciones.get(row).getAlturaMin();
                break;
            case 3:
                resultado = atracciones.get(row).getUbicacion();
                break;
            case 4:
                resultado = atracciones.get(row).getDescripcion();
                break;
          

        }
        return resultado;
    }
  
    public void setFilas(java.util.List<Atraccion> atracciones) {
        this.atracciones = atracciones;
        fireTableDataChanged();
    }
      public Atraccion obtenerAtraccion(int i){
        return this.atracciones.get(i);
    }
}
