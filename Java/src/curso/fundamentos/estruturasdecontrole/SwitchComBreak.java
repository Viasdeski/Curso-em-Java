package curso.fundamentos.estruturasdecontrole;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		
		System.out.print("Digite a sua nota: ");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: case 9: case 8:
			conceito = "A+";
			break;
		case 7: case 6: case 5:
			conceito = "B";
			break;
		case 3: case 2: case 1:
			conceito = "C";
			break;
		case 0:
			conceito = "Z";
			break;
			
		default:
			System.out.println("Conceito inválido");
			break;
		}
		System.out.printf("Conceito é %s", conceito);
		entrada.close();
	}

}
