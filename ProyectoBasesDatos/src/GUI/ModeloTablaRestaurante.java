/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.table.AbstractTableModel;
import proyectobasesdatos.Hosteleria;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaRestaurante extends AbstractTableModel {

    private java.util.List<Hosteleria> restaurantes;

    public ModeloTablaRestaurante() {
        this.restaurantes = new java.util.ArrayList<>();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public int getRowCount() {
        return restaurantes.size();
    }

    @Override

    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Nombre";
                break;
            case 1:
                nombre = "Ubicacion";
                break;
            case 2:
                nombre = "Aforo";
                break;
            case 3:
                nombre = "Hora Apertura";
                break;
            case 4:
                nombre = "Hora Cierre";
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
                resultado = restaurantes.get(row).getNombreEstablecimiento();
                break;
            case 1:
                resultado = restaurantes.get(row).getUbicacion();
                break;
            case 2:
                resultado = restaurantes.get(row).getAforo();
                break;
            case 3:
                resultado = restaurantes.get(row).getHoraInicio();
                break;
            case 4:
                resultado = restaurantes.get(row).getHoraFin();
                break;

        }
        return resultado;
    }

    public void setFilas(java.util.List<Hosteleria> restaurantes) {
        this.restaurantes = restaurantes;
        fireTableDataChanged();
    }

    public Hosteleria obtenerRestaurante(int i) {
        return this.restaurantes.get(i);
    }
}
