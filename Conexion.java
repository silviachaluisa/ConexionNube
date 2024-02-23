import javax.swing.*;
import java.sql.*;

public class Conexion {
    // Atributos
    private String url;
    private String usuario;
    private String contraseña;
    // Constructor
    public Conexion(String usuario, String contraseña, String url) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.url = url;
    }
    public Conexion(){}

    // Metodos

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int Insertar_registros(String nombre, String pasatiempo, String descripcion){
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            String SQL = "INSERT INTO pasatiempos (nombre, pasatiempos, descripcion) VALUES (?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(SQL);
            sentencia.setString(1, nombre);
            sentencia.setString(2, pasatiempo);
            sentencia.setString(3, descripcion);
            return sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
