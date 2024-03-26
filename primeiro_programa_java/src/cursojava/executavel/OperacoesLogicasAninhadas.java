package cursojava.executavel;

public class OperacoesLogicasAninhadas {

	public static void main(String[] args) {

		/* Operações lógicas aninhadas: São operações dentro de operações */
		int nota1 = 60;
		int nota2 = 60;
		int nota3 = 10;
		int nota4 = 30;
		int media;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 50) {
			if (media >= 90) {
				System.out.println("Média Nota: " + media);
				System.out.println("Excelente, parabéns, aluno você é muito bom!!");
			} else {
				if (media >= 70) {
					System.out.println("Média Nota: " + media);
					System.out.println("Aluno aprovado!!");
				} else {
					System.out.println("Média Nota: " + media);
					System.out.println("Aluno de recuperação!!");
				}
			}
		} else {
			if (media >= 40 && media <= 50) {
				System.out.println("Média Nota: " + media);
				System.out.println("Aluno Reprovado, estude mais");
			} else {
				System.out.println("Média Nota: " + media);
				System.out.println("Nota péssima, aluno estude mais!!");
			}
		}
	}
}
