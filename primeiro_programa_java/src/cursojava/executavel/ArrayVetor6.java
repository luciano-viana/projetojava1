package cursojava.executavel;

import java.util.Iterator;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.heranca_polimorfismo.Aluno2;

public class ArrayVetor6 {

	public static void main(String[] args) {

		// Array de Notas
		double[] notas = { 5.8, 8.7, 6.9, 10 };

		// Objeto Aluno
		Aluno2 aluno = new Aluno2();
		aluno.setNome("Luciano Viana - Dev");
		aluno.setIdade(33);
		aluno.setNomeEscola("Formação Devs");

		// Objeto Disciplina
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("BD");
		disciplina1.setNota(notas);

		// inserindo disciplina dentro da lista do aluno
		aluno.getDisciplinas().add(disciplina1);

		// Fazer array de alunos
		Aluno2[] arrayAlunos = new Aluno2[1];
		arrayAlunos[0] = aluno;

		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome() + "\nIdade: "
					+ arrayAlunos[pos].getIdade() + "\nNome da Escola: " + arrayAlunos[pos].getNomeEscola());

			for (Disciplina disc : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da Disciplina é: " + disc.getDisciplina());
				
				for(int posnota = 0; posnota < disc.getNota().length; posnota++) {
					System.out.println("A nota de número " + (posnota+1) + " é igual: " + disc.getNota()[posnota]);
				}
			}
			
			

		}

	}
}
