package cursojava.executavel;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?"); /* Entrada de Dados */
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?"); /* Entrada de Dados */

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero
				/ pessoaNumero); /*
									 * Convertido para inteiro para não mostrar casas decimais, números fracionários
									 */

		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {

			/* Mensagem na tela */
			JOptionPane.showMessageDialog(null,
					"Tem " + carros + " carros para " + pessoas + " pessoas e cada pessoa irá ficar com " + divisao
							+ " carros!!"); /* Saída de Dados com confirmação */
		} else {
			JOptionPane.showMessageDialog(null, "Não quiz ver o resultado");
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");

		if (resposta == 0) {

			JOptionPane.showMessageDialog(null,
					"Resto da divisão, sobrou " + resto + " carro"); /* Saída de Dados com confirmação */
		} else {
			JOptionPane.showMessageDialog(null, "Não quiz ver o resultado");
		}

	}

}
