package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
		ProdutoPredicado p1 = new ProdutoPredicado("PC", 5620.45, 0.1);
		
		Function<ProdutoPredicado, Double> precoReal = 
				produto ->  produto.preco * (1 - produto.desconto) ;	
		
		UnaryOperator<Double> comImposto =
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> comFrete =
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
				
		UnaryOperator<Double> arredondar =
				//preco -> Double.parseDouble(String.format("%.2f", preco));//NAO FUNCIONOU
				preco -> Double.parseDouble(String.format("%.7s", preco));
				
	    Function<Double, String> formatar =
	    		preco -> ("R$" + preco).replace(".", ",");
	    
	    String precoFinal = precoReal
	    		.andThen(comImposto)
	    		.andThen(comFrete)
	    		.andThen(arredondar)
	    		.andThen(formatar)
	    		.apply(p1);
	    
	    System.out.println("O preço final é: " + precoFinal);
		
		
				

			
	}
	
	/*
	 * A partir do produto, calcular o preco real; V
	 * Imposto Municipal: => 2500(8,5%) -se nao 2500(Isento)]
	 * Frete: >= 3000 (100) -se nao < 3000 (50)
	 * Arrendondar: Duas casas decimais
	 * Formatar: R$1234,56
	 */
}
