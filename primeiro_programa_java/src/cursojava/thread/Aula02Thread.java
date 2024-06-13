package cursojava.thread;

import javax.swing.JOptionPane;

public class Aula02Thread {
	
	public static void main(String[] args) throws InterruptedException {

		/* Thread 01 - processando em paralelo do envio do e-mail */
		/*Instanciado Objeto Thread*/
		Thread threaEmail = new Thread(thread1);
		threaEmail.start();
		

		/* Thread 02 - Envio de nota fiscal */
		/*Instanciado Objeto Thread*/
		Thread threadNFCe = new Thread(thread2);
		threadNFCe.start();
	
			
		JOptionPane.showMessageDialog(null, "Sistema contina executando para o usuário");

	}
	
	//-----------------------------------------------------------------------------------------
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
		
			/* Código da rotina */

			/* Código da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				// Quero executar esse envio com um tempo de parada ou com um tempo determinado
				System.out.println("Executando alguma rotina, enviando e-mail.....");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // Dá um tempo para executar o código
			}
			// Fim do código em paralelo
			
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			for (int pos = 0; pos < 10; pos++) {
				System.out.println("Executando alguma rotina, enviando de nota fiscal(NFCe).....");

				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};

}
