package cursojava.executavel;

public class EstruturaRepeticaoFORcomCONTINUE {

	public static void main(String[] args) {

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 4 || numero == 7 || numero == 9) {
				System.out.println("Numero localizado: " + numero);
				 /* irá ignorar o que tem para baixo enquando estiver dentro do laço de repetição */
				continue; /*chegando no continue irá pular o código de baixo e iniciar na próxima verificação*/
			}
			System.out.println("processando...");
		}
	}

}
