package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	
	
	void adicionaItem(String nome, int quantidade, double preco) {
		this.adicionaItem(new Item(nome, quantidade, preco));
	}
	
	void adicionaItem(Item item) {
		this.itens.add(item);
		item.compra = this; //No momento que adiciona o item a compra, eu associo também a compra a este item;
	}
	
	double getTotal() {
		double total = 0;
		
		for(Item item : itens) {
			total += item.preco * item.quantidade;
		}
		return total;
	}
}
