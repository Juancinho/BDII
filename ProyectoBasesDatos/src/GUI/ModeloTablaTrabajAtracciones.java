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
public class ModeloTablaTrabajAtracciones extends AbstractTableModel{
     private java.util.List<Trabajador> trabajadoratracc;

    public ModeloTablaTrabajAtracciones() {
        this.trabajadoratracc = new java.util.ArrayList<>();
    }

    
    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public int getRowCount() {
        return trabajadoratracc.size();
    }

 
    @Override

    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Nombre";
                break;
            case 1:
                nombre = "DNI";
                break;
            case 2:
                nombre = "Atraccion";
                break;
            case 3:
                nombre = "Fecha Inicio";
                break;
            case 4:
                nombre = "Salario";
                break;    
            case 5:
                nombre = "Telefono";
                break; 
            case 6:
                nombre = "Direccion";
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
                clase = java.lang.String.class;
                break;
            case 4:
                clase = java.lang.Float.class;
                break;
            case 5:
                clase = java.lang.String.class;
                break;
            case 6:
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
                resultado = trabajadoratracc.get(row).getNombre();
                break;
            case 1:
                resultado = trabajadoratracc.get(row).getDNI();
                break;
            case 2:
                resultado = trabajadoratracc.get(row).getNombreAtraccion();
                break;
            case 3:
                resultado = trabajadoratracc.get(row).getFechaInicio();
                break;
            case 4:
                resultado = trabajadoratracc.get(row).getSalario();
                break;
            case 5:
                resultado = trabajadoratracc.get(row).getTelefono();
                break;
            case 6:
                resultado = trabajadoratracc.get(row).getDireccion();
                break;

        }
        return resultado;
    }
  
    public void setFilas(java.util.List<Trabajador> trabajadoratracc) {
        this.trabajadoratracc = trabajadoratracc;
        fireTableDataChanged();
    }
      public Trabajador obtenerTrabajadorAtracc(int i){
        return this.trabajadoratracc.get(i);
    }

}
