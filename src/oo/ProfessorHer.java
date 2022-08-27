package oo;

public class ProfessorHer extends PessoaHer {

	private float salario;
	private String disciplina;

	public ProfessorHer(String nome, int idade, char sexo, RG rg, float salario, String disciplina) {
		super(nome, idade, sexo, rg);
		this.salario = salario;
		this.disciplina = disciplina;
	}

	@Override
	public String falar(String fala) {

		return getNome() + " : " + fala;

	}

	@Override
	public void mostrarDados() {

				
		System.out.println(" --- Professor: " + getNome() + " ---" + "\n Idade: " + idade + "\n Sexo: " + sexo + "\n Salário: " + salario + "\n Disciplina: " + disciplina + " " + rg + "\n");
	}

}
