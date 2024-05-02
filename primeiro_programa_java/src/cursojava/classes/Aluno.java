package cursojava.classes;

import java.util.Objects;

/*A essência da orientação a objeto é ir criando métodos,rotinas,ir chamado e processando o software*/
/*Está é nossa classe/objeto que representa o Aluno*/
public class Aluno {

	/* Esses são os atributos do Aluno */
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private String sexo;
	
	/* Instanciar objeto na memória do Java */
	private Disciplina disciplina = new Disciplina();
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public Aluno() {/* Cria os dados na memória - Sendo padrão do Java */

	}

	/* Podemos também ter outros construtores para receber valores definidos */
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	/*-------------------SET e GET abaixo feito de forma manual-------------*/
	/* Veremos os métodos SETTERS e GETTERs do Objeto */
	/* SET é para adicionar ou receber dados para os atributos */
	/* GET é para resgatar ou obter o valor do atributo */

	/* Método SET insere os dados */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/* Método GET recebe "resgata" os dados inserido pelo SET */
	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	/*-------------------SET e GET abaixo feito de forma automatica pela função Generate Getters and Setters-------------*/
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	/*Método que retorna a média do aluno*/
	public double getMediaNota() {
		return (disciplina.getNota1() + disciplina.getNota2()
		+ disciplina.getNota3() + disciplina.getNota4())/4;
	}

	/*
	 * Sempre separar as responsabilidades,processos, funções, rotinas em métodos
	 */
	/* Método que retorna true para aprovado e false para reprovado*/
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota(); /* This.getMediaNota() está utilizando o método de cima */

		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}
	

	/*
	 * Método que retornar o resultado por String com a mensagem informada
	 * "Aluno Aprovado" ou "Aluno Reprovado"
	 */
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();

		if (media >= 70) {
			return "Aluno Aprovado!!";
		} else {
			return "Aluno Reprovado!!";
		}
	}

	/* Utilizando toStrig */
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", sexo=" + sexo + ", disciplina=" + disciplina + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}


}
