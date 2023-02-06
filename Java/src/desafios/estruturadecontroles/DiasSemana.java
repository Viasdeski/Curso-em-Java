package desafios.estruturadecontroles;

import java.util.Scanner;

public class DiasSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next().toUpperCase();
	
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(dia + " � o primeiro dia da semana");
		}else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println(dia + " � o segundo dia da semana");
		}else if("ter�a".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia) ) {
			System.out.println(dia + " � o terceiro dia da semana");
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println(dia + " � o quarto dia da semana");
		}else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println(dia + " � o quinto dia da semana");
		}else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println(dia + " � o sexto dia da semana");
		}else if("sabado".equalsIgnoreCase(dia) || "s�bado".equalsIgnoreCase(dia)) {
			System.out.println(dia + "� o s�timo dia da semana");
		}else {
			System.out.println("Valor inv�lido");
		}
		
		entrada.close();
	}

}
