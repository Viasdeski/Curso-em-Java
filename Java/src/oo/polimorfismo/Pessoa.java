package oo.polimorfismo;

public class Pessoa {
	private double peso;
	
	public Pessoa(double peso){
		setPeso(peso);
	}

	
	public void comer(Alimentos alimento) {
		this.peso += alimento.getPeso();
	}
	
//	//SOBRECARGA
//	public void comerFeijao(Feijao feijao) {
//		this.peso += feijao.getPeso();
//	}
//	
//	//SOBRECARGA
//	public void tomarSorvete(Sorvete sorvete) {
//		this.peso += sorvete.getPeso();
//	}
	
	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
	

}
