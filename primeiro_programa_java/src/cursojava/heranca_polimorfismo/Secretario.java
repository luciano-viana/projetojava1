package cursojava.heranca_polimorfismo;

import cursojava.interfaces.PermitirAcesso;

/*Classe filha de pessoa que extende de pessoa*/
public class Secretario extends Pessoa implements PermitirAcesso{
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	/*private String login;
	private String senha;*/
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + "]";
	}
	
	@Override
	public double salario() {
		// TODO Auto-generated method stub - método sobrescrito
		return 5600 * 0.9;
	}
	
	//Esse é o método do contrato de autenticação
	//@Override
	/*public boolean autenticar() {
		// TODO Auto-generated method stub - método sobrescrito
		return login.equalsIgnoreCase("admin")&& senha.equalsIgnoreCase("admin");//Retorna SIM caso o login e senha seja admin senão FALSE
	}*/
	
	@Override
	public boolean autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return login.equalsIgnoreCase("admin")&& senha.equalsIgnoreCase("admin");
	}
	
	/*public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}*/
	
}
