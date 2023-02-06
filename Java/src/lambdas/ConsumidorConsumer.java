package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumidorConsumer {
	public static void main(String[] args) {
		
		ProdutoPredicado p1 = new ProdutoPredicado("Caneta", 2.67, 0.05);
		ProdutoPredicado p2 = new ProdutoPredicado("Lápis", 1.99, 0.0);
		ProdutoPredicado p3 = new ProdutoPredicado("Borracha", 0.80, 0.0);
		ProdutoPredicado p4 = new ProdutoPredicado("Caderno", 15.89, 0.1);
		
		Consumer<ProdutoPredicado> imprimir = 
				produto -> System.out.printf("\nO preco de %s é R$%.2f \n",produto.nome, produto.preco);
				
//		imprimir.accept(p1);
//		imprimir.accept(p2);
//		imprimir.accept(p3);
//		imprimir.accept(p4);
		
		//EXEMPLO
		List<ProdutoPredicado> produtos = Arrays.asList(p1, p2, p3, p4);
		
		produtos.forEach(imprimir);
		produtos.forEach(System.out::println);
	}

}
