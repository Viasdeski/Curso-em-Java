package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	public final static UnaryOperator<String> maiuscula = 
			upper -> upper.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = 
			p -> p.charAt(0) + "";
			
	public final static String grito(String n) {
		return n + "!!!";
	}
	

}
