package curso.fundamentos.estruturasdecontrole;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String text = "";
		
		
		do{
			System.out.println("Você deseja sair?	");
			text = entrada.next().toUpperCase();
		}while(!text.equalsIgnoreCase("simsim"));
		System.out.println("SAINDO...");
		
		
		entrada.close();
	}

}
