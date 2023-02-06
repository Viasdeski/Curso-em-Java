package desafios.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<>();
	double valorTotal = 0;
	

	void adionarItem(Produto produto, double quantidade){
		this.itens.add(new Item(produto, quantidade));
	}
	
	void adionarItem(String nome, double preco, int quantidade){
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	void removeItem(Item item){
		int index = this.itens.indexOf(item);
		this.itens.remove(index);
	}
	
	List<String> getItens(){
		List<String> listaItens = new ArrayList<>(); 
		for(Item item : this.itens) {
			listaItens.add(item.produto.nome);
		}
		return listaItens;
	}
	
	double getValorTotal() {
		for(Item item : itens) {
			if(!itens.isEmpty()) {
				valorTotal += item.produto.preco * item.quantidade;
				return valorTotal;
			}else {
				System.out.println("A lista de itens está vazia.");
			}
		}
		return 0;
	}
	

}
