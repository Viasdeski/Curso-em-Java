package lambdas;

@FunctionalInterface
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
	default String metodoPadrao() {
		return "Padr�o";
	}
	
	static String metodoEstatico() {
		return "Est�tico";	
	}
}
