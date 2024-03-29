package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2; 
		UnaryOperator<Integer> vezesDois = n -> n * 2; 
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		//andThen executa primeiro
		Integer resultado1 = maisDois
							.andThen(vezesDois)
							.andThen(aoQuadrado)
							.apply(0);
		System.out.println(resultado1);
		
		
		//Compose, antes de executar fa�a isso.
		Integer resultado2 = aoQuadrado
							.compose(vezesDois)
							.compose(maisDois)
							.apply(0);
		System.out.println(resultado2);
	}

}
