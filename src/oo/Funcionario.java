package oo;

public class Funcionario {

	private String nome;
	String email;
	int idade;
	char sexo;
	
	
	public Funcionario(String nome, String email, int idade, char sexo) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", email=" + email + ", idade=" + idade + ", sexo=" + sexo + "]";
	}


	public String getNome() {
		return nome;
	}
	
	
	
	
}
