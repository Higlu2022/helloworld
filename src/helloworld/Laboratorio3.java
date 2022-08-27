package helloworld;

public class Laboratorio3 {
	public static void main(String[] args) {

		Meses mes = Meses.MARCO;
		
		
		switch (mes) {
		case JANEIRO:
			System.out.println("Janeiro tem 31 Dias ");
			break;
		case FEVEREIRO:
			System.out.println("Fevereiro tem 29 Dias");
			break;
		case MARCO:
			System.out.println("Março tem 31 Dias ");
			break;
		case ABRIL:
			System.out.println("Abril tem 30 Dias");
			break;
		case MAIO:
			System.out.println("Maio tem 31 Dias");
			break;
		case JUNHO:
			System.out.println("Junho tem 30 Dias ");
			break;
		case JULHO:
			System.out.println("Julho tem 31 Dias");
			break;
		case AGOSTO:
			System.out.println("Agosto tem 31 Dias");
			break;
		case SETEMBRO:
			System.out.println("Setembro tem 30 Dias");
			break;
		case OUTUBRO:
			System.out.println("Outubro tem 31 Dias ");
			break;
		case NOVEMBRO:
			System.out.println("Novembro tem 30 dias ");
			break;
		case DEZEMBRO:
			System.out.println("Dezembro tem 31 dias ");

		default:
			break;
		}

	}

}
