package desafios.estruturadecontroles;

import java.util.Scanner;

public class DesafiosFnal {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*
		----------DESAFIO 1 ---------------------------------------
		System.out.println("Digite um n�mero");
		int numero = entrada.nextInt();
		if(numero <= 10 && numero >=0) {
			System.out.println("O n�mero esta no intervalo de 0 a 10");
			if(numero % 2 == 0) {
				System.out.println("E � par");
			}else{
				System.out.println("E � �mpar");
			}
		}else {
			System.out.println("N�o est� no intervalo");
		}
		*/
		
		/*
		 
		-------------DESAFIO 2 ----------------------------------------
		System.out.println("Digite o ano para saber se ele � bissexto");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("� bissexto");
		}else {
			System.out.println("N�o � bissexto");
		}
       */
		
		/*
		---------------DESAFIO 7 -----------------------------
		double soma = 0;
		boolean digitando = true;
		
		while(digitando) {
			System.out.println("Digite um n�mero: ");
			double numero = entrada.nextDouble();
			
			if(numero >= 0){
				soma = soma + numero;
			}else {
				System.out.println("n�mero negativo digitado");
				digitando = false;
			}
			System.out.printf("A soma dos n�meros positivos �: %g \n", soma);
		}
		*/
		
		/*
		//-------------------DESAFIO 9--------------------------
		System.out.println("Digite uma palavra");
		String palavra = entrada.nextLine();
		
		char letras[] = palavra.toCharArray(); //CONVERTO CHAR PARA ARRAY PARA PODER ACESSAR O INDEX;
		
		for(int i = 0; i < letras.length; i++) 
			System.out.println(letras[i]);
			System.out.println(letras);
		*/
		
		entrada.close();
	}
}
