package cursojava.executavel;

public class OperadoresTernarios {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 10;
		int nota3 = 80;
		int nota4 = 10;
		int media;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Operadores ternários são para micro validações */
		String saidaResultado;

		saidaResultado = media >= 70 ? "Aluno aprovado!!" : (media >= 40 && media <= 69)? "Aluno de recuperação" : "Aluno Reprovado";

		System.out.println("Nota -> " + media + " : " + saidaResultado);

	}

}
