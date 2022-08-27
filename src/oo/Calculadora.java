package oo;

public class Calculadora {

	// Somar, dividir, multiplicar, subtrair

	public long somar(long valor1, long valor2) {

		long resultado = valor1 + valor2;
		return resultado;
	}

	public long multiplicar(long valor1, long valor2) {

		long resultado = valor1 * valor2;
		return resultado;
	}

	public double dividir(double valor1, double valor2) {

		double resultado = valor1 / valor2;
		return resultado;
	}

	public long somar(long... lista) {
		long resultado = 0;

		for (long l : lista) {
			resultado += l;
			System.out.println("A soma dos valores é: " + resultado);

		}

		return resultado;
	}

	public long acharUmNumero(long... lista) {

		for (long l : lista) {
			if (l == 10) {
				return l;
			}
		}
		return 0;

	}

	public int subtrair(int valor1, int valor2) {

		int resultado = valor1 - valor2;
		return resultado;
	}
	
	
	

	public double subtrair(double valor1, double valor2) {

		double resultado = valor1 - valor2;
		return resultado;
	}

	
	public double subtrair(int valor1, double valor2) {

		double resultado = valor1 - valor2;
		return resultado;
	}

	
	public double subtrair(double valor1, int valor2) {

		double resultado = valor1 - valor2;
		return  resultado;
	}

}
