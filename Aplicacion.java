import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicacion {
    public JPanel APP;
    private JTextField Input_servidor;
    private JTextField Input_usuario;
    private JTextField Input_contrasena;
    private JTextField Input_basedatos;
    private JTextField Input_nombre;
    private JTextField Input_pasatiempo;
    private JTextField Input_descripcion;
    private JButton registrarButton;
    private Conexion BDD;

    public Aplicacion() {
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Servidor=Input_servidor.getText();
                String Usuario=Input_usuario.getText();
                String Contrasena=Input_contrasena.getText();
                String BaseDatos=Input_basedatos.getText();
                String URL = "jdbc:mysql://"+Servidor+"/"+BaseDatos;
                BDD = new Conexion(Usuario, Contrasena, URL);
                int filas_afectadas=BDD.Insertar_registros(Input_nombre.getText(), Input_pasatiempo.getText(), Input_descripcion.getText());
                if (filas_afectadas>0){
                    JOptionPane.showMessageDialog(APP, "Registro exitoso");
                }else{
                    JOptionPane.showMessageDialog(APP, "Error al registrar");
                }
            }
        });
    }
}
