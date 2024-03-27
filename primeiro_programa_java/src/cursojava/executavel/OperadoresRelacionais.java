package cursojava.executavel;

public class OperadoresRelacionais {

	public static void main(String[] args) {

		/*
		 * Operadores Relacionais 
		 * == Igual 
		 * != Diferente 
		 * < Menor 
		 * > Maior 
		 * <= Menor Igual
		 * >= Maior Igual
		 */

		
		int nota1 = 92;
		int nota2 = 92;
		
		if (nota1 == nota2) {
			System.out.println("Nota1: " + nota1);
			System.out.println("Nota2: " + nota2);
			System.out.println("Nota1 é igual a Nota2");
		} else {
			System.out.println("Nota1: " + nota1);
			System.out.println("Nota2: " + nota2);
            System.out.println("Nota1 não é Igual a Nota2");
		}
	}
}
