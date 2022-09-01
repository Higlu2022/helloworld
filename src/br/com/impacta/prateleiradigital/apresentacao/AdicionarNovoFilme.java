package br.com.impacta.prateleiradigital.apresentacao;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class AdicionarNovoFilme {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("*** Adicionar um novo filme ***\n");
            /**
             *  Solicitando os dados de cadastro do filme
             */

            System.out.println("Insira o titulo do filme: ");
            String titulo = scanner.nextLine();

            System.out.println("Insira os diretores do filme: ");
            String diretores = scanner.nextLine();

            System.out.println("Insira a nota do filme do filme: ");
            double nota = Double.parseDouble(scanner.nextLine());

            System.out.println("Insira a duração do filme: ");
            int duracao = Integer.parseInt(scanner.nextLine());

            System.out.println("Insira o ano do filme: ");
            int ano = Integer.parseInt(scanner.nextLine());

            System.out.println("Insira o gênero do filme: ");
            String genero = scanner.nextLine();

            System.out.println("Insira a quantidade de votos do filme: ");
            int numDeVotos = Integer.parseInt(scanner.nextLine());

            System.out.println("Insira a URL do filme: ");
            String url = scanner.nextLine();


            /**
             * Passando os valores obtidos para a Class Filme
             */
            Filme filme = new Filme(titulo, diretores, nota, duracao, ano, genero, numDeVotos, url);

            /**
             * Chamando o método de adicionar filme da Class Controlador
             * Instancia e uso do objeto ao mesmo tempo, recomendado em casos onde o retorno não importa (Não é salvo em atributo)
             */
            new FilmeControlador().adicionar(filme);


            /**
             * Tratamento de erros
             */
        } catch (NumberFormatException e) {
            System.out.println("Insira um valor numérico");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
