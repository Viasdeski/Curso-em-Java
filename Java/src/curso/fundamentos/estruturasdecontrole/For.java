package curso.fundamentos.estruturasdecontrole;

public class For {
	public static void main(String[] args) {
		
		for(int contador = 0; contador <=20; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		
		int x = 2;
		for(;x <= 10;) {
			System.out.printf("X = %d ", x);
			x++;
		}
	}

}	
