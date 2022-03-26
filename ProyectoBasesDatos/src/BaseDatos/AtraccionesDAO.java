/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import proyectobasesdatos.Atraccion;

/**
 *
 * @author alumnogreibd
 */
public class AtraccionesDAO {
    private java.sql.Connection conexion;

     public AtraccionesDAO (Connection conexion){
        this.conexion = conexion;
     }  
     public java.util.List<Atraccion> consultarAtraccion(String nombre){
     java.util.List<Atraccion> resultado = new java.util.ArrayList<Atraccion>();
     Atraccion atraccionActual;
     
     ResultSet rsAtracciones ;
     PreparedStatement  stmAtracciones = null;
     
     String consulta = "select nombre, aforo, alturamin, ubicacion,descripcion "
             + " from atracciones "
             + " where nombre like ? ";
             
     
     try{
     stmAtracciones = conexion.prepareStatement(consulta);
     stmAtracciones.setString(1, "%"+nombre+"%");
     rsAtracciones=stmAtracciones.executeQuery();
     while(rsAtracciones.next()){
     atraccionActual = new Atraccion(rsAtracciones.getString("nombre"), rsAtracciones.getInt("aforo"), rsAtracciones.getInt("alturaminima"), rsAtracciones.getString("ubicacion"), rsAtracciones.getString("descripcion"));
     resultado.add(atraccionActual);     
     
     }
     }catch (SQLException e){
              System.out.println(e.getMessage());
     }   
    return resultado;
    }
       
    
}
