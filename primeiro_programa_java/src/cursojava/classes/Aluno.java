package cursojava.classes;

/*Está é nossa classe/objeto que representa o Aluno*/
public class Aluno {
	
	/*Esses são os atributos do Aluno*/
	public String nome;
	public int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	boolean sexo;

	
	public Aluno() {/*Cria os dados na memória - Sendo padrão do Java*/
		
	}
	
	/*Podemos também ter outros construtores para receber valores definidos*/
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
