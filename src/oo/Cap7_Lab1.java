package oo;

public class Cap7_Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cadastro cadastro1 = new Cadastro();
		Cadastro cadastro2 = new Cadastro("Maria", "Souza");
		Cadastro cadastro3 = new Cadastro("João", "Mirim", 25);

		cadastro1.setNome("Fernando");

		System.out.println(cadastro1.mostrar());
		System.out.println(cadastro2.mostrar());
		System.out.println(cadastro3.mostrar());

	}

}
