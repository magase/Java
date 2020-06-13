package manuelGarciaSeva_Cosmos;

import javax.swing.*;

public interface Ataques {

    static void ataqueAMar(Marciano m, int potencia){
        m.setVida(m.getVida()-potencia);
        if (m.getVida() <=3){
            m.setVisible(false);

        }if(m.getVida() <=0){
            m.setVivo(false);
        }
    }

    static void ataqueGenerico(Jupiter j, Orion o){
        int turno = (int)Math.floor(Math.random()*10);
        if (turno > 5) {
            j.setVida(j.getVida() - o.getPotencia());
            if (j.getVida() <= 0) {
                j.setVivo(false);
            }
        }if (turno < 5) {
            o.setVida(o.getVida() - j.getPotencia());
            if (o.getVida() <= 0) {
                o.setVivo(false);

            }
        }else {
            JOptionPane.showMessageDialog(null, "Los 2 han fallado");
        }
    }

}
