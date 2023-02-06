package curso.fundamentos.estruturasdecontrole;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota apra obter seu conceito: ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 ||nota < 0) {
			System.out.println("Valor inválido");
		}else if(nota >= 9.1) {
			System.out.println("Conceito A");
		}else if(nota >= 6.1) {
			System.out.println("Conceito B");
		}else if(nota >= 3.1) {
			System.out.println("Conceito C");
		}else {
			System.out.println("Conceito D");
		}
		
		entrada.close();
	}

}

