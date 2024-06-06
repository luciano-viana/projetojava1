package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.viana.Pessoa;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.ExcecaoProcessarNota;
import cursojava.heranca_polimorfismo.Diretor;
import cursojava.heranca_polimorfismo.Secretario;
import cursojava.interfaces.PermitirAcesso;

/*Essa Classe é uma simplificação da PrimeiraClasse2*/
public class PrimeiraClasseJava6 {

	public static void main(String[] args) {
		
		try {
			//Método criando para tratamento da exceção "ExcecaoProcessarNota"
			//lerArquivo();
		
		/*	
		try {
		//criado para teste de tratamento de exceção	
	        File fil = new File("c://arquivo.txt");
	        Scanner scanner = new Scanner(fil);
		}catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		}*/

		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe o senha: ");
		
	
		//Secretario secretario = new Secretario();/*1º - Diretamente com o objeto*/
		/*secretario.setLogin(login);
		  secretario.setSenha(senha);*/

		 //PermitirAcesso secretario = new Secretario();
		
		 // FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
		
		  //PermitirAcesso permitirAcesso = new Secretario(login,senha);
		
		//2º passar os parâmetros de autenticação direto na Interface
		if (new FuncaoAutenticacao(new Diretor(login,senha)).autenticar()) {/*se TRUE acessa,se FALSE não acessa - Vou travar o contrato para autorizar somente
		quem realmente tem o contrato 100% legitimo*/ 
	    //acima: Nova função de atenticação "new FuncaoAutenticacao" recebendo um objeto secretárioa "new Secretario(login,senha)" e invocando o "autenticar()" isso é muito comum no Java
        //acima: Secretario e Diretor está autenticado para acessar o sistema
			/* Instância lista de Alunos */
			List<Aluno> alunos = new ArrayList<Aluno>();

			/*
			 * é uma lista que dentro dela temos uma chave que identifica uma sequência de
			 * valores também
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			//for para quantidade de alunos
			for (int qtd = 1; qtd <= 1; qtd++) {

				/* 1º - Entrada de Dados */
				String nome = JOptionPane.showInputDialog("15:Qual o nome do Aluno " + qtd + " ?");
				String idade = JOptionPane.showInputDialog("Qual a idade? ");

				/* 2º - Instanciar objeto na memória do Java */
				Aluno aluno1 = new Aluno();

				/* 3º - Setar as propriedades do Objeto */
				/* SET setar os dados dentro do objetivo */
				aluno1.setNome(nome);
				aluno1.setIdade(Integer.valueOf(idade));

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
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) { /* Separei em listas */

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("------------Lista dos Aprovados------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome: " + aluno.getNome() + " -> Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}
			System.out.println("");

			System.out.println("------------Lista dos Reprovados------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome: " + aluno.getNome() + " -> Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}
			System.out.println("");

			System.out.println("------------Lista dos Recuperação------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome: " + aluno.getNome() + " -> Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}

		} else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido ⚠");
		}
		
		}catch (/*Exception*/NumberFormatException e) {//Captura somente as exceções erro de conversão de números
			//É do próprio Java para trabalhar com texto
			StringBuilder saida = new StringBuilder();
			
			/*Imprime erro no console Java*/
			e.printStackTrace();
			
			/*Mensagem do erro ou causa*/
			System.out.println("Mensagem: " + e.getMessage());
			
			/*Traz todas as informações retornando um array "simbolo []"*/
			
			for(int pos = 0; pos < e.getStackTrace().length;pos++) {
				//append é para adicionar
				saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Método de erro: " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class: " + e.getStackTrace()[pos].getClass().getName());
				saida.append("\n Nome do carregador: " + e.getStackTrace()[pos].getClassLoaderName());
				saida.append("\n Nome do arquivo: " + e.getStackTrace()[pos].getFileName());
				saida.append("\n Nome do módulo: " + e.getStackTrace()[pos].getModuleName());
				saida.append("\n Versão do módulo: " + e.getStackTrace()[pos].getModuleVersion());
			}
			
			//JOptionPane.showMessageDialog(null, "Erro ao processar notas " + " [ " + e.getMessage()+ " ] ");
			//JOptionPane.showMessageDialog(null, "Erro ao processar notas " + saida.toString());
			JOptionPane.showMessageDialog(null, "Erro de conversão de número " + saida.toString());
			
		}catch (NullPointerException e) {//Capturar somente o NullPointerException
			JOptionPane.showMessageDialog(null, "Opaa um null pointer exeption : " + e.getClass());
			e.printStackTrace();
		}catch (Exception e) {//Captura todas as exceções que não prevemos
			// TODO: handle exception
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,  "Erro inesperado : " + e.getMessage());
		}finally {//É uma função para tratamento de exceção / Sempre é executado ocorrendo erros ou não
			      //Finally sempre é usado quando precisa executar um processo acontecendo erro ou não
			      //Finally é usado para executar tarefas que não pode deixar de executar, por exemplo, fechar uma conexão com o banco de dados.
			JOptionPane.showMessageDialog(null, "Execução de código encerrada!!");
		}
	}
	
	//Método para tratar a exceção ao ler arquivos
	//Exceção implementada direto no método
	/*public static void lerArquivo() throws ExcecaoProcessarNota {
		try {
			File fil = new File("c://arquivo.txt");
	        Scanner scanner = new Scanner(fil);
		} catch (Exception e) {
			//exceção customizada
			throw new ExcecaoProcessarNota(e.getMessage());
		}
	}*/
	
	//Método jogado exceção para cima dentro do método PAI "main""exceção padrão sem ser a customizada"
	public static void lerArquivo() throws FileNotFoundException {
			File fil = new File("c://arquivo.txt");
	        Scanner scanner = new Scanner(fil);
	}
	
	
	
}
