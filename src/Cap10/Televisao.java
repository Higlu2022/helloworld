package Cap10;

public class Televisao implements Eletrodomesctico {

	@Override
	public void ligar() {
		System.out.println("Ligando a televisão");

	}

	@Override
	public void desligar() {
		System.out.println("Desligando a televisão");

	}

	public void trocarCanal() {
		System.out.println("Trocando de canal");

	}

}
