package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.ligar();
		
		System.out.println(carro.motor.giros());
		carro.acelera();
		System.out.println(carro.motor.giros());
		carro.desacelera();
		System.out.println(carro.motor.giros());
		
		
		
	}

}
