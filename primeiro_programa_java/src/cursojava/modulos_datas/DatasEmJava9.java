package cursojava.modulos_datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava9 {

	public static void main(String[] args) {
		
	  /*LocalDate dataAntiga = LocalDate.of(2020, 1, 25);
		LocalDate dataNova = LocalDate.of(2024, 8, 1);*/
		
		LocalDate dataAntiga = LocalDate.parse("2023-04-01");
		LocalDate dataNova = LocalDate.parse("2024-06-19");
		
		System.out.println("Data antiga é maior do que data nova: " + dataAntiga.isAfter(dataNova));
		System.out.println("Data antiga é anterior do que data nova: " + dataAntiga.isBefore(dataNova));
		System.out.println("Datas são iguais: " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);//Comparação de intervalo entre datas
		
		System.out.println("Quantos dias: " + periodo.getDays());
		System.out.println("Quantos meses: " + periodo.getMonths());
		System.out.println("Quantos meses: " + periodo.getYears());

		System.out.println("Total de meses entre as datas: " + periodo.toTotalMonths());
		
		System.out.println("Perido é: " + periodo.getYears() + " anos " + periodo.getMonths() + " meses " + periodo.getDays() + " dias");
		
		
	}

}
