package oo;

public class RG {

	private int numero;
	private String dataNasc;

	public RG(int numero, String dataNasc) {
		this.numero = numero;
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "\n Número RG: " + numero + "\n Data de nascimento: " + dataNasc;
	}

}
