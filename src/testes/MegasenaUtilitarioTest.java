package testes;
import TestesUnitarios.MegasenaUtilitario;
import org.junit.Test;
import static org.junit.Assert.*;


public class MegasenaUtilitarioTest {

    @Test
    public void validarSortearNumeroMenor() {
        int numero = MegasenaUtilitario.sortearNumero();
        System.out.println(MegasenaUtilitario.sortearNumero());
        assertTrue(numero <= 60);
    }

    @Test
    public void validarSortearNumeroMaior() {
        int numero = MegasenaUtilitario.sortearNumero();
        System.out.println(MegasenaUtilitario.sortearNumero());
        assertFalse(numero >= 60);
    }

    @Test
    public void validarSorteadorNumeroEntreZeroESessenta() {
        int numero = MegasenaUtilitario.sortearNumero();
        System.out.println(MegasenaUtilitario.sortearNumero());
        assertTrue(numero >= 1 && numero <= 60);

    }

}
