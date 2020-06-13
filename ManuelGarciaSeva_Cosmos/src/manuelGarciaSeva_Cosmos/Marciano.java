package manuelGarciaSeva_Cosmos;

public class Marciano extends Alienigena{
    boolean visible;

    public Marciano(){

    }
    public Marciano(String name, int vida, boolean visible, boolean vivo) {
        super(name, vida, vivo);
        this.visible=visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Marciano" +
                "\nvisible= " + visible +
                "\nname= " + name +
                "\nvida= " + vida;
    }
}
