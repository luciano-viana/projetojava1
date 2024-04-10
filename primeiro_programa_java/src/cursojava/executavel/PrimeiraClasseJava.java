package cursojava.executavel;

public class PrimeiraClasseJava {
	
	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		/*Tipo de dados Int, aceita somente números inteiros*/
		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 50;
		int nota4 = 88;
		
		System.out.println("INT");
		System.out.println("Média das notas em utilizando tipo de dados Int = " + (nota1 + nota2 + nota3 + nota4)/4);
		System.out.println("");
		
		/*Tipo de dados Dobles, aceita casas decimais*/
		double nota5 = 90;
		double nota6 = 70;
		double nota7 = 50;
		double nota8 = 88;
		
		double mediaFinalDouble = (nota5 + nota6 + nota7 + nota8)/4;
		System.out.println("DOUBLE");
		System.out.println("Média das notas utilizando tipo de dados Double = " + mediaFinalDouble);
		System.out.println("");
		
		/*Tipos de dados CHAR representa letra, somente 1 letra por vez*/
		char letra1 = 'L';
		char letra2 = 'U';
		char letra3 = 'C';
		char letra4 = 'I';
		char letra5 = 'A';
		char letra6 = 'N';
		char letra7 = 'O';
		
		System.out.println("CHAR");
		System.out.println("Nome: " + letra1 + letra2 + letra3 + letra4 + letra5 + letra6 + letra7);
		System.out.println("");
		
		/*String no Java sempre será um texto de tamanho qualquer*/
		String nome = "Luciano";
		String cpf = "999.999.999-99";
		String telefone = "(99)9 9999-9999";
		String endereco = "Rua X, número Y";
		
		System.out.println("STRING");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Telefone: " + telefone);
		System.out.println("Endereço: " + endereco);
		System.out.println("");
		
		/*Concatenação = Unir ou juntar dados*/
		String nome2 = "Luciano";
		String cpf2 = "999.999.999-99";
		String telefone2 = "(99)9 9999-9999";
		String endereco2 = "Rua X, número Y";
		
		System.out.println("CONCATENAÇÃO");
		System.out.println("Meu nome é: " + nome2 + " e meu cpf: " + cpf2 + " telefone: " + telefone2 + " endereço: " + endereco2);
		
	}

}
