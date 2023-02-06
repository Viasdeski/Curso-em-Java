package desafios.composicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final 	String nome;
	final List<Compra> compras = new ArrayList<>();
	double valorTotal = 0;
	
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adionarCompra(Compra compra){
		this.compras.add(compra);
	}
	
	void removeItem(Compra compra){
		int index = this.compras.indexOf(compra);
		this.compras.remove(index);
	}
	
	double getValorTotal() {
		for(Compra compra : compras) {
			valorTotal += compra.getValorTotal();
		}
		return valorTotal;
	}

}
