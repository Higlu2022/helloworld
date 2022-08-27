package oo;

public class AtributoEstatico {
	public static void main(String[] args) {

		Classe classeA = new Classe();
		Classe classeB = new Classe();
		Classe classeC = new Classe();

		classeA.ano = 2022;

		classeA.classe = "a";
		classeB.classe = "b";
		classeC.classe = "c";

		System.out.println(classeA);
		System.out.println(classeB);
		System.out.println(classeC);

		classeC.ano = 2021;

		System.out.println(classeA);
		System.out.println(classeB);
		System.out.println(classeC);

		System.out.println("Atributo estático " + Classe.ano);
		
		//Atributos Staticos não precisam ser declarados

	}

}

