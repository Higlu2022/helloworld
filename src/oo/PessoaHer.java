package oo;

public abstract class PessoaHer {



	private String nome;
	int idade;
	char sexo;
	RG rg;

	/**
	 *
	 * @param nome = Nome da pessoa
	 * @param idade = Idade da pessoa
	 * @param sexo = Sexo da pessoa
	 * @param rg = Registro geral da pessoa
	 */

	public PessoaHer(String nome, int idade, char sexo, RG rg) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.rg = rg;
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract String falar(String fala);

	public abstract void mostrarDados();



}
