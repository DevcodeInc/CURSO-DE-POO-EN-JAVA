package modulo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrimerCaso {
	public static void main(String[] args) {

		PrimerCaso primerCaso= new PrimerCaso();
		try {
			primerCaso.disparandoExcepcion();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
	private void disparandoExcepcion() throws IOException {
		FileInputStream fis= new FileInputStream("c:/text.txt");
	}
}
