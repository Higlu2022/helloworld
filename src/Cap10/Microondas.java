package Cap10;

public class Microondas implements Eletrodomesctico {

	@Override
	public void ligar() {
		System.out.println("Ligando o microondas");
	}

	@Override
	public void desligar() {
		System.out.println("Desligando o microondas");
	}

	public void aquecer() {
		System.out.println("Aquecendo");

	}

	public void assar() {
		System.out.println("Assando");

	}

}