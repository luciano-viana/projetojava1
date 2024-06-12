package cursojava.executavel;

import java.util.Iterator;

public class Matriz2 {

	public static void main(String[] args) {

		System.out.println("### Matriz de Inteiro ###");

		int idade[][] = new int[2][2];
		// Matriz 1
		idade[0][0] = 25;
		idade[0][1] = 32;

		// Matriz 2
		idade[1][0] = 18;
		idade[1][1] = 21;

		for (int poslinha = 0; poslinha < idade.length; poslinha++) {
			System.out.println("----- Matriz " + (poslinha + 1) + " -----");
			for (int poscoluna = 0; poscoluna < idade[poslinha].length; poscoluna++) {
				System.out.println("Idade " + (poscoluna + 1 + " = " + idade[poslinha][poscoluna]));
			}
		}
		System.out.println("");

		// -----------------------------------------------------------------------------------------------
		System.out.println("### Matriz de Double ###");
		double valorCarro[][] = new double[2][2];
		// Matriz 1
		valorCarro[0][0] = 30589.70;
		valorCarro[0][1] = 250000.00;
		// Matriz 2
		valorCarro[1][0] = 150000.00;
		valorCarro[1][1] = 87500.80;

		for (int poslinha = 0; poslinha < valorCarro.length; poslinha++) {
			System.out.println("----- Matriz " + (poslinha + 1) + " -----");
			for (int qtdcoluna = 0; qtdcoluna < valorCarro[poslinha].length; qtdcoluna++) {
				System.out.println("Valor do carro " + (qtdcoluna + 1) + " = " + valorCarro[poslinha][qtdcoluna]);
			}
		}

		System.out.println("");

		// -----------------------------------------------------------------------------------------------
		System.out.println("### Matriz de String ###");
		String nome[][] = new String[2][2];
		// Matriz 1
		nome[0][0] = "Luciano";
		nome[0][1] = "Viana";
		// Matriz 2
		nome[1][0] = "Lais";
		nome[1][1] = "Lucas";

		for (int poslinha = 0; poslinha < nome.length; poslinha++) {
			System.out.println("----- Matriz " + (poslinha + 1) + " -----");
			for (int qtdcoluna = 0; qtdcoluna < nome[poslinha].length; qtdcoluna++) {
				System.out.println("Nome " + (qtdcoluna + 1) + " = " + nome[poslinha][qtdcoluna]);
			}
		}

	}
}
