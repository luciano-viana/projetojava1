package cursojava.executavel;

public class EstruturaRepeticaoFORcomBREAK {

	public static void main(String[] args) {

		/* Estrutura de repetição FOR com BREAK (Parada) */

		for (int numero = 0; numero <= 10; numero++) {

			if (numero == 8) {
				System.out.println("Numero localizado: " + numero);
				System.out.println("Fim da execução...");
				break;

			}

		}
	}

}
