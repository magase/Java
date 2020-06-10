package miFutbol;

import java.io.Serializable;

public abstract class Jugador implements Serializable {
    String nombre, apellido1, apellido2, apodo;
    int dorsal, goles, pases, tarjetas;
    Equipo equipo;


    public Jugador(String nombre, String apellido1, String apellido2, String apodo, int dorsal, int goles, int pases, int tarjetas, Equipo equipo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.apodo = apodo;
        this.dorsal = dorsal;
        this.goles = goles;
        this.pases = pases;
        this.tarjetas = tarjetas;
        this.equipo =equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(int tarjetas) {
        this.tarjetas = tarjetas;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador" +
                "\nNombre= " + nombre +
                "\nPrimer apellido = " + apellido1 +
                "\nSegundo apellido= " + apellido2 +
                "\nApodo= " + apodo +
                "\nDorsal= " + dorsal +
                "\nGoles= " + goles +
                "\nPases= " + pases +
                "\nTarjetas= " + tarjetas +
                "\nEquipo= " + equipo;
    }
}
