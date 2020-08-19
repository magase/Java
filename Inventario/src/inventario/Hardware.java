package inventario;

import javax.swing.*;
import java.util.ArrayList;

public class Hardware {

    public enum Parte {
        RAM, PLACA_BASE, PROCESADOR, ALMACENAMIENTO, TARJETA_GRAFICA, TARJETA_SONIDO, USB, MONITOR, TECLADO, RATON, CAMARA, OTRO
    }

    private int  id;
    private String marca, modelo, numeroSerie;
    String parte;

    public Hardware(){

    }


    public Hardware (int id, String marca, String modelo, String parte, String numeroSerie){

        this.id = id;
        this.numeroSerie = numeroSerie;
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

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
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
                "\n Numero de Serie= "  + numeroSerie +
                "\n marca= " + marca +
                "\n modelo= " + modelo +
                "\n parte= " + parte;
    }
}
