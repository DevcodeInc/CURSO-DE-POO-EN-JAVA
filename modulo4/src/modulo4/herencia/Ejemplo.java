package modulo4.herencia;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ejemplo {

	public static void main(String[] args) {
		
		
		
		for (int i = 0; i < 100000; i++) {
			Calendar calendario = new GregorianCalendar();
			int hora, minutos, segundos,mili;
			hora =calendario.get(Calendar.HOUR_OF_DAY);
			minutos = calendario.get(Calendar.MINUTE);
			segundos = calendario.get(Calendar.SECOND);
			mili=calendario.get(Calendar.MILLISECOND);
			System.out.println(hora + ":" + minutos + ":" + segundos+"-"+mili);
		
		}
		calcular(new int[]{1,2});
		calcular (new int[]{1,2});

		
	}
	public static void calcular(int [] array){
		File f = new File("s");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
