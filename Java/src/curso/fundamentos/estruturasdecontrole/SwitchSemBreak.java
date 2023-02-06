package curso.fundamentos.estruturasdecontrole;

import java.util.Scanner;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		//USADO PARA CRIAR UM RANK;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite  sua faixa: ");
		String faixa = entrada.next();
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("A faixa é preta");
	
		case "marron":
			System.out.println("A faixa é marron");
			
		case "vermelha":
			System.out.println("A faixa é vermelha");
			
		case "branca":
			System.out.println("A faixa é branca");
			
		default:
			System.out.println("Não possui nenhuma faixa");;
		}
		
		entrada.close();
		
		
		
	}

}
