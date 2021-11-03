package ej4;

public class Main {
	public static void main (String[] args) {
		try {
			
			throw new myException("hola nueva excepcion que hereda de la clase excepcion");
			
		} catch(myException e) {
			System.out.println("excepcion: " + e.getMessage());
		}
	}

}
