package helloworld;

public class Variaveis {

	public static void main(String[] args) {
		
		
		//Mudando o valor das variáveis 
		int numero = 10;
		System.out.println("Numero vale " + numero);
		
		numero = 20;
		System.out.println("Numero agora vale " + numero);
		
		numero += 50;
		System.out.println("Numero ta valendo " + numero);
		
		
		// Operador de somar + Cast
		byte tipobyte = 126;
		long tipolong = 1;
		tipobyte += (byte)tipolong;
		System.out.println(tipobyte);
		
		// Compare To
		Long tipoLongWrapper = (long) 10;
		tipoLongWrapper.compareTo((long) 10);
		boolean comparacao = tipoLongWrapper == 10;
		System.out.println(comparacao);
		
		//Operador de divisão e resto
		double divisao = 3.0 / 2.0;
		System.out.println(divisao);
		
		double resto = 3.0 % 2.0;
		System.out.println(resto);
		
		boolean eParOuImpar = resto !=0;
		System.out.println("boolean: " + eParOuImpar);
		
		
		//Validação de operadores de comparação
		int valor1 = 30;
		int valor2 = 20;
		
		boolean validacaoDeOperador = valor1 > valor2;
		validacaoDeOperador = valor1 >10 && valor2 < 20;
		System.out.println(validacaoDeOperador);
		
		validacaoDeOperador = valor1 >10 || valor2 < 20;
		System.out.println(validacaoDeOperador);
		
		
		
		
	}
	
}
