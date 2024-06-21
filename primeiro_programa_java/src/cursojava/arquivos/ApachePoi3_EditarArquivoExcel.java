package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi3_EditarArquivoExcel {

	public static void main(String[] args) throws Exception {

		File file = new File(
				"C:\\Users\\lucianoviana\\git\\projetojava1\\primeiro_programa_java\\src\\cursojava\\arquivos\\arquivo_excel.xls");

		FileInputStream entrada = new FileInputStream(file);

		// Objeto
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);/* Prepara a entrada do arquivo xls do excel */
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); // Pegando a planilha

		// Percorrer as linhas da planilha
		Iterator<Row> linhaIterato = planilha.iterator();

		while (linhaIterato.hasNext()) {// Enquanto tiver linha
			Row linha = linhaIterato.next();// Dados da pessoa na linha "next próxima linha"

			// Retorna número de celulas da linha
			int numeroCelulas = linha.getPhysicalNumberOfCells();// Quantidade de celula

			// Criar celula na linha
			Cell cell = linha.createCell(numeroCelulas);// Cria nova celula da linha
			cell.setCellValue("5.487,20");
		}

		entrada.close();

		FileOutputStream saida = new FileOutputStream(file);// Dar a saida para o mesmo arquivo
		hssfWorkbook.write(saida);// Fazendo escrita para a saida
		saida.flush();
		saida.close();

		System.out.println("Planilha atualizada");
	}

}
