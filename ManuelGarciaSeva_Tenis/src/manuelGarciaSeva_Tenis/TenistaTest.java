package manuelGarciaSeva_Tenis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenistaTest {

    @Test
    void setNivelR() {

        int resultadoReal = new Tenista("Nadal",9,9,8,9,10,27,26).getNivelR();

        int resultadoEsperado = 27;

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void setNivelL() {

        int resultadoReal = new Tenista("Nadal",9,9,8,9,10,27,26).getNivelL();

        int resultadoEsperado = 26;

        assertEquals(resultadoEsperado, resultadoReal);
    }


}