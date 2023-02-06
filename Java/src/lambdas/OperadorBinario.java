package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.87, 8.99));
		
		BiFunction<Double, Double, String> imprimirResultado = (n1, n2) -> {
			double mediaFinal = (n1 + n2)/2;
			return mediaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(imprimirResultado.apply(9.76, 3.2));
		
		Function<Double, String> conceito = m -> 
			m >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(
				media
				.andThen(conceito)
				.apply(9.7, 9.8));
	}

}
;