package miFutbol;

public class Delantero extends Jugador {
    int valor, jugadasGol;


    public Delantero(String nombre, String apellido1, String apellido2, String apodo, int dorsal, int goles, int pases, int tarjetas, int valor, int jugadasGol, Equipo equipo) {
        super(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, equipo);
        this.jugadasGol=jugadasGol;
        this.valor=valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int goles, int pases, int jugadasGol){
        this.valor = goles*pases*jugadasGol;
    }

    public int getJugadasGol() {
        return jugadasGol;
    }

    public void setJugadasGol(int jugadasGol) {
        this.jugadasGol = jugadasGol;
    }
}
