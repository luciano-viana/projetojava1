package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	//Instanciado objeto do tipo lista
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	// Método static para adicionar objetos do tipo Thread na lista
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {
		
		System.out.println("Fila rodando...");
		
        while(true) {

        Iterator iteracao = pilha_fila.iterator();
		synchronized (iteracao) {/*Bloquear o acesso a esta lista por outros processos*/

			while (iteracao.hasNext()) {/* Enquanto conter dados na lista irá processar */

				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/* Pega o objeto atual */

				/*Pode ser feito esses processos abaixo por exemplo*/
				/* Processar 10mil notas fiscal */
				/* Gerar uma lista enorme de PDF */
				/* Gerar um envio em massa de email */
				System.out.println("----------------------------------------------");
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();

				try {
					Thread.sleep(500);// Dar um tempo para a descarga de memória
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

		try {
			Thread.sleep(1000);/* Processou toda a lista dá um tempo para limpesa de memória */
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        }
	}
	
}
