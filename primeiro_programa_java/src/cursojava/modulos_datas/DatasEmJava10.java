package cursojava.modulos_datas;

import java.time.LocalDate;

public class DatasEmJava10 {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2024-06-19");
		
		//Adição de datas
		System.out.println("---ADIÇÃO DE DATAS---");
		System.out.println("Data Atual: " + dataBase);
		System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));
		System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));
		System.out.println("Mais 5 meses: " + (dataBase = dataBase.plusMonths(5)));
		System.out.println("Mais 2 anos: " + (dataBase = dataBase.plusYears(2)));
		
		System.out.println("");
		//Subtração
		System.out.println("---SUBTRAÇÃO DE DATAS---");
		System.out.println("Data Atual: " + dataBase);
		System.out.println("Menos 1 anos: " + (dataBase = dataBase.minusYears(1)));
		System.out.println("Menos 1 mês: " + (dataBase = dataBase.minusMonths(1)));
		System.out.println("Menos 1 semana: " + (dataBase = dataBase.minusWeeks(1)));
		System.out.println("Menos 1 dia: " + (dataBase = dataBase.minusDays(1)));

	}

}
