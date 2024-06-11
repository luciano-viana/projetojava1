package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {

		System.out.println("##Matriz de Inteiro##");
		// Matriz é um Array de um Array
		int notas[][] = new int[2][3];// Matriz - Uma posição com 3 valores dentro

		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;

		notas[1][0] = 40;
		notas[1][1] = 85;
		notas[1][2] = 99;

		// Para ler os dados da Matriz precisa de um FOR dentro do outro, um para ler as
		// linhas e outro para ler as colunas
		for (int poslinha = 0; poslinha < notas.length; poslinha++) {// Percorre as linhas //posições de um array ou
																		// matriz sempre vai ser do tipo inteiro
			System.out.println("----- Matriz " + (poslinha + 1) + " -----");
			// Para cada linha percorrer as colunas ARRAY
			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {
				System.out.println("Valor da matriz: " + notas[poslinha][poscoluna]);
			}
			System.out.println("");
		}

		// ----------------------------------------------------------------------------------------------------------------------------------------------

		System.out.println("##Matriz de String##");

		// Matriz de String
		String nomes[][] = new String[2][3];

		nomes[0][0] = "Luciano";
		nomes[0][1] = "Jussânia";
		nomes[0][2] = "Thais";

		nomes[1][0] = "Débora";
		nomes[1][1] = "Lais";
		nomes[1][2] = "Barbora";

		// for para ler a quantidade de linhas e for para ler a quantidade de colunas
		for (int posicaolinha = 0; posicaolinha < nomes.length; posicaolinha++) {
			System.out.println("----- Matriz " + (posicaolinha + 1) + " -----");
			for (int qtdcolunas = 0; qtdcolunas < nomes[posicaolinha].length; qtdcolunas++) {
				System.out.println("Nomes: " + nomes[posicaolinha][qtdcolunas]);
			}
			System.out.println("");
		}

	}

}
