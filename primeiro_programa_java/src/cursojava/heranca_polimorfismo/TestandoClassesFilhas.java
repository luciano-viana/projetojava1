package cursojava.heranca_polimorfismo;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno2 aluno2 = new Aluno2();
		aluno2.setNome("Luciano - Dev Full Stack");
		aluno2.setIdade(33);
		
		System.out.println("---------------------------------------------------------------------------");
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("rertg09403890ifae");
		diretor.setNome("Fábio");
		diretor.setIdade(50);
		
		System.out.println("---------------------------------------------------------------------------");
		Secretario secretario = new Secretario();
		secretario.setNome("Carlos");
		secretario.setExperiencia("Administração");
		secretario.setNumeroCPF("09948785262");
		secretario.setIdade(18);
		
		System.out.println(aluno2);
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println(diretor);
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println(secretario);
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println(aluno2.pessoaMaiorIdade() + " - " + aluno2.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println("Salário do Aluno: " + aluno2.salario());
		System.out.println("Salário do Diretor: " + diretor.salario());
		System.out.println("Salário do Secretário: " + secretario.salario());
		
		//Utilizando Polimorfismo
		/*Pessoa pessoa = new Aluno2();
		pessoa = secretario;
		System.out.println(pessoa);*/
		
		System.out.println("---------------------------------------------------------------------------");
		teste(aluno2);
		teste(diretor);
		teste(secretario);
		
	}
	
	/*Método*/
	public static void teste (Pessoa pessoa) {
		System.out.println("Essa pessoa é de mais = " + 
	pessoa.getNome() + " e o salário é de = " + pessoa.salario());
	}
	

}






















