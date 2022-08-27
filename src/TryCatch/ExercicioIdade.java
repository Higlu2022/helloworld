package TryCatch;

import java.util.Scanner;

public class ExercicioIdade {


    public static void main(String[] args) {

        String valor;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o ano do nascimento:");

            valor = scanner.nextLine();

            int valorInt = Integer.parseInt(valor);

            System.out.println("Sua idade é igual a: " + (2022 - valorInt));
        } catch (NumberFormatException e) {
            System.out.println("Valor digitado inválido");

        }

    }


}
