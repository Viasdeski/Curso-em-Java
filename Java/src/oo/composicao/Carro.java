package oo.composicao;

public class Carro {
	
	final Motor motor;
	
	Carro(){
		this.motor = new Motor();
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void acelera() {
		motor.injecao += 0.4;
	}
	
	void desacelera() {
		motor.injecao += 0.4;
	}
	
	boolean funcionando() {
		return motor.ligado;
	}
	
}
