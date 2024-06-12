package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray2 {

	public static void main(String[] args) {
		
		//Conversão Array para Lista e Lista para Array
		
		String texto = "Luciano,Curso Java,80,70,90,89";
		
		String valoresArray[] = texto.split(",");
		
		//Convertendo um Array em uma lista
		List<String> list = Arrays.asList(valoresArray);
		
		//Ler a lista
		for (String valorString : list) {
			System.out.println("Valor: " + valorString);
		}
		
		//------------------------------------------------------------
		System.out.println("");
		//Convertendo uma lista para Array
		String conversaoArray[] = list.toArray(new String[6]);
		
		for(int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println("Posição " + (pos+1) + ": " + conversaoArray[pos]);
		}
		
		
	}

}
