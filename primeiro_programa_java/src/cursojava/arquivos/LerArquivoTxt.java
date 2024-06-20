package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {

		// Arquivo de entrada de dados
		FileInputStream entradaArquivo = new FileInputStream(new File(
				"C:\\Users\\lucianoviana\\git\\projetojava1\\primeiro_programa_java\\src\\cursojava\\arquivos\\arquivo.txt"));

		// Passado a entrada do arquivo "entradaArquivo" e codificação "UTF-8"
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		while (lerArquivo.hasNext()) {// hasNext ver se tem o próximo elemento

			String linha = lerArquivo.nextLine();// nextLine avança para a próxima linha

			// ignora linha em branco ou vazia
			if (linha != null && !linha.isEmpty()) {// isEmpty = está vazia
				System.out.println(linha);
			}

		}
	}

}
