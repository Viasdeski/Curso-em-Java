package desafios.classe.modulo;

public class Jantar {
	public static void main(String[] args) {
		
		Comida arroz = new Comida("Arroz",0.250);
		Comida feijao = new Comida("Feijao",0.320);
		Comida carne = new Comida("Carne",0.5);
		
		Pessoa p1 = new Pessoa("Ana", 72);
		Pessoa p2 = new Pessoa("Vitor", 73);
		
		
		System.out.printf("O peso anterior de %s era: %.2fKG. \n",p1.nome, p1.peso);
		System.out.printf("O peso anterior de %s era: %.2fKG. \n",p2.nome, p2.peso);
		
		p1.comer(arroz);
		p1.comer(carne);
		p1.cagar(0.100);
		
		p2.comer(feijao);
		p2.comer(carne);
		p2.comer(arroz);
		p2.cagar(0.210);
		
		System.out.println(p1.apresentar());
		System.out.println(p2.apresentar());
		
		
	}

}
