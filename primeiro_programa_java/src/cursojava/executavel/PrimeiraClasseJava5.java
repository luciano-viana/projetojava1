package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

/*Essa Classe é uma simplificação da PrimeiraClasse2*/
public class PrimeiraClasseJava5 {

	public static void main(String[] args) {

		/* Instância lista de Alunos */

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			/* 1º - Entrada de Dados */
			String nome = JOptionPane.showInputDialog("15:Qual o nome do Aluno " + qtd + " ?");

			/* 2º - Instanciar objeto na memória do Java */
			Aluno aluno1 = new Aluno();

			/* 3º - Setar as propriedades do Objeto */
			/* SET setar os dados dentro do objetivo */
			aluno1.setNome(nome);

			/* Adicionando dados na lista disciplina de forma dinâmica */
			for (int pos = 1; pos <= 1; pos++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) {/* Opção SIM é Zero */

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;/* ++ soma +1 */
					/*
					 * -posicao Remove uma posição da lista, por exemplo a primeira posição da lista
					 * que é o 0
					 */
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}

			alunos.add(aluno1);
		}

		/* Buscando alunos por posição */
		for (int pos = 0; pos < alunos.size(); pos++) {

			Aluno aluno = alunos.get(pos);
			
			if(aluno.getNome().equalsIgnoreCase("Luciano")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matematica");
				disciplina.setNota(96);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
			}

			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println(" ");

			/* Buscando disciplinas na lista de Disciplinas */
			/*
			 * for (Disciplina disc : aluno.getDisciplinas()) {
			 * System.out.println("Materia = " + disc.getDisciplina() + " / Nota = " +
			 * disc.getNota()); }
			 */

			/* Buscando disciplina por posição */
			for (int posdisc = 0; posdisc < aluno.getDisciplinas().size(); posdisc++) {
				Disciplina disc = aluno.getDisciplinas().get(posdisc);
				System.out.println("Materia = " + disc.getDisciplina() + " / Nota " + posdisc + " = " + disc.getNota());

			}
			System.out.println("-----------------------------------------------------");
		}

		/*
		 * Todo software sempre segue a mesmA lógica: 1º - Entrada de Dados 2º -
		 * Instanciar os Objetos 3º - Passar os valores da entrada de dados para o
		 * Objeto 4º - Processar e ter o resultado final
		 */
	}
}
