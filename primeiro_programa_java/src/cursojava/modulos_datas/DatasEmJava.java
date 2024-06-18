package cursojava.modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava{
	
	public static void main(String[] args) throws ParseException{
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();//Objeto Date é utilizando mais em sistemas antigos a forma mais atual é utilizar o objeto Calendar
			System.out.println("Data em milisegundos: " + date.getTime());
			System.out.println("Data em milisegundos com Calendar: " + calendar.getTimeInMillis());
			System.out.println("--------------------------------------------------------------------");
			
			System.out.println("Dia do Mês: " + date.getDate());
			System.out.println("Dia do Mês com Calendar: " + calendar.get(calendar.DAY_OF_MONTH));
			System.out.println("--------------------------------------------------------------------");
		
			System.out.println("Dia da Semana: " + date.getDay());
			System.out.println("Dia da Semana com Calendar: " + (calendar.get(calendar.DAY_OF_WEEK) -1));
			System.out.println("--------------------------------------------------------------------");
			
			System.out.println("Hora do dia: " + date.getHours());
			System.out.println("Hora do dia com Calendar: " + calendar.get(calendar.HOUR_OF_DAY));
			System.out.println("--------------------------------------------------------------------");
			
			System.out.println("Minuto da hora: " + date.getMinutes());
			System.out.println("Minuto da hora com Calendar: " + calendar.get(calendar.MINUTE));
			System.out.println("--------------------------------------------------------------------");
			
			System.out.println("Segundos: " + date.getSeconds());
			System.out.println("Segundos com Calendar: " + calendar.get(calendar.SECOND));
			System.out.println("--------------------------------------------------------------------");
			
			System.out.println("Ano: " + (date.getYear() + 1900));
			System.out.println("Ano com Calendar: " + calendar.get(calendar.YEAR));
			System.out.println("--------------------------------------------------------------------");
			
			/*---------------Objeto Simple Date Format----------------*/
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");//Formatação de data para mostrar na tela para o usuário
			System.out.println("Data atual em formato padrão e String: " + simpleDateFormat.format(date));
			System.out.println("Calendar Data atual em formato padrão e String: " + simpleDateFormat.format(calendar.getTime()));
			System.out.println("--------------------------------------------------------------------");
			
			simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//Formatação utilizada para gravar a data no banco de dados
			System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));
			System.out.println("Calendar em formato para banco de dados: " + simpleDateFormat.format(calendar.getTime()));
			System.out.println("--------------------------------------------------------------------");
			
			simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("Objeto Date: " + simpleDateFormat.parse("2024-07-18"));//parse retorna um objeto data
			
			simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Objeto Date: " + simpleDateFormat.parse("18/07/2024"));
	}

}
