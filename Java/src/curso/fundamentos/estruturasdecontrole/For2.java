package curso.fundamentos.estruturasdecontrole;

public class For2 {
	public static void main(String[] args) {
		
//		for(int numero = 10;numero >= 0 ;numero -= 1){
//			System.out.println(numero);}
//		
		for(int i = 0;i <= 10;i++) {
			for(int j = 10; j >=0; j-= 1) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}

}
