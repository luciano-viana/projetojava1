package cursojava.excecao;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		// TODO Auto-generated constructor stub
		super("Vixxx.. Erro no processamento das notas do aluno!\n" + erro);
		
	}

}
