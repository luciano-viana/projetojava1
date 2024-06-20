package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt2 {

	public static void main(String[] args) throws FileNotFoundException {

		// Arquivo de entrada de dados
		FileInputStream entradaArquivo = new FileInputStream(new File(
				"C:\\Users\\lucianoviana\\git\\projetojava1\\primeiro_programa_java\\src\\cursojava\\arquivos\\arquivo.txt"));

		// Passado a entrada do arquivo "entradaArquivo" e codificação "UTF-8"
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (lerArquivo.hasNext()) {// hasNext ver se tem o próximo elemento

			String linha = lerArquivo.nextLine();// nextLine avança para a próxima linha

			// ignora linha em branco ou vazia
			if (linha != null && !linha.isEmpty()) {// isEmpty = está vazia

				// Array de String para separar os dados do arquivo por ; ou |
				String[] dados = linha.split("\\|");// split quebra os dados pelo formato informado ; ou |
				Pessoa pessoa = new Pessoa();// Iniciado um novo objeto
				pessoa.setNome(dados[0]);
				pessoa.setIdade(Integer.parseInt(dados[1]));
				pessoa.setEmail(dados[2]);

				pessoas.add(pessoa);
			}

		}

		// Imprimindo a lista de pessoas
		for (Pessoa pessoa : pessoas) {// Poderia gravar os dados da lista de pessoa no banco de dados, enviar e-mail
										// ou outros...
			System.out.println(pessoa);
		}
	}

}