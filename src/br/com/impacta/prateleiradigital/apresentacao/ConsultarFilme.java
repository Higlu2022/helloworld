package br.com.impacta.prateleiradigital.apresentacao;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ConsultarFilme {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            FilmeControlador filmeControlador = new FilmeControlador();

            System.out.println("*** Consultar um Filme *** \n");

            System.out.println("Insira um titulo parcial: ");
            String tituloParcial = scanner.nextLine();

            System.out.println("Insira um gênero: ");
            String genero = scanner.nextLine();

            System.out.println("Insira um ano: ");
            String ano = scanner.nextLine();
            int anoConvertido = Integer.parseInt(ano);


            List<Filme> filmeLista = filmeControlador.consultarFilmes(genero, anoConvertido, tituloParcial);

            if (filmeLista.size() > 0) {
                filmeLista.forEach(filme -> System.out.println(filme));
            } else {
                System.out.println("Nenhum filme encontrado!!!");
            }

        } catch (RuntimeException e) {

            System.out.println(e);

        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }
}
