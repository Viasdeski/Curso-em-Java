package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra = new Compra();
		
		compra.cliente = "Ana";
		
		//RELACAO BIDIRECIONAL, COMPRA PARA ITEM E ITEM PARA COMPRA
		compra.adicionaItem(new Item("Carne", 2, 25.98));//Agora se faz possível o acesso direto de compra, visto o item estar atrelado a ela e ela ao item
		compra.adicionaItem("Macarrão", 4, 1.99); // Dois metodos adicionaItens
		compra.itens.add(new Item("Arroz", 1, 5.49));
		compra.itens.add(new Item("Feijão", 3, 2.49));
		compra.itens.add(new Item("Refrigerante", 1, 2.0));

		
		System.out.println(compra.itens.size());
		
		System.out.println(compra.getTotal());
	}

}
