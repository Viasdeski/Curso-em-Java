package desafios.fundamentos;

import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em Fahrenheit: ");
		double temperaturaFahrenheit = scan.nextDouble();
		
		final double FATOR =  5D/9D; //REALIZEI UM CASTING
		final int SUBTRATOR = 32;
		
		double temperaturaCelsius = (temperaturaFahrenheit - SUBTRATOR) * FATOR;
		
		
		System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);
	

	}

}
