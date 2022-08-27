package oo;

public class Array {

	public static void main(String[] args) {

		// 0 1 2 3 4
		int[] array2 = { 1, 2, 3, 4, 5 };

		String[] array3 = { "João", "Maria", "Fred", "Antonio" };
		
		String [] array4 = new String[10];
		int [] array5 = new int [5];
		array5[0] = 666;
		System.out.println("Valor definido da lista: " + array5[0]);
		
		
		
		
		System.out.println("Quantidade na lista: " + array4.length);

		// int posicao = 0;
		// System.out.println("Na posição " + posicao + " contém o valor " +
		// array2[posicao]);

		// for (int i = 0; i < array3.length; i++) {
		// System.out.println(array3[i]);
		//
		// }

		for (String cadaElemento : array3) {

			System.out.println(cadaElemento);
		}

	}

}
