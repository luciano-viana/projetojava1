package cursojava.executavel;

public class ArrayVetor2 {

	public static void main(String[] args) {
		        //posição    0   1   2
		double valores[] = {9.5,8.9,5.0}; 
		//pode passar o valor direto sem precisar fazer com o new
		
		//Para passar vários tipos de dados para um Array utilizar String
		String valoresString[] = new String[5];
		valoresString[0] = "Luciano";
		valoresString[1] = "Dev Java Web";
		valoresString[2] = "Em evolução";
		valoresString[3] = "Em progresso";
		valoresString[4] = "Idade 33 anos";		
		
		System.out.println(valores[2]);
		System.out.println(valoresString[0]);
		
		System.out.println("-----------------------------");
		for(int pos = 0; pos < valoresString.length; pos++) {
			System.out.println("Mensagem: " + (pos+1) + " : " + valoresString[pos]);
		}
		
	}
}
