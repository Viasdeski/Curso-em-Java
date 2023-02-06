package desafios.estruturadecontroles;

import java.util.Scanner;

public class MediaComWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double totalNotas = 0;
		int numeroDeAlunos = 0;
		boolean notaValida = (nota <= 10 && nota >= 0);
		boolean validando = true;
		String continuar = "";
		
		while(validando) {
			System.out.println("Você deseja inserir uma nota?");
			continuar = entrada.next().toUpperCase();
			if("SIM".equals(continuar)){
				System.out.println("Digite a nota do aluno");
				nota = entrada.nextDouble();
				if(notaValida){
					numeroDeAlunos++;
					totalNotas+=nota;
				}else{
					System.out.println("Nota inválida.");
			}
		  }else{
			  validando = false;
			  System.out.println("Saindo...");
		  }
	   }
		
		double media = totalNotas / numeroDeAlunos;
		System.out.print("A média da turma é: " + media);
		entrada.close();
	}
}
