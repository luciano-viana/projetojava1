package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor4 {
	
	public static void main(String[] args) {
		
		try {
			//Array dinâmico do tipo String
			
			//Etrada de Dados qtdade de posições do Arry
			String arrayPosicao = JOptionPane.showInputDialog("Digite a quantidade de posições do Array");
			String arrayDinamico[] = new String[Integer.parseInt(arrayPosicao)]; 
			
			//Entrada de dados nas posições do Arry
			for(int p = 0; p < arrayDinamico.length; p++) {
				String digitado = JOptionPane.showInputDialog("Digite algo para a posição " + p);
				arrayDinamico[p] = digitado;
			}
			
			//Listagem dos dados recebidos no Arry
			for(int i = 0; i < arrayDinamico.length; i++) {
				System.out.println((i+1) + "º - Valor digitado na posição " + i + " = " + arrayDinamico[i]);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}

}
