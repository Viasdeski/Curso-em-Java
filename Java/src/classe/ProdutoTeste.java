package classe;


public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caneta Azul",4.78);
		
		var p2 = new Produto("Caneta Preta",5.67);
		
		System.out.printf("O pre�o com %f de desconto da %s �: R$%.2f \n",Produto.desconto, p1.nome, p1.precoComDesconto());
		System.out.printf("O pre�o com %f de desconto da %s �: R$%.2f \n",Produto.desconto, p2.nome, p2.precoComDesconto());
		
		
		Produto.desconto = 0.1;
		
		System.out.printf("O novo pre�o da %s �: R$%.2f \n",p1.nome, p1.precoComDesconto());
		System.out.printf("O novo pre�o da %s �: R$%.2f", p2.nome, p2.precoComDesconto());
		 
	}

}
