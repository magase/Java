package manuelGarciaSeva_Cosmos;

public abstract class Alienigena implements Ataques {
    String name;
    int vida;
    boolean vivo;

    public Alienigena(){

    }
    public Alienigena(String name, int vida, boolean vivo) {
        this.name = name;
        this.vida = vida;
        this.vivo = vivo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Alienigena" +
                "\nname= " + name +
                "\nvida=" + vida;
    }

    public abstract int getPotencia();
}
