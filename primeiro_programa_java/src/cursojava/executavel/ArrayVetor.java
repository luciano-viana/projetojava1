package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	//Usado para executar código
	public static void main(String[] args) {
		
		//Array pode ser de todos os tipos de dados e objeto também
		
		//Array sempre deve ter a quantidade de posições de definidas
		//Array é bem limitado, somente coloca dados nas posições e recupera
		
		//Pedir as posições de forma dinâmica
		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");
		double notas[] = new double[Integer.parseInt(posicoes)];
		
		/*
		notas[0]=7.8;
		notas[1]=8.7;
		notas[2]=9.7;
		notas[3]=9.9;
		
		System.out.println("Listando Dados do Array somente pelo println");
		System.out.println("Nota 1 = " + notas[0] + "\nNota 2 = " + notas[1] + "\nNota 3 = " + notas[2] + "\nNota 4 = " + notas[3]);
		System.out.println("------------");*/
		
		//Para cada posição tem que pedir o valor que quer inserir
		for(int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição " + pos + " ?");
			notas[pos] = Double.valueOf(valor);
		}
		
		System.out.println("Listando Dados do Array pelo For");
		for(int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos+1) + " = " + notas[pos]);

		}
		
		
		
	}

}
