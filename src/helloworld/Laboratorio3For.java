package helloworld;

import javax.swing.JOptionPane;

public class Laboratorio3For {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Digite o número correspondente ao mês");

		int mes = Integer.parseInt(input);

		switch (mes) {
		case 1:
			JOptionPane.showMessageDialog(null, mes + " - Janeiro tem 31 dias");

			break;
		case 2:
			JOptionPane.showMessageDialog(null, mes + " - Fevereiro tem 28 dias");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, mes + " - Março tem 30 dias");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, mes + " - Abril tem 31 dias");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, mes + " - Maio tem 31 dias");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, mes + " - Junho tem 30 dias");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, mes + " - Julho tem 30 dias");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, mes + " - Agosto tem 31 dias");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, mes + " - Setembro tem 31 dias");
			break;
		case 10:
			JOptionPane.showMessageDialog(null, mes + " - Outubro tem 30 dias");
			break;
		case 11:
			JOptionPane.showMessageDialog(null, mes + " - Novembro tem 31 dias");
			break;
		case 12:
			JOptionPane.showMessageDialog(null, mes + " - Dezembro tem 31 dias");

		default:

			System.out.println("Mês invalido");
			break;

		}

	}

}
