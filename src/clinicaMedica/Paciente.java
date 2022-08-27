package clinicaMedica;

import java.util.Date;

public class Paciente {

	String nome;
	String rg;
	String endereco;
	String telefone;
	Date dataNascimento;
	String profissao;

	// 1ª modificador de acesso
	// 2º tipo de retorno (primitivo ou Objeto)
	// 3ª nome (qualquer nome que vc quiser dar)
	// 4ª assinatura (parametros do metodo)

	public boolean verificarPacienteCadastrado(String rg) {
		String rgBD = "471571058-70";

		if (rgBD == (rg)) {
			return true;
		} else {
			return false;
		}

	}

	public void adicionarPaciente() {

	}

	public Paciente getPaciente() {
		return null;
	}

	public Paciente getConsulta() {
		return null;
	}

	public void adicionarConsulta() {

	}

	public void localizarPaciente() {

	}

	public String cadastrarPaciente(String nome, String rg) {
		return this.nome = nome;
	}

}
