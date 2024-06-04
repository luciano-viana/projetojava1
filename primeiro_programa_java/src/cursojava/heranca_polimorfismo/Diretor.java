package cursojava.heranca_polimorfismo;

import cursojava.interfaces.PermitirAcesso;

/*Classe filha de pessoa que extende de pessoa*/
public class Diretor extends Pessoa implements PermitirAcesso {
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	//----------------------------------------------------------------------
	//Atributos de login e senha
	private String login;
	private String senha;
	
	//Construtor Diretor
	public Diretor(String login, String senha) {
		// TODO Auto-generated constructor stub
		this.login = login;
		this.senha = senha;
	}
	
	//Para não quebrar as outras classe deixa o abributo só por padrão
	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	
	//----------------------------------------------------------------------
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomePai=" + nomePai
				+ ", nomeMae=" + nomeMae + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 8700;
	}
	
	//---------------------------------------------------------------------------------------------------------------
	//Dois métodos de autenticar
		@Override
		public boolean autenticar(String login, String senha) {
			// TODO Auto-generated method stub
			//return login.equalsIgnoreCase("admin")&& senha.equalsIgnoreCase("admin");
			this.login = login;
			this.senha = senha;
			return autenticar();
		}
		
		@Override
		public boolean autenticar() {
			// TODO Auto-generated method stub
			return login.equalsIgnoreCase("Luciano")&& senha.equalsIgnoreCase("123");
		}
		
	
	
	
}
