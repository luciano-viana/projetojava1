package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

/*Essa Classe é uma simplificação da PrimeiraClasse2*/
public class PrimeiraClasseJava3 {

	public static void main(String[] args) {

		/* Instância lista de Alunos */
		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 5; qtd++) {

			/*
			 * Aluno aluno = new Aluno(); System.out.println(aluno.toString());/*Descrição
			 * do objeto na memoria
			 */

			/*
			 * aluno = new Aluno(); System.out.println(aluno); /*Pode chamar o toString ou
			 * não, é a mesma coisa
			 */

			/* 1º - Entrada de Dados */
			String nome = JOptionPane.showInputDialog("15:Qual o nome do Aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("14:Qual a idade?"); String
			 * dataNascimento = JOptionPane.showInputDialog("13:Data de Nascimento?");
			 * String rg = JOptionPane.showInputDialog("12:RG?"); String cpf =
			 * JOptionPane.showInputDialog("11:CPF?"); String nomeMae =
			 * JOptionPane.showInputDialog("10:Nome da Mãe?"); String nomePai =
			 * JOptionPane.showInputDialog("9:Nome da Pai?"); String dataMatricula =
			 * JOptionPane.showInputDialog("8:Data Matricula?"); String nomeEscola =
			 * JOptionPane.showInputDialog("7:Nome da Escola?"); String serie =
			 * JOptionPane.showInputDialog("6:Qual a série?"); String sexoAluno =
			 * JOptionPane.showInputDialog("5:Qual o sexo M ou F?");
			 */

			/* 2º - Instanciar objeto na memória do Java */
			Aluno aluno1 = new Aluno();

			/* 3º - Setar as propriedades do Objeto */
			/* SET setar os dados dentro do objetivo */
			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.parseInt(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMae);
			 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatricula);
			 * aluno1.setNomeEscola(nomeEscola); aluno1.setSerieMatriculado(serie);
			 * aluno1.setSexo(sexoAluno);
			 */

			/* Adicionando dados na lista disciplina de forma dinâmica */
			for (int pos = 1; pos <= 4; pos++) {

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

		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("Luciano")) {
				alunos.remove(aluno);
				break;
			} else {
				/* 4º - Chamar os métodos e mostrar os dados com toString */
				System.out.println(aluno.toString());/* Descrição do objeto na memoria */
				System.out.println("Média do Aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("----------------------------------------------------------------");
			}
		}

		for (Aluno aluno : alunos) {
			System.out.println("Aluno que sobrou na lista: ");
			System.out.println(aluno.getNome());
			System.out.println("Suas materias são: ");

			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
			System.out.println("----------------------------------------------------------------");

		}

		/*
		 * Todo software sempre segue a mesmA lógica: 1º - Entrada de Dados 2º -
		 * Instanciar os Objetos 3º - Passar os valores da entrada de dados para o
		 * Objeto 4º - Processar e ter o resultado final
		 */

	}

}
