package cursojava.modulos_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava11 {

	public static void main(String[] args) {

		// Geração de Boletos

		LocalDate dataBase = LocalDate.parse("2024-06-19");

		for (int mes = 1; mes <= 12; mes++) {
			dataBase = dataBase.plusMonths(1);

			System.out.println("Data de Vencimento do boleto: "
					+ dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês " + mes);
		}

	}

}
