package cursojava.heranca_polimorfismo;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno2 aluno2 = new Aluno2();
		aluno2.setNome("Luciano - Dev Full Stack");
		aluno2.setIdade(33);
		
		/*------------------------------------------*/
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("rertg09403890ifae");
		diretor.setNome("Luciano");
		diretor.setIdade(50);
		/*------------------------------------------*/
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCPF("09948785262");
		secretario.setIdade(18);
		
		System.out.println(aluno2);
		System.out.println(/*------------------------------------------*/);
		System.out.println(diretor);
		System.out.println(/*------------------------------------------*/);
		System.out.println(secretario);
		
		System.out.println(/*------------------------------------------*/);
		System.out.println(aluno2.pessoaMaiorIdade() + " - " + aluno2.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
	
	}

}
