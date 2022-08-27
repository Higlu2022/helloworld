package helloworld;

public class Laboratorio2 {
	public static void main(String[] args) {

		int valor = 21;
		int resto = valor % 2;
		
		boolean valida = resto == 0;

		String resultado = valida ? "Par" : "Impar";
		
		System.out.println(resultado);
		
	}
}
