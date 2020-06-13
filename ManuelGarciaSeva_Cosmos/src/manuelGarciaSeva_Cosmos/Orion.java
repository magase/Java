package manuelGarciaSeva_Cosmos;

public class Orion extends Alienigena{
    int potencia;
public Orion(){

}
    public Orion(String name, int vida,  boolean vivo, int potencia) {
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
        return "Orion" +
                "\nname= " + name +
                "\nvida= " + vida;
    }
}
