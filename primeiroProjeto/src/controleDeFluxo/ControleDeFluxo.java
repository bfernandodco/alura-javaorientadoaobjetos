package controleDeFluxo;

import javax.swing.JOptionPane;

public class ControleDeFluxo {

	public static void main(String[] args) {
		/*ALTERNATIVA AO IF/ELSE É O SWITCH/CASE. UMA ESTRUTURA DE CONTROLE DE FLUXO
		 * QUE PERMITE EXECUTAR DIFERENTES AÇÕES COM BASE NO VALOR DE UMA EXPRESSÃO
		 */
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe um dia"));
		String nomeDia;
		
		switch(dia) {
		case 1:
			nomeDia = "Domingo";
			break;
		case 2:
			nomeDia = "Segunda";
			break;
		case 3:
			nomeDia = "Terça";
			break;
		case 4:
			nomeDia = "Quarta";
			break;
		case 5:
			nomeDia = "Quinta";
			break;
		case 6:
			nomeDia = "Sexta";
			break;
		case 7:
			nomeDia = "Sábado";
			break;
		default:
			nomeDia = "Dia inválido";
			break;
		}
		System.out.println("O dia " + dia + " é " + nomeDia);
	}

}