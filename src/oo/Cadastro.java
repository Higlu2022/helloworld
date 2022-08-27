package oo;

public class Cadastro {

	private String nome;
	private String sobrenome;
	private int idade;

	// Construtores

	public Cadastro() {

	}

	public Cadastro(String nome, String sobrenome) {

		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Cadastro(String nome, String sobrenome, int idade) {

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	// Método

	public String mostrar() {

		return "\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade;

		
	}

	// Setter

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
