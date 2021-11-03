package nivel22;

import java.util.InputMismatchException;

public class myExceptions  {
	public void f() throws RuntimeException{
		
		try {
			
			g();
			
		} catch (ArrayIndexOutOfBoundsException e){
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public void g() {
		try {
			
			String message = "Tipos de excepciones";
			throw new InputMismatchException(message);
			
		} catch(InputMismatchException e) {
			
			System.out.println(e.getMessage());
			
		}
	}
	
}