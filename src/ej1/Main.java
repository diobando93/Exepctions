package ej1;

public class Main {
	
	public static void main(String[] args) {
		try {
			throw new Exception("Hola soy una exepcion ejecutada desde un try");
		} catch(Exception e) {
			System.out.println("Se produce una excepcion con throw new en el bloque try, que dice " + e.getMessage());
		}finally {
			System.out.println("El bloque finally se ejecuta a pesar de que exista un catch");
		}
	}

}
