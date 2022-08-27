package oo;

public class Exemplo1 {
	
	public static void main(String[] args) {
		
		int numero= 30;
		int numero2 = numero;
		
		System.out.println("numero: " + numero);
		System.out.println("numero2: " + numero2);
		
		System.out.println("*******************");
		
		Pessoa pessoa1 = new Pessoa("Maria", "123123123-12", 10L);
		Pessoa pessoa2 = new Pessoa("João");
		Pessoa pessoa3 = new Pessoa();
		
		pessoa2.setCpf("44");
		
	System.out.println(
			" nome: " + pessoa1.getNome() +
			", cpf: " + pessoa1.getCpf() + 
			", idade: " + pessoa1.getIdade());
		
	System.out.println(
			" nome: " + pessoa2.getNome() +
			", cpf: " + pessoa2.getCpf() + 
			", idade: " + pessoa2.getIdade());
	System.out.println("*******************");
	
	pessoa1.setCpf(pessoa2.getCpf());
	pessoa3 = pessoa1;
	
	System.out.println(
			" nome: " + pessoa1.getNome() +
			", cpf: " + pessoa1.getCpf() + 
			", idade: " + pessoa1.getIdade());
	
	System.out.println(
			" nome: " + pessoa2.getNome() +
			", cpf: " + pessoa2.getCpf() + 
			", idade: " + pessoa2.getIdade());
	
	System.out.println(
			" nome: " + pessoa3.getNome() +
			", cpf: " + pessoa3.getCpf() + 
			", idade: " + pessoa3.getIdade());
	
	System.out.println("*******************");
	
	pessoa2 = pessoa1;
	
	System.out.println(
			" nome: " + pessoa2.getNome() +
			", cpf: " + pessoa2.getCpf() + 
			", idade: " + pessoa2.getIdade());
	
	System.out.println(pessoa1);
	System.out.println(pessoa1.toString());
	
	
	Calculadora calculadora = new Calculadora();
	calculadora.somar(10, 20);
	
	}
}

