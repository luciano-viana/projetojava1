package cursojava.AulaPOO;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		/* Instanciar Objeto Produto */
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Módulo Orientação Objeto");
		produto1.setValor(BigDecimal.valueOf(100));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Módulo de Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(200));

		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Módulo de Angular 8");
		produto3.setValor(BigDecimal.valueOf(300));

		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("Módulo de Hibernate");
		produto4.setValor(BigDecimal.valueOf(300));

		/* Instanciado Objeto venda */
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Formação Java");
		venda.setEnderecoEntrega("Entrega pelo e-mail");
		venda.setId(10L);
		venda.setNomeCliente("Luciano Viana");
		/* venda.setValorTotal(BigDecimal.valueOf(197.00)); */

		/*
		 * Para acessar os atributos da lista precisa ter um get da Lista na Classe
		 * "Venda"
		 */
		/* Adicionando objetivo produto na lista */
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);/*
												 * Não é possível fazer validações porque está pegando a lista e
												 * adicionando dentro dela
												 */
		venda.addProduto(produto3); /* Pode fazer validações antes de adicionar na lista */
		venda.addProduto(produto4);

		/*
		 * System.out.println("Descrição da Venda : " + venda.getDescricaoVenda() +
		 * " e o total: " + venda.totalVenda());
		 */

		System.out.println("Descrição da Venda: " + venda.getDescricaoVenda());
		System.out.println("Valor da variável total Venda: " + venda.getValorTotal());
	}

}
