package BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectobasesdatos.Atraccion;
import proyectobasesdatos.Trabajador;

/**
 *
 * @author alumnogreibd
 */
public class AtraccionesDAO {

    private java.sql.Connection conexion;

    public AtraccionesDAO(Connection conexion) {
        this.conexion = conexion;
    }
    
    public ArrayList<String> atraccionesActivas() {
        ArrayList<String> resultado = new java.util.ArrayList<>();

        ResultSet rsAtracciones;
        PreparedStatement stmAtracciones = null;

        try {
            stmAtracciones = conexion.prepareStatement("SELECT nombre FROM atracciones"); 
            rsAtracciones = stmAtracciones.executeQuery();
            while (rsAtracciones.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                resultado.add(rsAtracciones.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmAtracciones.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
    
    
    

    public java.util.List<Atraccion> consultarAtraccion(String nombre) {
        java.util.List<Atraccion> resultado = new java.util.ArrayList<>();
        Atraccion atraccionActual;

        ResultSet rsAtracciones;
        PreparedStatement stmAtracciones = null;

        String consulta = "select nombre, aforo, alturamin, ubicacion,descripcion "
                + " from atracciones "
                + " where nombre like ? ";

        try {
            stmAtracciones = conexion.prepareStatement(consulta);
            stmAtracciones.setString(1, "%" + nombre + "%");
            rsAtracciones = stmAtracciones.executeQuery();
            while (rsAtracciones.next()) {
                atraccionActual = new Atraccion(rsAtracciones.getString("nombre"), rsAtracciones.getInt("aforo"), rsAtracciones.getInt("alturamin"), rsAtracciones.getString("ubicacion"), rsAtracciones.getString("descripcion"));
                resultado.add(atraccionActual);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }


    public ArrayList<Atraccion> consultarAtraccionAltura(int alturaMin) {  //FU2  

        ArrayList<Atraccion> resultado = new java.util.ArrayList<>();
        Atraccion atraccionActual;

        ResultSet rsAtracciones;
        PreparedStatement stmAtracciones = null;

        try {
            stmAtracciones = conexion.prepareStatement("SELECT nombre, ubicacion, aforo, alturaMin, ubicacion, descripcion FROM atracciones WHERE alturaMin <= ?"); //MANOTE: quizás sea mejor no mostrar todo, lo pongo ahora por simplicidad, luego se habla y se modifica si se ve bien
            stmAtracciones.setInt(1, alturaMin);
            rsAtracciones = stmAtracciones.executeQuery();
            while (rsAtracciones.next()) {   //MANOTE: Este next devuelve un booleano pero también coloca el cursor en la siguiente fila (la primera vez que se le llama en la primera, la segunda en la segunda,...)
                atraccionActual = new Atraccion(rsAtracciones.getString("nombre"), rsAtracciones.getInt("aforo"), rsAtracciones.getInt("alturamin"), rsAtracciones.getString("ubicacion"), rsAtracciones.getString("descripcion"));
                resultado.add(atraccionActual);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmAtracciones.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
    }

    public Atraccion datosBasicosAtraccion(String nombreAtraccion) {  //FU4  

        Atraccion atraccion = null;

        ResultSet rsAtracciones;
        PreparedStatement stmAtracciones = null;

        try {
            stmAtracciones = conexion.prepareStatement("SELECT nombre, aforo, alturaMin, ubicacion, descripcion FROM atracciones WHERE nombre = ?");
            stmAtracciones.setString(1, nombreAtraccion);
            rsAtracciones = stmAtracciones.executeQuery();

            atraccion = new Atraccion(rsAtracciones.getString("nombre"), rsAtracciones.getInt("aforo"), rsAtracciones.getInt("alturamin"), rsAtracciones.getString("ubicacion"), rsAtracciones.getString("descripcion"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmAtracciones.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return atraccion;   //MANOTE: Esto supongo que lo tiene que recoger algo de la interfaz y darle un tratamiento adecuado
    }
    

    
    public ArrayList<Atraccion> beneficiosPorAnho(String anho){
        ArrayList<Atraccion> resultado = new java.util.ArrayList<>();
        ResultSet rsConsultaBeneficios;
        PreparedStatement stmBeneficios = null;
        String inicioAnho = anho + "-01" + "-01";   
        String finAnho = anho + "-12" + "-31";
        
        try {
            stmBeneficios = conexion.prepareStatement("select i.atraccion, sum(case when i.vip='NO' then 6\n" +
                "when i.vip='SI' then 12 end)-avg(a.costemantenimiento)  as Beneficios\n" +
                "from ir i, atracciones a\n" +
                "where a.nombre =i.atraccion \n" +
                "and i.fechavisita >= ?\n" +
                "and i.fechavisita <=?\n" +
                "group by(i.atraccion)");           
            stmBeneficios.setDate(1, java.sql.Date.valueOf(inicioAnho));
            stmBeneficios.setDate(2, java.sql.Date.valueOf(finAnho));
            
        
            rsConsultaBeneficios = stmBeneficios.executeQuery();
            while (rsConsultaBeneficios.next()) {
               
                Atraccion atraccion = new Atraccion(rsConsultaBeneficios.getString(1),rsConsultaBeneficios.getFloat(2));
                resultado.add(atraccion);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmBeneficios.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;  
    
    
    }
    
    
    
    
    
    
    public ArrayList<String> añosRegistrados() {
        ArrayList<String> resultado = new java.util.ArrayList<>();

        ResultSet rsAtracciones;
        PreparedStatement stmAtracciones = null;
        
        try {
            stmAtracciones = conexion.prepareStatement("select distinct (EXTRACT(YEAR FROM fechavisita)) as ano from ir order by  ano asc;"); 
            rsAtracciones = stmAtracciones.executeQuery();
            while (rsAtracciones.next()) {  
                resultado.add(String.valueOf(rsAtracciones.getInt(1)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmAtracciones.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
    
    
    
    public void cerrarAtraccion(String nombre){
        PreparedStatement stmAtraccion = null;
        try{
            stmAtraccion = conexion.prepareStatement("DELETE from atracciones where nombre =?");
            stmAtraccion.setString(1,nombre);
            stmAtraccion.executeUpdate();
            
        }catch(SQLException ex){
            Logger.getLogger(AtraccionesDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        
        }
    }
 public ArrayList<Trabajador> consultarTrabajadorAtracciones() {  //FA2  

        ArrayList<Trabajador> resultado = new java.util.ArrayList<>();
        Trabajador trabajactual;
        
        ResultSet rsTrabajador;
        PreparedStatement stmTrabajador = null;

        try {
            stmTrabajador = conexion.prepareStatement("SELECT dni, nombre, direccion, salario, telefono, fechainicio, fechanacimiento, nombreatraccion, nombreespectaculo FROM trabajadoresparque");
            rsTrabajador = stmTrabajador.executeQuery();
            while (rsTrabajador.next()) {  
                trabajactual = new Trabajador(rsTrabajador.getString("DNI"), rsTrabajador.getString("nombre"), rsTrabajador.getString("direccion"), rsTrabajador.getFloat("salario"), rsTrabajador.getString("telefono"), rsTrabajador.getString("fechainicio"), rsTrabajador.getString("fechanacimiento"), rsTrabajador.getString("nombreatraccion"), null);
                if(rsTrabajador.getString("nombreatraccion") != null){
                resultado.add(trabajactual);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmTrabajador.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;   
    }

}
