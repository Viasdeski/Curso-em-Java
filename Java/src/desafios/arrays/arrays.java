package desafios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas que serão digitas: ");
		int quantidadeNotas = entrada.nextInt();
		double[] notas = new double[quantidadeNotas];
		double total = 0;
		
		
		for(int i = 0; i < quantidadeNotas ; i++) {
			System.out.printf("Digite a %d° nota: ", i + 1);
			double nota = entrada.nextDouble();
			notas[i] = nota;
		}
		
		for(double nota : notas) {
			total+=nota;
		}
		
		double media = total  / notas.length;
		
		System.out.printf("A soma das notas é: %.2f \n", total);
		System.out.printf("A média das notas é: %.2f \n", media);
		System.out.println(Arrays.toString(notas));
		
		
		entrada.close();
	}

}
