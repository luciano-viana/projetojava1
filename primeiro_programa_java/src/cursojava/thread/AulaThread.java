package cursojava.thread;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int pos = 0; pos < 10; pos++) {
			
			//Quero executar esse envio com um tempo de parada ou com um tempo determinado
			System.out.println("Executando alguma rotina, enviando e-mail.....");
			Thread.sleep(1000);//Dá um tempo para executar o código
		}
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
	}

}
