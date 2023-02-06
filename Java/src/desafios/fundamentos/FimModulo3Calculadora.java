package desafios.fundamentos;

import java.util.Scanner;

public class FimModulo3Calculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite qual a operação deseja realizar: ");
		String operacao = entrada.next() ;
		
		System.out.println("Digite o primeiro número:");
		double valor1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número:");
		double valor2 = entrada.nextDouble();
		
		
		double resultado = "+".equals(operacao) ? valor1 + valor2 : 0;
		resultado = "-".equals(operacao) ? valor1 - valor2 : resultado;
		resultado = "*".equals(operacao) ? valor1 * valor2 : resultado;
		resultado = "/".equals(operacao) ? valor1 / valor2 : resultado;
		resultado = "%".equals(operacao) ? valor1 % valor2 : resultado;
		
		String imprimiResultado = String.format("%.2f %s %.2f = %.2f", valor1, operacao, valor2, resultado);
		System.out.println(imprimiResultado.replace(",", "."));
		
		
//		System.out.println(operacao.equals("+") ? ("O resultado da soma é: " + (valor1 + valor2)) : "");
//		System.out.println(operacao.equals("-") ? ("O resultado da subtração é: " + (valor1 - valor2)) : "");
//		System.out.println(operacao.equals("*") ? ("O resultado da multiplicação é: " + (valor1 * valor2)) : "");
//		System.out.println(operacao.equals("/") ? ("O resultado da divisão é: " + (valor1 / valor2)) : "");
//		System.out.println(operacao.equals("%") ? ("O resto da conta é: " + (valor1 % valor2)) : "");
		
		entrada.close();
	}

}
