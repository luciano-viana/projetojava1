package cursojava.executavel;
import cursojava.classes.Aluno;

public class PrimeiraClasseJava4 {
	
	public static void main(String[] args) {
		
		/*Equals e hashcode (Diferenciar e comprar objetos)*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Luciano");
		aluno1.setNumeroCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Luciano");
		aluno2.setNumeroCpf("1234");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		}else {
			System.out.println("Alunos não são iguais");
		}
		
	}

}
