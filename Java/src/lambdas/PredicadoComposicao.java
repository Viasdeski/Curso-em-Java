package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar =
				valor -> valor % 2 == 0;
		Predicate<Integer> isTresDigitos = 
				valor -> valor >= 100 && valor <= 999; 
				
		System.out.println(
				isPar
				.and(isTresDigitos)
				.negate()
				.test(122)
		);
		
		System.out.println(
				isPar
				.or(isTresDigitos)
				.test(122)
		);
	}

}
