package cursojava.executavel;

import java.util.Iterator;

import cursojava.classes.Disciplina;
import cursojava.heranca_polimorfismo.Aluno2;

public class ArrayVetor5 {
	
	public static void main(String[] args) {
		
		//Criado as notas
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notasLogica = {8.1,6.7,8.7,9.9};
	
		//Criado Objeto Aluno
		Aluno2 aluno = new Aluno2();
		aluno.setNome("Luciano Viana");
		aluno.setNomeEscola("JDEV Treinamento");
		
		//Disciplina1: Criado Objeto Disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de java");
		disciplina.setNota(notas);//Inserido as notas
		
		
		//Disciplina2
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de programação");
		disciplina2.setNota(notasLogica);//Inserido as notas
		
		//Inserido disciplinas dentro da lista de disciplina do Aluno
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		
		// Aluno 2

		//Criado Objeto Aluno
		Aluno2 aluno2 = new Aluno2();
		aluno2.setNome("Luciano Viana");
		aluno2.setNomeEscola("JDEV Treinamento");
		
		//Disciplina1: Criado Objeto Disciplina
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Estrurua de Dados 1");
		disciplina3.setNota(notas);//Inserido as notas
		
		
		//Disciplina4
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Banco de Dados");
		disciplina4.setNota(notasLogica);//Inserido as notas
		
		//Inserido disciplinas dentro da lista de disciplina do Aluno
		aluno2.getDisciplinas().add(disciplina3);
		aluno2.getDisciplinas().add(disciplina4);
		
		//---------------------------------------------------------------
		
		Aluno2[] arrayAlunos = new Aluno2[2];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for(int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
			
			for(Disciplina disc : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da Disciplina é: " + disc.getDisciplina());
				
				for(int posnota = 0; posnota < disc.getNota().length; posnota++){
					System.out.println("A nota número " + (posnota+1) + " é igual: " + disc.getNota()[posnota]);
				}
				System.out.println("");
			}
		}
	
		
	}

}
