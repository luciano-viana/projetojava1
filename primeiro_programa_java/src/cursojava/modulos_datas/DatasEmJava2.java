package cursojava.modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava2 {

	public static void main(String[] args) throws ParseException {

		// Compração de datas

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		// Objeto Date
		Date dataVencimentoBoleto = simpleDateFormat.parse("25/06/2024");

		Date dataAtuaHoje = simpleDateFormat.parse("18/06/2024");

		//Se a data 1 é maior do que a data 2
		if (dataVencimentoBoleto.after(dataAtuaHoje)) {//Posterior ou maior ou depois da data atual
           System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido - URGENTE");
		}
		
		//Se a data 1 é menor do que a data 2
		if (dataVencimentoBoleto.before(dataAtuaHoje)) {//Anterior ou maior ou depois da data atual
			System.out.println("Boleto vencido - URGENTE");
			}else {
				System.out.println("Boleto não vencido");
			}
	}
}
