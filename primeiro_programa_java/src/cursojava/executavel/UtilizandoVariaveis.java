package cursojava.executavel;

public class UtilizandoVariaveis {
	
	/*Variável Global é acessível a todos e seu valor e compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
	/*Variável local porque pertence somente a esse método e o valor fica dentro do método*/	
	int maiorIdade = 18;
	System.out.println("Valor da variável local = " + maiorIdade);
	System.out.println("Também pode utilizar a váriavel Global no método main, valor = " + maiorIdadeGlobal);
	metodo2();
		
	}
	
	public static void metodo2() {
	 System.out.println("Valor da variável Global = " + maiorIdadeGlobal);	
	}

}
