package oo;

public class AlunoHer extends PessoaHer {

	private float mensalidade;
	private String curso;

	public AlunoHer(String nome, int idade, char sexo, RG rg, float mensalidade, String curso) {
		super(nome, idade, sexo, rg);
		this.mensalidade = mensalidade;
		this.curso = curso;
	}

	@Override
	public String falar(String fala) {

		return getNome() + " : " + fala;

	}

	@Override
	public void mostrarDados() {

		System.out.println(" --- Aluno: " + getNome() + " ---" + "\n Idade: " + idade + "\n Sexo: " + sexo + "\n Curso: " + curso + "\n Mensalidade: " + mensalidade + " " + rg + "\n");

	}

}
