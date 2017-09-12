package modulo4.polimorfismo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Polimorfismo {
	
	public static void main(String[] args) {
		
		Abogado abogado= new Abogado();
		Ingeniero ingeniero = new Ingeniero();
		Medico medico= new Medico();
		
		List<EsProfesional> profesionales= new ArrayList<>();
		profesionales.add(abogado);
		profesionales.add(ingeniero);
		profesionales.add(medico);
		
		for (Iterator iterator = profesionales.iterator(); iterator.hasNext();) {
			EsProfesional esProfesional = (EsProfesional) iterator.next();
			esProfesional.mostrarProfesion();
		}
		
	}

}
