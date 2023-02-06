package desafios.estruturadecontroles;

import java.util.Scanner;

public class DesafiosFnal {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*
		----------DESAFIO 1 ---------------------------------------
		System.out.println("Digite um número");
		int numero = entrada.nextInt();
		if(numero <= 10 && numero >=0) {
			System.out.println("O número esta no intervalo de 0 a 10");
			if(numero % 2 == 0) {
				System.out.println("E é par");
			}else{
				System.out.println("E é ímpar");
			}
		}else {
			System.out.println("Não está no intervalo");
		}
		*/
		
		/*
		 
		-------------DESAFIO 2 ----------------------------------------
		System.out.println("Digite o ano para saber se ele é bissexto");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("É bissexto");
		}else {
			System.out.println("Não é bissexto");
		}
       */
		
		/*
		---------------DESAFIO 7 -----------------------------
		double soma = 0;
		boolean digitando = true;
		
		while(digitando) {
			System.out.println("Digite um número: ");
			double numero = entrada.nextDouble();
			
			if(numero >= 0){
				soma = soma + numero;
			}else {
				System.out.println("número negativo digitado");
				digitando = false;
			}
			System.out.printf("A soma dos números positivos é: %g \n", soma);
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
