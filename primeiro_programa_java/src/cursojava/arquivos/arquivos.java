package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class arquivos {

	public static void main(String[] args) throws IOException {

		// Instanciar classe pessoa
		Pessoa pesso1 = new Pessoa();
		pesso1.setNome("Carlos");
		pesso1.setIdade(28);
		pesso1.setEmail("carlos@gmail.com");

		Pessoa pesso2 = new Pessoa();
		pesso2.setNome("Lais");
		pesso2.setIdade(25);
		pesso2.setEmail("lais@gmail.com");

		Pessoa pesso3 = new Pessoa();
		pesso3.setNome("Patricia");
		pesso3.setIdade(22);
		pesso3.setEmail("patricia@gmail.com");

		// Os dados da lista pode vim do banco de dados ou qualquer fonte de dados
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pesso1);
		pessoas.add(pesso2);
		pessoas.add(pesso3);

		// Objeto arquivo
		File arquivo = // Gerando arquivo no formtado TXT
				new File(
						"C:\\Users\\lucianoviana\\git\\projetojava1\\primeiro_programa_java\\src\\cursojava\\arquivos\\arquivo.txt");

		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}

		// Objeto para escrever no arquivo
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);

		/*
		 * escrever_no_arquivo.write("Meu texto do arquivo");// Write é escrever no
		 * arquivo escrever_no_arquivo.write("\n");
		 * escrever_no_arquivo.write("Minha segunda linha \n");
		 * escrever_no_arquivo.write("\n"); escrever_no_arquivo.flush();// flush é para
		 * persistir as alterações escrever_no_arquivo.close();// close para fechar o
		 * arquivo "sempre tem que fechar o arquivo"
		 */

		/*
		 * for(int i = 1; i <= 10; i++) {
		 * escrever_no_arquivo.write("Texto da minha linha " + i + " \n"); }
		 */

		for (Pessoa pessoa : pessoas) {// Varre os dados da lista de pessoas
			escrever_no_arquivo.write(pessoa.getNome() + ";" + pessoa.getIdade() + ";" + pessoa.getEmail() + "\n");
		}

		escrever_no_arquivo.flush();// O flush é para obrigar realmente a escrever os dados para disco.
		escrever_no_arquivo.close();// Fechar
	}

}
