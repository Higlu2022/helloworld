package oo;

public class Cap8_Lab1 {

	public static int maiorNumero(int[] lista) {

		int maior = 0;

		for (int i : lista) {
			if (i > maior) {
				maior = i;
			}
		}

		return maior;

	}

}
