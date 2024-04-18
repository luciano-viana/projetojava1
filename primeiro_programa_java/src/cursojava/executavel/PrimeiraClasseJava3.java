package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

/*Essa Classe é uma simplificação da PrimeiraClasse2*/
public class PrimeiraClasseJava3 {

	public static void main(String[] args) {

		/*
		 * Aluno aluno = new Aluno(); System.out.println(aluno.toString());/*Descrição
		 * do objeto na memoria
		 */

		/*
		 * aluno = new Aluno(); System.out.println(aluno); /*Pode chamar o toString ou
		 * não, é a mesma coisa
		 */

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

		/* 2º - Instanciar objeto na memória do Java */
		Aluno aluno1 = new Aluno();

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
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		/* 4º - Chamar os métodos e mostrar os dados com toString */
		System.out.println(aluno1.toString());/* Descrição do objeto na memoria */
		System.out.println("Média do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		/*Todo software sempre segue a mesma lógica
		 * 1º - Entrada de Dados
		 * 2º - Instanciar os Objetos
		 * 3º - Passar os valores da entrada de dados para o Objeto
		 * 4º - Processar e ter o resultado final
		 * */

	}

}
