package inventario;

import javax.swing.*;

public class VentanaAgregar extends JFrame{
    private JPanel agregarPanel;
    private JTextField capacidadTextField;
    private JTextField parteTextField;
    private JTextField marcaTextField;
    private JTextField modeloTextField;
    private JButton guardarButton;

    public VentanaAgregar (){
        add(agregarPanel);
        setTitle("Inventario de Manuel");
        setSize(400, 500);
    }
}
