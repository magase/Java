package manuelGarciaSeva_Cosmos;

import javax.swing.*;

public class Jupiter extends Alienigena{
    int potencia;
public Jupiter(){

}
    public Jupiter(String name, int vida,  boolean vivo, int potencia) {
        super(name, vida, vivo);
        this.potencia=potencia;

    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Jupiter" +
                "\nname= " + name +
                "\nvida= " + vida;
    }
}
