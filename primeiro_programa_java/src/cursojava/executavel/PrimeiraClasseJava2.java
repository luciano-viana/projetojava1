package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava2 {
	
	public static void main(String[] args) {
		
		/*Objeto ainda não existe na memória*/
		Aluno aluno0;
		
		
		/*Agora sim temos um objeto real na memória*/
		/*Construtor padrão*/
		/*new Aluno() é uma instânciar (Criação de Objeto)*/
		/*Exemplo: aluno1 é uma variável referência para o objetivo aluno*/
		/*Instância 'construtor': São os contrutores para construir o objeto, exemplo "new Aluno()".
		 *Referência: São as variáveis que faz referência para os objetos, exemplo: "aluno1".
		 *Atributo: São os atributos das caracteristicas 'nome, idade...' que representa a pessoa no mundo real, no caso da classe Aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		aluno1.nome = "João";
		aluno1.idade = 35;
		System.out.println("Nome do aluno 1 é = " + aluno1.nome);
		System.out.println("Idade = " + aluno1.idade);
		
		Aluno aluno2 = new Aluno(); /*Aqui será o Pedro*/
		Aluno aluno3 = new Aluno(); /*Aqui será o Luciano*/
		
		/*Construtor com uma parâmetro*/
		Aluno aluno4 = new Aluno("Maria");
		
		/*Construtor com 2 parâmetros*/
		Aluno aluno5 = new Aluno("Lais", 23);
	}

}
