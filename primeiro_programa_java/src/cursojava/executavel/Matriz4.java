package cursojava.executavel;

import java.security.SecureRandom;

public class Matriz4 {

	public static void main(String[] args) {
		
		//final é utilizado para declarar variáveis que seus valores não podem ser modificados "são constantes" 
		final int linhas = 3;
		final int colunas = 5;
		
		int[][] numeros = new int[linhas][colunas];
		int[][] num = {{10,20,30,40,50},{1,2,3,4,5},{100,200,300,400,500}};
		
		for(int l=0; l < linhas; l++) {//1º for manipula as linhas
			for(int c=0; c<colunas; c++) {//2º for manipula as colunas
				numeros[l][c] = new SecureRandom().nextInt(100);//SecureRandom é uma classe para gerar números aleatórios
			}
			
			//VERIFICAR COMO IMPRIMIR DADOS DA MATRIZ SEPARANDO POR LINHAS
		}
		
		/*for(int l=0; l < linhas; l++) {
			for(int c=0; c<colunas; c++) {
				System.out.printf(" | " + numeros[l][c]);
			}
			
		}*/
		
		//for próprio para array "Matriz é um array de array
		for(int[] n:num) {
			for(int v:n) {
				System.out.println(v);
			}
			System.out.println("\n");
		}
	}
}
