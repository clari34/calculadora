package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;

public class Soma2Test {
    Soma s2;

    @BeforeEach
    public void setup() {
        s2 = new Soma();
    }
    @Test
    public void testSoma_ok() {
        assertEquals(11.7, s2.somaDois("7.9", "3.8"));

    }
    @Test
    public void testSomaLetras() {
        assertThrows(IllegalArgumentException.class, ()->{
            s2.somaDois("a", "b");
        });
    }


}