package miFutbol;

import java.io.Serializable;

public class Defensa extends Jugador  {
    int valor, jugadasCortadas;



    public Defensa(String nombre, String apellido1, String apellido2, String apodo, int dorsal, int goles, int pases, int tarjetas, int valor, int jugadasCortadas, Equipo equipo) {
        super(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, equipo);
        this.jugadasCortadas=jugadasCortadas;
        this.valor=valor;
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int goles, int pases, int jugadasCortadas){
        this.valor = goles*pases*jugadasCortadas;
    }

    public int getJugadasCortadas() {
        return jugadasCortadas;
    }

    public void setJugadasCortadas(int jugadasCortadas) {
        this.jugadasCortadas = jugadasCortadas;
    }

    @Override
    public String toString() {

        return  "Defensa "+
                "\nNombre= " + nombre +
                "\nPrimer apellido = " + apellido1 +
                "\nSegundo apellido= " + apellido2 +
                "\nApodo= " + apodo +
                "\nDorsal= " + dorsal +
                "\nGoles= " + goles +
                "\nPases= " + pases +
                "\nJugadas cortadas = " + jugadasCortadas +
                "\nTarjetas= " + tarjetas +
                "\nEquipo= " + equipo;
    }
}
