package lambdas;

@FunctionalInterface
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
	default String metodoPadrao() {
		return "Padrão";
	}
	
	static String metodoEstatico() {
		return "Estático";	
	}
}
