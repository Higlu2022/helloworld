package br.com.impacta.prateleiradigital.apresentacao;

import java.util.Scanner;

import br.com.impacta.prateleiradigital.negocio.Filme;

public class ListarERemoverFilme {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("*** Remover um filme \n");

		Filme filme = new Filme();

		System.out.println("Insira um titulo: ");
		filme.setTitulo(scanner.nextLine());
		
		//TODO Criar o metodo para buscar o filme e depois excluir
		
		System.out.println("O filme " + filme.getTitulo() + " foi removido com sucesso !!!");

	}

}
