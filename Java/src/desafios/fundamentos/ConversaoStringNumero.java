package desafios.fundamentos;

import java.util.Scanner;

//Se faz necessario o REPALCE devido a variavel LOCALE de convers�o de acordo com a regi�o do setadaano computador.

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do sal�rio: ");
		String salario1 = entrada.nextLine().replace(",",".");
		
		System.out.print("Digite o valor do sal�rio: ");
		String salario2 = entrada.nextLine().replace(",",".");
		
		System.out.print("Digite o valor do sal�rio: ");
		String salario3 = entrada.nextLine().replace(",",".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		
		double mediaSalarial = (valor1 + valor2 + valor3) / 3 ;
		
		String resultado = String.format("A m�dia salarial � de: %.2f", mediaSalarial);
		System.out.println(resultado);
		
		entrada.close();

	}

}
