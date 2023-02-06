package desafios.estruturadecontroles;

import java.util.Scanner;

public class DiasSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next().toUpperCase();
	
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(dia + " é o primeiro dia da semana");
		}else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println(dia + " é o segundo dia da semana");
		}else if("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia) ) {
			System.out.println(dia + " é o terceiro dia da semana");
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println(dia + " é o quarto dia da semana");
		}else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println(dia + " é o quinto dia da semana");
		}else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println(dia + " é o sexto dia da semana");
		}else if("sabado".equalsIgnoreCase(dia) || "sábado".equalsIgnoreCase(dia)) {
			System.out.println(dia + "é o sétimo dia da semana");
		}else {
			System.out.println("Valor inválido");
		}
		
		entrada.close();
	}

}
