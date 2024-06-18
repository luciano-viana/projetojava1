package cursojava.modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava5 {

	public static void main(String[] args) throws ParseException, InterruptedException {

		Date dataInicial = new SimpleDateFormat("dd/MM/yyy").parse("18/06/2024");

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);

		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1);//Adicionado 1 mês em cada repetição do for

			System.out.println("Parcela de número " + parcela + " vencimento é em "
					+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

			Thread.sleep(500);//utilizando 500 milissegundos para repetição do for
		}

	}

}