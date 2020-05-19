package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class fechas {
 
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
 
		Date fechaInicial=dateFormat.parse("2016-02-14");
		Date fechaFinal=dateFormat.parse("2016-03-22");
 
		//int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
 
		int difMeses = (fechaInicial.getMonth() - fechaFinal.getMonth());
		//System.out.println("Hay "+dias+" dias de diferencia");
		
		System.out.println(difMeses);
	}
}