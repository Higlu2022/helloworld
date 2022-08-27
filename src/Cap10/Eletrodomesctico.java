package Cap10;

public interface Eletrodomesctico {

	void ligar();

	void desligar();

	static void ligarTudo(Eletrodomesctico... lista) {

		for (Eletrodomesctico cadaEletrodomesctico : lista) {
			cadaEletrodomesctico.ligar();
		}

	}
	
	default void adicionarTimer() {
		System.out.println("Aguardar 11s para desligar");
		desligar();
		
		
	}

}
