package lambdas;

public class CalculoTesteLambda {
	public static void main(String[] args) {
		//LAMBDAS = FUNÇÕES ANONIMAS QUE SAO ASSOCIADAS A VARIAVEIS
		
		Calculo calc = (x, y) -> {return x + y; };
		System.out.println(calc.executar(2,3));
		
		calc = (x, y) -> x * y; 
		System.out.println(calc.executar(2,3));
		
		
		
	}

}
