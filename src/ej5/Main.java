package ej5;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		boolean continuar = true;
		Scanner entrada = new Scanner(System.in);
		while(continuar) {
			try {
				System.out.println("Introduce un numero: ");
				String numeroCadena = entrada.next();
				int numeroEntero = Integer.parseInt(numeroCadena);
				System.out.println(numeroEntero);
				continuar = false;
			}catch(Exception e) {
				System.out.println("Ingrese un numero entero, ingreso incorrecto " + e.getMessage());
			}
		}
	}

}
