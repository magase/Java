package inventario;

import javax.swing.*;

public class Ventana extends JFrame{
    private JButton myBoton;
    private JLabel myLabel;
    private JPanel rootPanel;


    public Ventana(){

        add(rootPanel);
        setTitle("Inventario de Manuel");
        setSize(400, 500);
    }

}
