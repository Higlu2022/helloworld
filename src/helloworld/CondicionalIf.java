package helloworld;

public class CondicionalIf {
	public static void main(String[] args) {

		int tempoObrigatorioDeTrabalho = 30;
		String sexo = "Feminino";
		int tempoDeTrabalho = 30;
		int idade = 20;

		if (sexo.equals("Masculino")) {
			if (tempoDeTrabalho >= tempoObrigatorioDeTrabalho && idade >= 60) {
				System.out.println(sexo + " pode se aposentar");
			} else {
				System.out.println(
						sexo + " precisa trabalhar mais " + (tempoObrigatorioDeTrabalho - tempoDeTrabalho ) + " anos");

			}

		} else {
			if (tempoDeTrabalho >= tempoObrigatorioDeTrabalho - 5 && idade >= 60 - 5) {
				System.out.println(sexo + " pode se aposentar");
			} else {
				System.out.println(sexo + " precisa trabalhar mais: " + (tempoObrigatorioDeTrabalho - 5  ) + " anos");
			}
		}

	}

}
