package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor3 {
	
	public static void main(String[] args) {
		
		//Praticando tipos de utilização de Arrays
		
		//Passando valores do tipo Inteiro "int" na variável declarada
		int inteiro[] = new int[3];
		inteiro[0] = 3;
		inteiro[1] = 5;
		inteiro[2] = 16;
		
		System.out.println("######### Tipo 1: INTEGER #########");
		for(int pos = 0; pos < inteiro.length; pos++) {
			System.out.println("Valore da posição " + pos + " = " + inteiro[pos]);
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		//-------------------------------------------------------------------------------
				
		//Passando valores do tipo fracionado "Double" na variável declarada sem utilizar o New
		double Doubles[] = {1.5,5.89,10.87};
		System.out.println("######### Tipo 2: DOUBLE #########");
		for(int pos = 0; pos < Doubles.length; pos++) {
			System.out.println("Valor da posição " + pos + " = " + Doubles[pos]);
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		//-------------------------------------------------------------------------------
		
		//Passando valores do tipo String na variável declarada de forma dinâmica perguntando para o usuário
		System.out.println("######### Tipo 3: STRING - ENTRADA DE DADOS DINÂMICO #########");
		String posicao = JOptionPane.showInputDialog("Quantos posição irá ter o Array?");
		String string[] = new String[Integer.parseInt(posicao)];
		
		for(int pos = 0; pos < string.length; pos++) {
			String valor = JOptionPane.showInputDialog("Digite algo para a posição " + pos);
			string[pos] = valor;
		}
		
		for(int pos = 0; pos < string.length; pos++ ) {
			System.out.println("Valor da posição " + pos + " = " + string[pos]);
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
