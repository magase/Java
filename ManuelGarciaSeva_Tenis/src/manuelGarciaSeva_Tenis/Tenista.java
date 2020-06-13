package manuelGarciaSeva_Tenis;

public class Tenista {

    String nombre;
    int resistencia,salud,forma,calidad,potencia, nivelR, nivelL;

    public Tenista(){

    }
    public Tenista(String nombre, int resistencia, int salud, int forma, int calidad, int potencia, int nivelR, int nivelL) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.salud = salud;
        this.forma = forma;
        this.calidad = calidad;
        this.potencia = potencia;
        this.nivelR = nivelR;
        this.nivelL = nivelL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getForma() {
        return forma;
    }

    public void setForma(int forma) {
        this.forma = forma;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNivelR() {
        return nivelR;
    }

    protected void setNivelR(int potencia, int resistencia, int salud, int forma) {
        this.nivelR = potencia+resistencia+(salud+forma)/2;
    }

    public int getNivelL() {
        return nivelL;
    }

    protected void setNivelL(int calidad, int resistencia, int salud, int forma) {
        this.nivelL = calidad+resistencia+(salud+forma)/2;
    }

    @Override
    public String toString() {
        return "Tenista\n" +
                "nombre=" + nombre +
                "\nresistencia=" + resistencia +
                "\nsalud=" + salud +
                "\nforma=" + forma +
                "\ncalidad=" + calidad +
                "\npotencia=" + potencia +
                "\nNivel pista rapido=" + nivelR +
                "\nNivel pista lenta=" + nivelL;

    }
    public String guardar(){
        return nombre + ","+ resistencia +","+ salud+","+ forma+","+ calidad+","+ potencia;
    }
}
