package lambdas;

import java.util.function.Function;

public class FuncaoFunction {
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Ímpar"; //OPERADOR TERNARIO
				
				
		Function<String, String> oResultadoE = 
				valor -> "O resultado é: " + valor;
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.apply(33);
	
				
		System.out.println(resultadoFinal);
						
	}

}
;