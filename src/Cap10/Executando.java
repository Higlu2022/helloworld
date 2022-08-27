package Cap10;

public class Executando {

	public static void main(String[] args) {

		Eletrodomesctico aparelho;

		aparelho = new Geladeira();
		aparelho.ligar();
		aparelho.desligar();

		// Instancia
		Geladeira geladeira = (Geladeira) aparelho;
		geladeira.descongelar();

		System.out.println("\n********************\n");

		aparelho = new Microondas();
		aparelho.ligar();
		aparelho.desligar();

		// Cast
		((Microondas) aparelho).aquecer();
		((Microondas) aparelho).assar();

		System.out.println("\n********************\n");

		// Usando o método estático
		Eletrodomesctico microondas1, geladeira1, televisao1;
		
		

		microondas1 = new Microondas();
		geladeira1 = new Geladeira();
		televisao1 = new Televisao();

		Eletrodomesctico.ligarTudo(microondas1, geladeira1, televisao1);
		
		microondas1.adicionarTimer();

	}

}
