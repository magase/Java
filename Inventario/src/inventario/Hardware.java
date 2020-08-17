package inventario;

import javax.swing.*;
import java.util.ArrayList;

public class Hardware {

    public enum Parte {
        RAM, PLACA_BASE, PROCESADOR, ALMACENAMIENTO, TARJETA_GRAFICA, TARJETA_SONIDO, USB, MONITOR, TECLADO, RATON, CAMARA, OTRO
    }

    private int capacidad, id;
    private String marca, modelo;
    String parte;

    public Hardware(){

    }


    public Hardware (int id, int capacidad, String marca, String modelo, String parte){

        this.id = id;
        this.capacidad = capacidad;
        this.marca = marca;
        this.modelo = modelo;
        this.parte = parte;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getParte() {
        return parte;
    }

    public void setParte(String parte) {
        this.parte = parte;
    }


    public String toString() {
        return "Hardware" +
                "Id= " + id +
                "\n capacidad= "  + capacidad +
                "\n marca= " + marca +
                "\n modelo= " + modelo +
                "\n parte= " + parte;
    }
}
