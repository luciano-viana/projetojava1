package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2_LerArquivoExcel {

	public static void main(String[] args) throws Exception {

		// FileInputStream: utilizado para entrada de dados
		FileInputStream entrada = new FileInputStream(new File(
				"C:\\Users\\lucianoviana\\git\\projetojava1\\primeiro_programa_java\\src\\cursojava\\arquivos\\arquivo_excel.xls"));

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);// Prepara a entrada do arquivo do excel para ler
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);// Pega a primeiro planilha do nosso arquivo excel "primeira aba
														// da planilha"

		// Iterator: utilizado para percorrer as linhas
		Iterator<Row> linhaIterator = planilha.iterator();

		// Lista de pessoas irá receber os dados da planilha
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (linhaIterator.hasNext()) {// Enquanto tiver linha no arquivo excel

			Row linha = linhaIterator.next();// Dados da pessoa na linha

			// Iterator utilizado para pecorrer as celulas das linhas
			Iterator<Cell> celulas = linha.iterator();

			// Objeto pessoa
			Pessoa pessoa = new Pessoa();

			while (celulas.hasNext()) {// Percorre as celulas
				Cell cell = celulas.next();

				switch (cell.getColumnIndex()) {// pegar o índice da celula
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				case 2:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				}
			} // Fim das celula da linha

			pessoas.add(pessoa);
		}
		entrada.close();// Terminou de ler o arquivo excel

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		// LENDO OS DADOS DO ARQUIVO DO EXCEL E INSERINDO NA LISTA PESSOA
	}
}
