/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.table.AbstractTableModel;
import proyectobasesdatos.Trabajador;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaTrabajadores extends AbstractTableModel {

    private java.util.List<Trabajador> trabajadores;

    public ModeloTablaTrabajadores() {
        this.trabajadores = new java.util.ArrayList<>();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {
        return trabajadores.size();
    }

    @Override

    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "DNI";
                break;
            case 1:
                nombre = "nombre";
                break;
            case 2:
                nombre = "Salario";
                break;
            case 3:
                nombre = "Fecha de Contratacion";
                break;
            case 4:
                nombre = "Atracción";
                break;
            case 5:
                nombre = "Espectáculo";
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
                resultado = trabajadores.get(row).getDNI();
                break;
            case 1:
                resultado = trabajadores.get(row).getNombre();
                break;
            case 2:
                resultado = trabajadores.get(row).getSalario();
                break;
            case 3:
                resultado = trabajadores.get(row).getFechaInicio();
                break;
            case 4:
                resultado = trabajadores.get(row).getNombreAtraccion();
                break;
            case 5:
                resultado = trabajadores.get(row).getNombreEspectaculo();
                break;

        }
        return resultado;
    }

    public void setFilas(java.util.List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
        fireTableDataChanged();
    }

    public Trabajador obtenerTrabajador(int i) {
        return this.trabajadores.get(i);
    }

}
