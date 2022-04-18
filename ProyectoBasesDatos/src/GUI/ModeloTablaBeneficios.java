/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.table.AbstractTableModel;
import proyectobasesdatos.Atraccion;//Importamos la clase atraccion

public class ModeloTablaBeneficios extends AbstractTableModel {
    private java.util.List<Atraccion> atraccion;

    public ModeloTablaBeneficios() {
        this.atraccion = new java.util.ArrayList<>();
    }

    
    @Override
    public int getColumnCount() {
        return 2;
    }


    public int getRowCount() {
        return atraccion.size();
    }

 
    @Override

    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Atraccion";
                break;
            case 1:
                nombre = "Beneficios";
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
                resultado = this.atraccion.get(row).getNombre();
                break;
            case 1:
                resultado = this.atraccion.get(row).getBeneficios();
                break;

        }
        return resultado;
    }
    
    
    public void setFilas(java.util.List<Atraccion> atracciones) {
        this.atraccion = atracciones;
        fireTableDataChanged();
    }
    
      public Atraccion obtenerAtraccion(int i){
        return this.atraccion.get(i);
    }

}
