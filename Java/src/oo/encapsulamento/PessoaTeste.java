package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1= new Pessoa(13);
		
		System.out.println(p1.getIdade());
		
		p1.setIdade(31);
		System.out.println(p1.getIdade());
		
		
	}

}
