package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		  
		  System.out.println("Quantos alunos: ");
		  int quantidadeAlunos = entrada.nextInt();
		  
		  System.out.println("Quantas notas por aluno: ");
		  int quantidadeNotas = entrada.nextInt();
		  
		  double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];
		  double total = 0;
		  
		  for(int i = 0; i < notasDaTurma.length; i++){
			  for(int j = 0; j < notasDaTurma[i].length; j++){
				  System.out.printf("Informe a %d° nota do %d° aluno: ", j + 1, i + 1);			
				  notasDaTurma[i][j] = entrada.nextDouble();
				  total += notasDaTurma[i][j];
			  }
		  }
		  
		  double media = total / (quantidadeAlunos * quantidadeNotas);
		  System.out.printf("A média é: %.2f \n", media);
		  System.out.printf("O total é: %.2f \n", total);
		  
		  for(double[] notasDoAluno : notasDaTurma){
			  System.out.println(Arrays.toString(notasDoAluno));
		  }
		  
		  
		  entrada.close();
	}

}
