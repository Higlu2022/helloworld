package TryCatch;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ExercicioGravacao {
    public static void main(String[] args) {

        /**
         *
         * @author
         *
         */

        String frase;

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma frase qualquer: ");
            frase = scanner.nextLine();

            PrintWriter writer = new PrintWriter("C:\\Teste\\Teste.txt");
            writer.println(frase);
            writer.close();
        } catch (IOException e) {
            System.out.println("“Falha ao gravar as informações digitadas”");

        }
    }


}
