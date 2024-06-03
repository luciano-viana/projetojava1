package cursojava.heranca_polimorfismo;

/*Herança - Classe Pai ou a classe Master ou Superclasse - (Atributos comuns a todos os objetos filhos)*/
/*abstract é utilizado para não deixar criar um objeto de um classe generica "por exemplo classe Pessoa" 
 * impedir que algo seja feito errado dentro do código, utilizado para manter a regra do sistema*/
public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String registroGeral;
	protected String numeroCPF;
	protected String nomePai;
	protected String nomeMae;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
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
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	/*Retorna true caso seja 18 anos pra cima, senão false*/
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}

}




