package oo.heranca.desafio;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro fusca = new Fusca("FUSCAO");
		Lamborghini lamborghini = new Lamborghini("LAMBO");
		
		System.out.println(fusca.velocidade);
		System.out.println(lamborghini.velocidade);
		
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		
		lamborghini.acelerar();
		
		lamborghini.ligarTurbo();
		
		lamborghini.acelerar();
		
		lamborghini.desligarTurbo();
		
		lamborghini.acelerar();
		
		
		System.out.println(fusca);
		System.out.println(lamborghini);
		
		
	}

}
