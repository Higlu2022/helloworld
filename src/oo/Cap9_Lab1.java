package oo;

public class Cap9_Lab1 {

	public static void main(String[] args) {

		PessoaHer manuel = new ProfessorHer("Regis", 24, 'M', new RG (505081404, "28/10/1997"), 3000f, "Inglês");
		PessoaHer higor  = new AlunoHer ("Higor",  25, 'M', new RG (512563652, "11/09/2022"), 1200f, "Inglês");
		PessoaHer maria  = new AlunoHer ("Maria",  22, 'F', new RG (501236524, "28/10/2000"), 500f, "Porgramação");

		System.out.println(manuel.falar("Higor?"));
		System.out.println(higor.falar("Presente"));
		System.out.println(manuel.falar("Maria?"));
		System.out.println(maria.falar("Presente\n"));

		System.out.println("************************\n");

		manuel.mostrarDados();
		higor.mostrarDados();
		maria.mostrarDados();

	}

}
