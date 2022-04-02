/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.table.AbstractTableModel;
import proyectobasesdatos.Espectaculo;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaEspectaculo extends AbstractTableModel {

    private java.util.List<Espectaculo> espectaculos;

    public ModeloTablaEspectaculo() {
        this.espectaculos = new java.util.ArrayList<>();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {
        return espectaculos.size();
    }

    @Override

    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Nombre";
                break;
            case 1:
                nombre = "Hola Inicio";
                break;
            case 2:
                nombre = "Hora Fin";
                break;
            case 3:
                nombre = "Temática";
                break;
            case 4:
                nombre = "Descripción";
                break;
            case 5:
                nombre = "Ubicación";
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
            case 5:
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
                resultado = espectaculos.get(row).getNombre();
                break;
            case 1:
                resultado = espectaculos.get(row).getHoraInicio();
                break;
            case 2:
                resultado = espectaculos.get(row).getHoraFin();
                break;
            case 3:
                resultado = espectaculos.get(row).getTematica();
                break;
            case 4:
                resultado = espectaculos.get(row).getDescripcion();
                break;
            case 5:
                resultado = espectaculos.get(row).getUbicacion();
                break;

        }
        return resultado;
    }

    public void setFilas(java.util.List<Espectaculo> espectaculos) {
        this.espectaculos = espectaculos;
        fireTableDataChanged();
    }
     public Espectaculo obtenerEspectaculo(int i){
        return this.espectaculos.get(i);
    }

}
