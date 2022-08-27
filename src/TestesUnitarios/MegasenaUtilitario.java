package TestesUnitarios;

import java.util.Random;

public class MegasenaUtilitario {


    public static int sortearNumero() {

        Random sorteador = new Random();
        int numero = sorteador.nextInt(60) + 1;

        return numero;
    }
}
