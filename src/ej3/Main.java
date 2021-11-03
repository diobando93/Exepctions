package ej3;

public class Main {
	int[] array = {0, 1, 2, 3, 4, 5};
	
	int getValor(int indice) {
        return array[indice];
    }
	
	public static void main(String[] args) {
		Main arrayEx = new Main();
		try {
			arrayEx.getValor(6);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Excepción: indice de array fuera de limites " + e.getMessage());
		}
	}
}
