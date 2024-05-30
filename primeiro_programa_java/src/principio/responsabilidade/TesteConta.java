package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {

     ContaBancaria bancaria = new ContaBancaria();
     bancaria.setDescricao("Conta bancaria do Luciano Viana");
     System.out.println(bancaria);
     
     /*Diminuir 100 reais com o método diminui100Reais*/
     bancaria.diminui100Reais();
     System.out.println(bancaria);
     
     /*Somar dinheiro com o método soma100Reais*/
     bancaria.soma100Reais();
     System.out.println(bancaria);
     
     /*Sacar dinheiro com o método sacarDinheiro*/
     bancaria.sacarDinheiro(500);
     System.out.println(bancaria);
     
     /*Depositar dinheiro com método depositoDinheiro*/
     bancaria.depositoDinheiro(1500);
     System.out.println(bancaria);

	}

}
