package cursojava.executavel;

public class Matriz3 {
	
	public static void main(String[] args) {
		
		//Matriz de números inteiros
		
		//1º - Instanciar o objeto do tipo Matriz
		int numero[][] = new int [2][5];
		
		//2º - Adicionar valores na Matriz
		numero[0][0] = 32;
		numero[0][1] = 22;
		numero[0][2] = 60;
		numero[0][3] = 12;
		numero[0][4] = 33;
		
		numero[1][0] = 8;
		numero[1][1] = 285;
		numero[1][2] = 610;
		numero[1][3] = 87;
		numero[1][4] = 21;
		
		//3º - Fazer leitura dos valores da Matriz
		for(int poslinha = 0; poslinha < numero.length; poslinha++) {//ler a quantidade de linhas da matriz
			System.out.println("--- Matriz " + (poslinha+1) + " ---");
			for(int poscoluna = 0; poscoluna < numero[poslinha].length;poscoluna++) {//ler valores das colunas da matriz
				System.out.println("Número " + (poscoluna+1) + " = " + numero[poslinha][poscoluna]);
			}
			System.out.println("");
		}
		
	}

}
