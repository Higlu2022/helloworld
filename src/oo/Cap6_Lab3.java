package oo;

public class Cap6_Lab3 {

	public static void main(String[] args) {

		Aluno joao = new Aluno();
		Aluno maria = new Aluno();
		Aluno marcos = new Aluno();

		joao.setNome("João");
		Aluno.contadorDeAlunos++;
		System.out.println(joao.imprimeAluno());

		maria.setNome("Maria");
		Aluno.contadorDeAlunos++;
		System.out.println(maria.imprimeAluno());

		marcos.setNome("Marcos");
		Aluno.contadorDeAlunos++;
		System.out.println(marcos.imprimeAluno());

	}

}
