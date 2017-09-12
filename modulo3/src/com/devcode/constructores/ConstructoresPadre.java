package com.devcode.constructores;

public class ConstructoresPadre {
	
	public static void main(String[] args) {
		ConstructoresHijo constructoresHijo= new ConstructoresHijo();
	}
	
	public ConstructoresPadre(int parametro) {
		System.out.println("Hola, soy el constructor del padre");
	}
	
}

class ConstructoresHijo extends ConstructoresPadre{
	public ConstructoresHijo() {
		super(1);
		System.out.println("Hola, soy el constructor del hijo");
	}
}
