package inventario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;
    private JTextField marcaTextField;
    private JTextField modeloTextField;
    private JTextField productoTextField;
    private JTextField numeroSerieTextField;
    private JTextField textField1;
    private JButton guardarButton;
    private JTextField textField2;
    private JPanel mostrarItems;
    private JButton actualizarProducto;
    private JButton verTodosLosProductosButton;
    private JButton agregarProductosButton;
    private JPanel agregarPanel;
    private int id;

    static int idHardware(){
        int id;

        for (id =0; id <=GuardarArchivos.BaseDatosHardware.size(); id++)
            id=GuardarArchivos.BaseDatosHardware.size();

        return id;
    }

    public Ventana(){

        add(rootPanel);
        setTitle("Inventario de Manuel");
        setSize(650, 500);



        marcaTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                marcaTextField.setText(marcaTextField.getText());
            }
        });
        modeloTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloTextField.setText(modeloTextField.getText());
            }
        });

        productoTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productoTextField.setText(productoTextField.getText());
            }
        });

        numeroSerieTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroSerieTextField.setText(numeroSerieTextField.getText());
            }
        });
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, " Marca: " +marcaTextField.getText() +
                        "\n Modelo: "+ modeloTextField.getText()+
                        "\n Producto: "+ productoTextField.getText()+
                        "\n Número de Serie: " + numeroSerieTextField.getText());


                Hardware hardware = new Hardware(id, marcaTextField.getText(), modeloTextField.getText(), productoTextField.getText(), numeroSerieTextField.getText());

                GuardarArchivos.BaseDatosHardware.add(hardware);
                JOptionPane.showMessageDialog(null, hardware.toString());

            }
        });



    }


}

