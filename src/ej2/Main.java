package ej2;

public class Main {
	
	class ExceptionNull {
		String s = "hola se ha generado un null";

		String getString() {
			return s;
		}

	}
	
	public static void main(String [] args) {
		
		ExceptionNull en = null;
		try {
			en.getString();
		}catch (Exception e) {
			System.out.println("Se produjo una excepcion " + e.getMessage());
		}
		
	}
}
