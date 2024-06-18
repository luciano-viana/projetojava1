package cursojava.modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {

		//Quantos dias que existe entre uma faixa de data?
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2023-01-01"), LocalDate.now());/*Total de dias de uma data até hoje*/
		System.out.println("Possui " + dias + " dias entre a faixa de data");
		
		long meses = ChronoUnit.MONTHS.between(LocalDate.parse("2023-01-01"), LocalDate.now());/*Total de dias de uma data até hoje*/
		System.out.println("Possui " + meses + " meses entre a faixa de data");
		
		long anos = ChronoUnit.YEARS.between(LocalDate.parse("2023-01-01"), LocalDate.now());/*Total de dias de uma data até hoje*/
		System.out.println("Possui " + anos + " anos entre a faixa de data");
		
		System.out.println("Possui " + anos + " anos " + meses +" meses e " + dias + " dias entre a faixa de data informada");
		
	}

}
