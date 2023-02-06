package lambdas;

public class ProdutoPredicado {
	final String nome;
	final double preco;
	final double desconto;
	
	public ProdutoPredicado(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = this.preco * (1 - this.desconto);
		return "O produto " + this.nome + " possui o preço de R$" + precoFinal;
	}
	

}
