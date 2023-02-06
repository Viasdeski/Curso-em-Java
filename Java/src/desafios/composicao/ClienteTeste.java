package desafios.composicao;

public class ClienteTeste {
	public static void main(String[] args) {
		
		Cliente vitor = new Cliente("Vitor");
		
		Compra compra1 = new Compra();
		compra1.adionarItem("Caneta Azul", 0.99, 100);
		Produto p1 = new Produto("Caneta Verde", 2.99);
		compra1.adionarItem(p1, 50);
		
		Compra compra2 = new Compra();
		compra2.adionarItem("Caderno", 5.99, 10);
		Produto p2 = new Produto("Estojo", 15);
		compra2.adionarItem(p2, 1);
		
		
		vitor.adionarCompra(compra1);
		vitor.adionarCompra(compra2);
		
		System.out.println(compra1.getItens());
		
		
		System.out.println(vitor.getValorTotal());
		
	
		
		
	}

}
