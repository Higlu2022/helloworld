package oo;

import java.util.Date;

public class Pessoa {

	 private String nome;
	 private String cpf;
	 private int idade;
	 private Date dataDeCadastro = new Date();
	 
	 
	public Pessoa(String nome, String cpf, Long idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = (int) setIdade(idade);
	}
	
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa() {}
	
	

	@Override
	public String toString() {
		return "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		// regra para validar o cpf
		this.cpf = cpf;
	}

	public String getNome() {
		return nome.toLowerCase();
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public int getIdade() {
		return idade;
	}

	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}
	
	private long setIdade(long idade) {
		if (idade >= 18) {
			return idade;
		} else {
			System.out.println("não permite cadastro de menor de 18 anos");
			return 0;
		}
	}
}