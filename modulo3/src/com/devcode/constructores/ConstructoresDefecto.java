package com.devcode.constructores;

public class ConstructoresDefecto {
	public static void main(String[] args) {
		ConstructoresDefecto constructoresDefecto = new ConstructoresDefecto(4);
		ConstructoresDefecto constructoresDefectoParametro = new ConstructoresDefecto(1);
	}
	
	public ConstructoresDefecto() {
		System.out.println("Hola soy el constructor por defecto");
	}
	
	public ConstructoresDefecto(int parameter1) {
		System.out.println("Hola "+parameter1 );
	}
}
