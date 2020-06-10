package miFutbol;

public class Portero extends Jugador {
    int valor, paradas;



    public Portero(String nombre, String apellido1, String apellido2, String apodo, int dorsal, int goles, int pases, int tarjetas, int valor, int paradas, Equipo equipo) {
        super(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, equipo);
        this.paradas=paradas;
        this.valor=valor;
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int goles, int pases, int paradas){
        this.valor = goles*pases*paradas;
    }

    public int getParadas() {
        return paradas;
    }

    public void setParadas(int paradas) {
        this.paradas = paradas;
    }
}