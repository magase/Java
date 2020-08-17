package inventario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JLabel myLabel;
    private JPanel rootPanel;
    private JButton actualizarProducto;
    private JButton verTodosLosProductosButton;
    private JButton borrarProductoButton;
    private JButton agregarProductosButton;


    public Ventana(){

        add(rootPanel);
        setTitle("Inventario de Manuel");
        setSize(400, 500);
        actualizarProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Este boton funciona");
            }
        });
    }


}
