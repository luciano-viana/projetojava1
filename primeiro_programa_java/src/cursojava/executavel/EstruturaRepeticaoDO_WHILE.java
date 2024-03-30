package cursojava.executavel;

public class EstruturaRepeticaoDO_WHILE {

	public static void main(String[] args) {

		int numero = 1;

		/* Primeiro executa e depois verifica */
		do {
			System.out.println("Numero atual é: " + numero);
			numero++;
		} while (numero <= 10);

	}

}