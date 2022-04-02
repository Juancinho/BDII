/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.table.AbstractTableModel;
import proyectobasesdatos.Asistir;//Importamos la clase asisitr

public class ModeloTablaAsistir extends AbstractTableModel {
    private java.util.List<Asistir> asistencia;

    public ModeloTablaAsistir() {
        this.asistencia = new java.util.ArrayList<>();
    }

    
    @Override
    public int getColumnCount() {
        return 3;
    }


    public int getRowCount() {
        return asistencia.size();
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
                resultado = asistencia.get(row).getFecha();
                break;
            case 1:
                resultado = asistencia.get(row).getVisitante();
                break;
            case 2:
                resultado = asistencia.get(row).getEspectaculo();
                break;

        }
        return resultado;
    }
    
    /*
    public void setFilas(java.util.List<Asistir> atracciones) {
        this.asistencia = atracciones;
        fireTableDataChanged();
    }
      public Asistir obtenerAtraccion(int i){
        return this.asistencia.get(i);
    }
*/
}
