package cursojava.arraylist;

import java.util.ArrayList;

public class Array_List {
	
	public static void main(String[] args) {
		
		/*Objetivo do tipo ArrayList*/
		/*1º <Integer> Tipo de dados que irá armazenar no ArrayList*/
		/*2º Nome do Array*/
		/*3º Instanciar um novo ArrayList com "new" ArrayList<>() */
		ArrayList<Integer> numeros = new ArrayList<Integer>(); /*Irá armazenar números*/
		ArrayList<String> carros = new ArrayList<String>(); /*Irá armanar String*/
		
		/*Adiciona elementos no ArrayList*/
		numeros.add(11);
		numeros.add(22);
		numeros.add(33);
		
		carros.add("HRV");
		carros.add("Polo");
		carros.add("Cruz");
		carros.add(0, "Argo");/*Método add com index "posição,"valor""*/
		carros.add(0, "Jaguar");
		
		/*Método clear para limpar todos os emlementos do ArrayList*/
		//carros.clear();
		
		/*Método indexOf Retornar a posição do Elmento informado*/
		System.out.println(carros.indexOf("Polo"));

		/*Método remove pode ser utilizado pelo elemento ou pela posição*/
		System.out.println(carros.remove("Cruz")); //remove pelo elemento informado
		System.out.println(carros.remove(3));//remove pela posição "index" informada
		
		/*Método  para cortar posições que não estão sendo utilizadas no ArrayList para não ocupar espaço na memória*/
		carros.trimToSize();//irá deixar o ArrayList somente com o tamanho de número dos elementos que estão utilizando cada posição
		//demais posições serão removidas
		
		System.out.println("-------");
		/*Percorrer o ArrayList*/
		for (int e:numeros) { /*foreach para percorrer coleções */
			System.out.println(e);
		}
		
		System.out.println("-------");
		
		for (String e:carros) { /*foreach para percorrer coleções */
			System.out.println(e);
		}
		
		System.out.println("-------");
		/*Obter um elemento específico de um ArrayList*/
		System.out.println(carros.get(4));
		
		System.out.println("-------");
		/*For tradicional para imprimir os elementos do ArrayList*/

		for(int i=0; i<carros.size();i++) {
			System.out.println(carros.get(i));
		}
		
	}

}
