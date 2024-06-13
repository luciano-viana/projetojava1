package cursojava.thread;

import javax.swing.JOptionPane;

public class Aula01Thread {

	public static void main(String[] args) throws InterruptedException {

		/*Thread para execução do código em paralelo e liberar sistema*/
		new Thread() {
			
			public void run() {
				
				for (int pos = 0; pos <= 10; pos++) {
					System.out.println("Em andamento...");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			
			
		}.start();
		
		
		
		
		JOptionPane.showMessageDialog(null, "Fim do processamento!!");

	}

}
