package desafios.classe.modulo;

public class Pessoa {
	
	String nome;
	double peso;
	
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso =peso;
	}
	
	
	
	void comer(Comida comida){
		if(comida != null) {
			this.peso += comida.peso;				
		}
	}
	
	void cagar(double quantidade){
		if(quantidade != 0){
			this.peso -= quantidade;
		}
	}
	
	String apresentar(){
		return "Olá eu sou o " + this.nome + " e tenho " + peso + "Kg.";  
	}
	
	
}
