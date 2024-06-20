package cursojava.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws Exception {

		// 1º - Criar o arquivo
		File file = new File(
				"C:\\Users\\lucianoviana\\git\\projetojava1\\primeiro_programa_java\\src\\cursojava\\arquivos\\arquivo_excel.xls");

		// 2º - Se o arquivo na existe o mesmo será criado
		// verificando se o arquivo.xls existe, caso não exite irá criar ele
		if (!file.exists()) {
			file.createNewFile();
		}

		// 3º - Simulando os dados
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

		Pessoa pesso4 = new Pessoa();
		pesso4.setNome("Lucas");
		pesso4.setIdade(47);
		pesso4.setEmail("lucas@gmail.com");

		// Os dados da lista pode vim do banco de dados ou de qualquer fonte de dados
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pesso1);
		pessoas.add(pesso2);
		pessoas.add(pesso3);
		pessoas.add(pesso4);

		// 4º - HSSFWorkbook é o objeto do apache POI que será utilizado para escrever
		// na planilha
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();// Vai ser usado para escrever a planilha
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas JDev Treinamento");// Criar a planilha
																									// "nome aba
																									// planilha"

		// 5º - Controlar as linhas que estão sendo criadas
		int numeroLinha = 0;
		for (Pessoa pessoa : pessoas) {// Varre os dados da lista de pessoas
			// Row = linha
			Row linha = linhasPessoa.createRow(numeroLinha++);// Para cada pessoa criar a linha na planilha

			int celula = 0;

			// 6º - Para cada abributo da pessoa criar uma celula "coluna" com os valores
			Cell celNome = linha.createCell(celula++);// Celula 1
			celNome.setCellValue(pessoa.getNome());

			Cell celIdade = linha.createCell(celula++);// Celula 2
			celIdade.setCellValue(pessoa.getIdade());

			Cell celEmail = linha.createCell(celula++);// Celula 3
			celEmail.setCellValue(pessoa.getEmail());

		} // Terminou de montar a planilha

		// 7º - Assim que terminar de montar a planilha escrever no arquivo e finalizar
		FileOutputStream saida = new FileOutputStream(file);// FileOutputStream = Fluxo de saída de arquivo
		hssfWorkbook.write(saida);/* Escreve a planilha em arquivo */
		saida.flush();// O flush é para obrigar realmente a escrever os dados para disco.
		saida.close();

		System.out.println("A planilha foi criada");
	}

}
