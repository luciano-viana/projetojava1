package cursojava.executavel;

public class SplitArray {

	public static void main(String[] args) {
      //Sprit é utilizado para quebrar um texto convertendo em Array
		
		String texto = "Luciano, Curso Java, 80, 70, 90, 89";
		
		String valoresArray[] = texto.split(",");
		
		//Imprimir dados array pelo println
		System.out.println("Nome:" + valoresArray[0]);
		System.out.println("Curso:" + valoresArray[1]);
		System.out.println("Nota1:" + valoresArray[2]);
		System.out.println("Nota2:" + valoresArray[3]);
		System.out.println("Nota3:" + valoresArray[4]);
		System.out.println("Nota4:" + valoresArray[5]);
		
		System.out.println("----------------------");
		
		//Percorrer o Array utilizando o for
		for(int pos = 0; pos < valoresArray.length;pos++) {
			System.out.println("Valor" + (pos+1) + " = " + valoresArray[pos]);
		}

	}

}
