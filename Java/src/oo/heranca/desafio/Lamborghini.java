package oo.heranca.desafio;

public class Lamborghini extends Carro implements Esportivo{
	
	Lamborghini(String nome) {
		super(nome, 400);
	}

	@Override
	void acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}
	
	@Override
	public void ligarTurbo() {
		super.fatorDeAceleracao += 15;
	}
	
	@Override
	public void desligarTurbo() {
		super.fatorDeAceleracao = 10;
	}

}
