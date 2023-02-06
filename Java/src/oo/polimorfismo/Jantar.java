package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(90);
		Arroz arroz = new Arroz(0.950);
		Feijao feijao = new Feijao(0.500);
		Sorvete sorvete = new Sorvete(1.250);
		//Comida comida = new Comida(1); //CLASSE COMIDA NÃO PODE SER INSTANCIADA, VISTO SER ABSTRACT
		
		convidado.comer(arroz);
		convidado.comer(feijao);
		convidado.comer(sorvete);
		
		System.out.println(feijao.getPeso());
		
		System.out.println(convidado.getPeso());
	}

}
