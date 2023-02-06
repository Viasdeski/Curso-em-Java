package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.14;
	
	
	AreaCirc(double raio){
		this.raio = raio;
	}
	
	
	double calculaAreaCirc(){
		return PI * Math.pow(raio, 2);
	}
	
	static double calculaAreaCirc(double raio){
		return PI * Math.pow(raio, 2);
	}

}