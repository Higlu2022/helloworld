package clinicaMedica;

import java.util.Date;

public class ClinicaMedicaApp {
	
	
public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		paciente1.nome = "Alex";
		paciente1.rg = "213213213.x";
		paciente1.endereco = "rua 3";
		paciente1.telefone = "11-123123123";
		paciente1.dataNascimento = new Date("20/07/1986");
		paciente1.profissao = "Desenvolvedor Java";
		
		boolean verificaPaciente = 
				paciente1.verificarPacienteCadastrado("12312312-x");
		
		System.out.println("valor do metodo: " 
		+ verificaPaciente);
		
		if(!verificaPaciente) {
			paciente1.cadastrarPaciente("Alex", "132132132");
			System.out.println("Paciente cadastrado com sucesso!!!");
		}
		
		
		Paciente paciente2 = new Paciente();
//		System.out.println(paciente2 + 
//				paciente2.cadastrarPaciente("Alex", "2313213232"));
		
		
		
		
		
	}

}
	