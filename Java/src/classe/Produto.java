package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	/*Produto(String nome, double preco, double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}*/
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco; 
	}
	
	Produto(){}
	
	
	double precoComDesconto(){
		return preco * (1 - desconto);
	}

}
