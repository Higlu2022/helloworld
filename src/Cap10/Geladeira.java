package Cap10;

public class Geladeira implements Eletrodomesctico {

	@Override
	public void ligar() {
		System.out.println("Ligando a geladeira");

	}

	@Override
	public void desligar() {
		System.out.println("Desligando a geladeira");

	}

	public void descongelar() {
		System.out.println("Descongelando");

	}

}
