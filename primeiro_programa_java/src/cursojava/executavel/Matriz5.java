package cursojava.executavel;

public class Matriz5 {
	
	public static void main(String[] args) {
		
		
		final int linhas = 2;
		final int colunas = 3;
		
		String[][] nomes = new String[linhas][colunas];
		
		nomes[0][0] = "Luciano";
		nomes[0][1] = "Lais";
		nomes[0][2] = "Lucas";
		
		nomes[1][0] = "Patrícia";
		nomes[1][1] = "Lais";
		nomes[1][2] = "Fábio";
		
		for(int poslinha = 0; poslinha < nomes.length; poslinha++) {
			System.out.println("--- Matriz " + (poslinha+1) + " ---");
			for(int poscoluna = 0; poscoluna < nomes[poslinha].length;poscoluna++) {
				System.out.println("Nome" + (poscoluna+1) + ": " + nomes[poslinha][poscoluna]);
				
			}
			System.out.println("");
		}
	}

}
