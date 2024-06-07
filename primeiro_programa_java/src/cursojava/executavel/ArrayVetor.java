package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	//Usado para executar código
	public static void main(String[] args) {
		
		//Array pode ser de todos os tipos de dados e objeto também
		
		//Array sempre deve ter a quantidade de posições de definidas
		double notas[] = new double[4];
		
		notas[0]=7.8;
		notas[1]=8.7;
		notas[2]=9.7;
		notas[3]=9.9;
		
		System.out.println("Listando Dados do Array somente pelo println");
		System.out.println("Nota 1 = " + notas[0] + "\nNota 2 = " + notas[1] + "\nNota 3 = " + notas[2] + "\nNota 4 = " + notas[3]);
		System.out.println("------------");
		
		System.out.println("Listando Dados do Array pelo For");
		for(int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos+1) + " = " + notas[pos]);

		}
		
	}

}
