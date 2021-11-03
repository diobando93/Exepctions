package ej4;

public class myException extends Exception{
	
	String message;
	
	public myException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
