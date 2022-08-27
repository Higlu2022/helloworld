package oo;

import java.util.Scanner;

public class Cap8_Lab1_exe {

	public static void main(String[] args) {

		Cap8_Lab1 Executar = new Cap8_Lab1();

		int numeros[] = { 99, 2, 50, 4, 5, 6 };

		int maior = Executar.maiorNumero(numeros);

		System.out.println("O maior número da lista é o: " + maior);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int valor = scanner.nextInt();
		System.out.println("Valor que eu inseri: " + valor);

	}

}
