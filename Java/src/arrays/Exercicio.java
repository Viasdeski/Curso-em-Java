package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunos = new double[3];
		
		notasAlunos[0] = 7.8;
		notasAlunos[1] = 8.5;
		notasAlunos[2] = 5.1;
		
		System.out.println(Arrays.toString(notasAlunos));
		
		double total = 0;
		
		for(int i = 0; i < notasAlunos.length; i++){
			total += notasAlunos[i];
		}
		
		
		double media = total / notasAlunos.length;
		
		System.out.printf("O total é: %.2f \n", total);
		System.out.printf("A média é: %.2f \n", media);
		System.out.printf("A última nota é: %.2f", notasAlunos[notasAlunos.length - 1]);
	}
	

}
