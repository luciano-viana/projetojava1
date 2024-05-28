package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

/*Essa Classe é uma simplificação da PrimeiraClasse2*/
public class PrimeiraClasseJava6 {

	public static void main(String[] args) {

		/* Instância lista de Alunos */

		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 5; qtd++) {

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

		for (Aluno aluno : alunos) { /* Separei em listas */

			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				alunosReprovados.add(aluno);/* Reprovado */
			}
		}
		
		System.out.println("------------Lista dos Aprovados------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Nome: " + aluno.getNome() + " -> Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		System.out.println("");
		
		System.out.println("------------Lista dos Reprovados------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Nome: " + aluno.getNome() + " -> Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		System.out.println("");
		
		System.out.println("------------Lista dos Recuperação------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Nome: " + aluno.getNome() + " -> Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}

	}
}
