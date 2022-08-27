package oo;

public class ArrayBidimensional {

	public static void main(String[] args) {

		double[][] notas = new double[23][3];

		notas[0][0] = 7.5;
		notas[0][1] = 10.0;
		notas[0][2] = 3.0;

		notas[1][0] = 5.0;
		notas[1][1] = 4.0;
		notas[1][2] = 7.0;

		notas[2][0] = 8.5;
		notas[2][1] = 0.0;
		notas[2][2] = 6.0;

		notas[3][0] = 7.5;
		notas[3][1] = 4.0;
		notas[3][2] = 3.0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Primeiro For: " + i);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Segundo For: " + j);
				System.out.println("Nota " + j + ": " + notas[i][j]);
			}

		}
		
		

		
//		for (int i = 0; i < notas.length; i++) {
//			System.out.println("primeiro for: " + i);
//			for (int j = 0; j < notas[i].length; j++) {
//				System.out.println("segundo for: " + j);
//				System.out.println("nota " + j + ": " +notas[i][j]);
//			}
//		}
		
//		int aluno =0;
//		for(double[] ds: notas) {
//			aluno++;
//			for(double d: ds ) {
//				System.out.println("Aluno " + aluno + " Nota: " + d);
//			}
//			
//		}
		

	}

}
