package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTesteFuncional {
	public static void main(String[] args) {
		//LAMBDAS = FUN��ES ANONIMAS QUE SAO ASSOCIADAS A VARIAVEIS
		
		//N�O PERMITE int -> Double
		//PERMITE double -> Double
		
		BinaryOperator<Double> calc = (x, y) -> {return x + y; };
		System.out.println(calc.apply(2.0,3.0));
		
		calc = (x, y) -> x * y; 
		System.out.println(calc.apply(2.0,3.0));

		BinaryOperator<Integer> calc2 = (x, y) -> {return x + y; };
		System.out.println(calc2.apply(2,3));
		
		calc = (x, y) -> x * y; 
		System.out.println(calc.apply(2.0,3.0));
		
	}

}
