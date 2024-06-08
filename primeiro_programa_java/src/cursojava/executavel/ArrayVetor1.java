package cursojava.executavel;

import java.util.Iterator;

import cursojava.classes.Disciplina;
import cursojava.heranca_polimorfismo.Aluno2;

public class ArrayVetor1 {
	
	public static void main(String[] args) {
		
		//Criado as notas
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notasLogica = {8.1,6.7,8.7,9.9};
	
		//Criado Objeto Aluno
		Aluno2 aluno = new Aluno2();
		aluno.setNome("Luciano");
		aluno.setNomeEscola("JDEV Treinamento");
		
		//Disciplina1: Criado Objeto Disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de java");
		disciplina.setNota(notas);//Inserido as notas
		
		//Disciplina2
		Disciplina disciplina2 = new Disciplina();
		disciplina.setDisciplina("Lógica de programação");
		disciplina.setNota(notasLogica);//Inserido as notas
		
		//Inserido disciplinas dentro da lista de disciplina do Aluno
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		
		
	}

}
