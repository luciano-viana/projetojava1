package cursojava.modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava3 {

	public static void main(String[] args) throws ParseException {

		// Manipular datas com o Calendar

		Calendar calendar = Calendar.getInstance();// Pega a data atual

		calendar.setTime(new SimpleDateFormat("dd-MM-yyy").parse("18-06-2024"));

		calendar.add(Calendar.DAY_OF_MONTH, 10);// Data de hoje mais 10 dias
		System.out.println("Somando dia do Mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		calendar.add(Calendar.MONTH, 4);
		System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		calendar.add(Calendar.YEAR, 1);
		System.out.println("Somando 1 ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}
}
