package oo;

public class ExecutarCalculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
			
//		System.out.println("A soma dos valores é: " + calculadora.somar(20, 20));
//		System.out.println("A subtração dos valores é: " + calculadora.subtrair(210, 10));
//		System.out.println("A multiplicação dos valores é: " + calculadora.multiplicar(20, 20));
//		System.out.println("A divisão dos valores é: " + calculadora.dividir(20.0, 20.0));
//		System.out.println("A soma de todos os valores é: " + calculadora.somar(10, 20, 30, 40, 50));
//		System.out.println("O valor " + calculadora.acharUmNumero (10, 20, 30, 40, 50, 6) + " tem na lista!!!");
		
		System.out.println("Métodos subtrair sobrecarregados: \n ");
		System.out.println("Chamando a versão de subtrair com 2 double: " + calculadora.subtrair(5.0, 2.0));
		System.out.println("Chamando a versão de subtrair com 1 double e 1 int: " + calculadora.subtrair(5.0, 2));
		System.out.println("Chamando a versão de subtrair com 1 int e 1 double: " + calculadora.subtrair(5, 2.0));
		
	}

}
