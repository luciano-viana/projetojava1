package cursojava.executavel;

import javax.swing.JOptionPane;

public class ProgramaCalculoMediaComCaixaDialago {

	public static void main(String[] args) {
        
		/*Entrada das notas por caixa de diálogo utilizando classe java 'JOptionPane'*/
		String nota1 = JOptionPane.showInputDialog("Digite a Nota1:");
		String nota2 = JOptionPane.showInputDialog("Digite a Nota2:");
		String nota3 = JOptionPane.showInputDialog("Digite a Nota3:");
		String nota4 = JOptionPane.showInputDialog("Digite a Nota4");
		
		/*Conversão entrada de dados inteiros para Double*/
		double resultadoNota1 = Double.parseDouble(nota1);
		double resultadoNota2 = Double.parseDouble(nota2);
		double resultadoNota3 = Double.parseDouble(nota3);
		double resultadoNota4 = Double.parseDouble(nota4);
        
		/*Cálculo média notas*/
		double media = (resultadoNota1 + resultadoNota2 + resultadoNota3 + resultadoNota4) / 4;
		/*Cálculo soma notas*/
		double somaNota = resultadoNota1 + resultadoNota2 + resultadoNota3 + resultadoNota4;

		/*Validação media aluno*/
		if(media >= 70) {
			/*Ver a média das notas*/
			int verNota = JOptionPane.showConfirmDialog(null, "Deseja ver o valor da média das notas?");
			if (verNota == 0) {
				JOptionPane.showMessageDialog(null, "Média das notas: " + media + " Aluno aprovado!!");
			}else {
				JOptionPane.showMessageDialog(null, "Não quiz ver o resultado");
			}

			/*Ver a soma das notas*/
			verNota = JOptionPane.showConfirmDialog(null, "Deseja ver a soma das notas?");
			if (verNota == 0) {
				JOptionPane.showMessageDialog(null, "Soma das notas: " + somaNota);
			}else {
				JOptionPane.showMessageDialog(null, "Não quiz ver o resultado");
			}
		}else if(media >= 40 && media <= 69) {
			JOptionPane.showMessageDialog(null, "Media: " + media + " entre 40 a 69, aluno de recuperação!!");
		}else {
			JOptionPane.showMessageDialog(null, "Media: " + media + " abaixo de 40, aluno reprovado!! Estude mais!!");
			}
	}

}
