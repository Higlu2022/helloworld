package testes;

import static org.junit.Assert.*;

import TestesUnitarios.Carro;
import org.junit.Test;

public class CarroTest {

    @Test
    public void TestCarroNull() {
        Carro carro = null;
        assertNull(carro);
    }

    @Test
    public void TesteCarroNotNull() {
        Carro carro = new Carro("FIAT", 2020, "Uno");
        System.out.println(carro.getMarca());
        System.out.println(carro.getAno());
        System.out.println(carro.getModelo());
        assertNotNull(carro);
    }

    // Null é diferente de vazio
    @Test
    public void TesteCarroNotNullSemValor() {
        Carro carro = new Carro();
        System.out.println(carro.getMarca());
        System.out.println(carro.getAno());
        System.out.println(carro.getModelo());
        assertNotNull(carro);
    }

    @Test
    public void TesteCarroComEquals() {
        Carro carro = new Carro("FIAT", 2020, "UNO");
        assertNotNull(carro);
        assertEquals("FIAT", carro.getMarca());
        assertEquals(2020, carro.getAno());
        assertEquals("UNO", carro.getModelo());
        assertNotEquals("Corsa", carro.getMarca());

        System.out.println(carro.getMarca());
        System.out.println(carro.getAno());
        System.out.println(carro.getModelo());
    }
}
