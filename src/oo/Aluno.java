package oo;

public class Aluno {

	private String nome;
	public static int contadorDeAlunos;


	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String imprimeAluno() {

		return "Aluno: " + nome + "\nContador de alunos: " + contadorDeAlunos;
	}

	
	
	// Cap6 Lab3_1
	
	public Aluno(String nome) {
		this.nome = nome;
		contadorDeAlunos++;

	}

	public Aluno() {

	}

}

