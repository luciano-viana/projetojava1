package cursojava.executavel;

import java.util.HashMap;

public class ClasseHashMap {
	
	public static void main(String[] args) {
		
		/*Coleção HashMap declara e instanciada*/
		/*Objetvo Carro do tipo HashMap*/
		/*Integer = Chave, String = Valor*/
		/*HashMap é do tip Chave e Valor, armazena os valores em pares*/
		HashMap<Integer, String> carros = new HashMap<Integer, String>();
		
		carros.put(1,"Polo");
		carros.put(2,"HRV");
		carros.put(3,"Golf");
		carros.put(4,"Camaro");
		carros.put(5,"Mustang");
		carros.put(6,"Cruze");
		
		System.out.println(carros);/*Imprimir os dados do Objeto Carros*/
		System.out.println(carros.get(1));/*Imprimir chave específica = Retornar o valor da chave informada no caso chave 1*/
		System.out.println("-------------------------------------------------");
		
		/*For tradicional para fazer a impressão de todos os dados do Objeto Carros*/
		for(int i = 1; i <= carros.size(); i++) {
			System.out.println(carros.get(i));
		}
		
		System.out.println("-------------------------------------------------");
		/*For each "especial para coloeções" para pecorrer todos os dados da coleção do Objeto Carros */
		for(String c:carros.values()) {
			System.out.println(c);
		}
		
		System.out.println("-------------------------------------------------");
		/*Remover um item da coleção de dados do Objeto Carros*/
		carros.remove(6);
		System.out.println(carros);
		
		System.out.println("-------------------------------------------------");
		/*Limpar toda a coleção de dados do Objeto Carros*/
		carros.clear();
		System.out.println(carros);
		
	}

}
