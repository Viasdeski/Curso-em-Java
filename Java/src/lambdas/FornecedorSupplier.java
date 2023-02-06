package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class FornecedorSupplier {
	
	public static void main(String[] args) {
		
		Supplier<List<String>> aLista = 
				() -> Arrays.asList("Ana", "Bia", "Lia");
				
		
		System.out.println(aLista.get());
	}

}
