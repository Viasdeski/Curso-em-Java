package lambdas;

import java.util.function.Predicate;

public class PredicadoPredicate {
	public static void main(String[] args) {
		
		ProdutoPredicado p1 = new ProdutoPredicado("Notebook", 2000, 0.15);
		
		Predicate<ProdutoPredicado> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 700;
				
		System.out.println(isCaro.test(p1));
					
	}

}
