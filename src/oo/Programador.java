package oo;

public class Programador extends Funcionario {
	
	String linguagem;
	String sistemaOperacional;
	


	public Programador(String nome, 
			String email, 
			int idade, 
			char sexo, 
			String linguagem, 
			String sistemaOperacional) {
		
		super(nome, email, idade, sexo);
		
		this.linguagem = linguagem;
		this.sistemaOperacional = sistemaOperacional;
	}



	@Override
	public String toString() {
		return "Programador [nome=" + super.getNome() + ", linguagem=" + linguagem + ", sistemaOperacional=" + sistemaOperacional + ", email=" + email
				+ ", idade=" + idade + ", sexo=" + sexo + "]";
	}




	
		
	
	

}
