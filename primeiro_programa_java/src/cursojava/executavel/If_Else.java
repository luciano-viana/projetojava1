package cursojava.executavel;

public class If_Else {

	public static void main(String[] args) {

		/*
		 * int mediaAluno = 69; String nome = "Luciano";
		 * 
		 * if (mediaAluno >= 70 && nome.equals("Luciano")) {
		 * System.out.println("Parabéns você está aprovado"); } else if (mediaAluno <
		 * 70) { System.out.println("Que pena você está reprovado, estude mais!!"); }
		 * else { System.out.println("Aluno não identificado"); }
		 */
		
		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 10;
		int nota4 = 0;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
        
		/*Condições lógica com IF e ELSE*/
		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno de recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}
	}
}
