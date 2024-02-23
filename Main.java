import javax.swing.*;

public class Main {
    public static void main (String[] args){
        JFrame app1=new JFrame("APP");
        app1.setContentPane(new Aplicacion().APP);
        app1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app1.setVisible(true);
        app1.pack();

    }
}
