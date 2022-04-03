package proyectobasesdatos;

import BaseDatos.AsistirDAO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import BaseDatos.DAOUsuarios;
import BaseDatos.AtraccionesDAO;
import BaseDatos.ComerDAO;
import BaseDatos.EspectaculosDAO;
import BaseDatos.HosteleriaDAO;
import BaseDatos.IrDAO;
import java.sql.*;

/**
 *
 * @author alumnogreibd
 */
public class ProyectoBasesDatos {

    private java.sql.Connection conexion;
    private GUI.FachadaGui fgui;
    private AtraccionesDAO atraccionesDAO;
    private EspectaculosDAO espectaculosDAO;
    private DAOUsuarios daoUsuarios;
    private HosteleriaDAO hosteleriaDAO;
    private IrDAO irDAO;
    private AsistirDAO asistirDAO;
    private ComerDAO comerDAO;

    public ProyectoBasesDatos() throws SQLException {
        fgui = new GUI.FachadaGui(this);//Inicializar la fachada GUI enlazandola con este "main" de la aplicacion

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error");
        }
        String url = "jdbc:postgresql://localhost:5432/Parque";
        String usuario = "alumnogreibd";
        String contrasenha = "greibd2021";
        this.conexion = DriverManager.getConnection(url, usuario, contrasenha);
        atraccionesDAO = new AtraccionesDAO(conexion);
        daoUsuarios = new DAOUsuarios(conexion);
        espectaculosDAO = new EspectaculosDAO(conexion);
        hosteleriaDAO = new HosteleriaDAO(conexion);
        irDAO = new IrDAO(conexion);
        asistirDAO = new AsistirDAO(conexion);
        comerDAO = new ComerDAO(conexion);
    }

    public IrDAO getIrDAO() {
        return irDAO;
    }

    public AsistirDAO getAsistirDAO() {
        return asistirDAO;
    }

    public ComerDAO getComerDAO() {
        return comerDAO;
    }

    public AtraccionesDAO getAtraccionesDAO() {
        return atraccionesDAO;
    }

    public HosteleriaDAO getHosteleriaDAO() {
        return hosteleriaDAO;
    }

    public EspectaculosDAO getEspectaculosDAO() {
        return espectaculosDAO;
    }

    public Connection getConexion() {
        return conexion;
    }

    public boolean validarUsuario(String idUsuario, String clave) {
        return daoUsuarios.validarUsuario(idUsuario, clave);
    }

    public DAOUsuarios getDaoUsuarios() {
        return daoUsuarios;
    }

    public static void main(String[] args) throws SQLException {
        proyectobasesdatos.ProyectoBasesDatos fa = new ProyectoBasesDatos();
        fa.fgui.iniciaVista();
    }

}
