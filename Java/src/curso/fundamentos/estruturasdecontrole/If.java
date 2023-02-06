package curso.fundamentos.estruturasdecontrole;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a média do aluno");
		double media = entrada.nextDouble();
		
//		if(media <=10 && media >=7)
//			System.out.println("Aprovado");
//			System.out.println("Parabéns"); //PARABENS É EXECUTADO, DEVEMOS POR DENTRO DE UM BLOCO DE CÓDIGO
//			
		
		
		if(media <=10 && media >=7) {
			System.out.println("Aprovado");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		if(criterioReprovacao) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
	

}
