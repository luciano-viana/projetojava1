package cursojava.executavel;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;

public class PrimeiraClasseJava2 {

	public static void main(String[] args) {

		/* Objeto ainda não existe na memória */
		Aluno aluno0;

		/* 1º - Entrada de Dados */
		String nome = JOptionPane.showInputDialog("15:Qual o nome do Aluno?");
		String idade = JOptionPane.showInputDialog("14:Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("13:Data de Nascimento?");
		String rg = JOptionPane.showInputDialog("12:RG?");
		String cpf = JOptionPane.showInputDialog("11:CPF?");
		String nomeMae = JOptionPane.showInputDialog("10:Nome da Mãe?");
		String nomePai = JOptionPane.showInputDialog("9:Nome da Pai?");
		String dataMatricula = JOptionPane.showInputDialog("8:Data Matricula?");
		String nomeEscola = JOptionPane.showInputDialog("7:Nome da Escola?");
		String serie = JOptionPane.showInputDialog("6:Qual a série?");
		String sexoAluno = JOptionPane.showInputDialog("5:Qual o sexo M ou F?");
		String nota1 = JOptionPane.showInputDialog("4:Qual a Nota1?");
		String nota2 = JOptionPane.showInputDialog("3:Qual a Nota2?");
		String nota3 = JOptionPane.showInputDialog("2:Qual a Nota3?");
		String nota4 = JOptionPane.showInputDialog("1:Qual a Nota4?");

		/* Agora sim temos um objeto real na memória */
		/* Construtor padrão */
		/* new Aluno() é uma instânciar (Criação de Objeto) */
		/* Exemplo: aluno1 é uma variável referência para o objetivo aluno */
		/*
		 * Instância 'construtor': São os contrutores para construir o objeto, exemplo
		 * "new Aluno()". Referência: São as variáveis que faz referência para os
		 * objetos, exemplo: "aluno1". Atributo: São os atributos das caracteristicas
		 * 'nome, idade...' que representa a pessoa no mundo real, no caso da classe
		 * Aluno
		 */

		/* 2º - Instanciar objeto na memória do Java */
		Aluno aluno1 = new Aluno(); /* Aqui será o João */

		/* 3º - Setar as propriedades do Objeto */
		/* SET setar os dados dentro do objetivo */
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serie);
		aluno1.setSexo(sexoAluno);

		/* 4º - Chamar os métodos e mostrar os dados */
		System.out.println("*****************LISTA DE ALUNOS*****************");
		/* GET recuperar os dados dentro do objeto */
		System.out.println("Nome do aluno 1: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Número da Identidade: " + aluno1.getRegistroGeral());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("Nome da Mãe: " + aluno1.getNomeMae());
		System.out.println("Nome do Pai: " + aluno1.getNomePai());
		System.out.println("Data da Matrícula: " + aluno1.getDataMatricula());
		System.out.println("Colégio Matriculado: " + aluno1.getNomeEscola());
		System.out.println("Série Matriculado: " + aluno1.getSerieMatriculado());
		System.out.println("Sexo: " + aluno1.getSexo());
		DecimalFormat deci = new DecimalFormat("0.00");/* Objeto para formatar as casas decimais após a virgula */
		System.out.println(
				"Média Nota: " + deci.format(aluno1.getMediaNota())); /* Chamada de método que calcula média aluno */
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado"
				: "Reprovado")); /* Validação do resultado boolean por operador ternário */
		System.out.println("Resultado2: " + aluno1.getAlunoAprovado2()); /* Resultado por método do tipo String */

		/*
		 * =============================================================================
		 */
		Aluno aluno2 = new Aluno(); /* Aqui será o Lucas */
		aluno2.setNome("Lucas");
		aluno2.setIdade(25);

		System.out.println("-------------------------------------------------");
		System.out.println("Nome do aluno 2: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.getIdade());

		/*
		 * =============================================================================
		 */
		Aluno aluno3 = new Aluno(); /* Aqui será a Patricia */
		aluno3.setNome("Patrícia");
		aluno3.setIdade(28);

		System.out.println("-------------------------------------------------");
		System.out.println("Nome do aluno 3: " + aluno3.getNome());
		System.out.println("Idade: " + aluno3.getIdade());

		/*
		 * =============================================================================
		 */

		/* Construtor com uma parâmetro */
		Aluno aluno4 = new Aluno("Maria");

		/* Construtor com 2 parâmetros */
		Aluno aluno5 = new Aluno("Lais", 23);

	}

}
