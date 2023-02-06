package curso.fundamentos.estruturasdecontrole;


public class BreakRotulado {
	public static void main(String[] args) {

		externo: for (int i = 0; i < 9; i++) {
			for(int j = 0; i < 3; i++) {
				if(i == 6) {
					break externo;
				}
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();

		}

		System.out.println("FIM");

	}

}
