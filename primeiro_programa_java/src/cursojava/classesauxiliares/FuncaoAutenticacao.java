package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguém que tem o contrato da interface de PermitirAcesso e chamar o autenticar*/
public class FuncaoAutenticacao {
    
	private PermitirAcesso permitirAcesso;
	
	//Método autenticar
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		// TODO Auto-generated constructor stub
		this.permitirAcesso = acesso;
	}
}


