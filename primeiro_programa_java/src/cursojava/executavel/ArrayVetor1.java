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
		disciplina2.setDisciplina("Lógica de programação");
		disciplina2.setNota(notasLogica);//Inserido as notas
		
		//Inserido disciplinas dentro da lista de disciplina do Aluno
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
		
		System.out.println("-----------Disciplinas do aluno-----------");
		for(Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + disc.getDisciplina());
			System.out.println("As notas das Disciplinas são: ");
			
			double notaMax=0.0;
			for(int pos = 0; pos < disc.getNota().length; pos ++) {
				System.out.println("Nota " + (pos+1) + " é igual = " + disc.getNota()[pos]);
				
				//Descobrindo o maior valor de notas dentro de um Array
				if( pos == 0) {
					notaMax = disc.getNota()[pos];
				}else {
					if(disc.getNota()[pos] > notaMax) {
						notaMax = disc.getNota()[pos];
					}
				}
			}
			System.out.println("A maior nota da Disciplina = " + disc.getDisciplina() + " e de valor : " + notaMax);
			System.out.println("-----------------------------------------");
		}
		
	}

}
