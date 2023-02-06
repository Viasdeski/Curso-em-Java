package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int fatorDeAceleracao = 10;
	final int fatorDeDesaceleracao = 8;
	String nome;
	int velocidade;
	
	
	Carro(String nome, int velocidadeMaxima){
		this.nome = nome;
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public String toString() {
		return "A velocidade atual do " + this.nome + " é: " + velocidade + "Km/h"; 
	}
	
	void acelerar() {
		if(velocidade + fatorDeAceleracao < 180) {
			this.velocidade += fatorDeAceleracao;
		}else {
			this.velocidade = VELOCIDADE_MAXIMA;
		}
		
	}
	
	void desacelerar() {
		if(velocidade - fatorDeDesaceleracao > -1 && velocidade - fatorDeDesaceleracao != 0) {
			this.velocidade -= fatorDeDesaceleracao;
		}else{
			this.velocidade = 0;
		}
		
	}
	

	
}
