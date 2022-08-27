package br.com.impacta.prateleiradigital.apresentacao;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;
import java.util.List;
import java.util.Scanner;

public class ConsultarFilme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Consultar um Filme *** \n");

        System.out.println("Insira um titulo parcial: ");
        String tituloParcial = scanner.nextLine();

        System.out.println("Insira um gênero: ");
        String genero = scanner.nextLine();

        System.out.println("Insira um ano: ");
        String ano = scanner.nextLine();

        try {
            int anoConvertido = Integer.parseInt(ano);

            FilmeControlador filmeControlador = new FilmeControlador();
            List<Filme> filmeLista = filmeControlador.consultarFilmes(tituloParcial, genero, anoConvertido);

            if (filmeLista.size() > 0) {
                filmeLista.forEach(filme -> System.out.println(filme));
            } else {
                System.out.println("Nenhum filme encontrado");
            }

        } catch (RuntimeException e) {

            System.out.println(e);
            System.out.println("Teste");
        }

    }
}
