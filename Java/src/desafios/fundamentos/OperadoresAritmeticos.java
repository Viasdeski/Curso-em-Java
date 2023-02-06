package desafios.fundamentos;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		
		int a = (int) Math.pow((6 * (3 + 2)), 2) / 6;
		int b = (int) Math.pow(((1-5) * (2-7)) / 2, 2);
		
		int resultado = (int) ((int)Math.pow((a - b), 3) / (int)Math.pow(10, 3));
		
		String imprimiResultado = String.format("O resultado do desafio é: %d", resultado);
		System.out.println(imprimiResultado);
		
	}

}
