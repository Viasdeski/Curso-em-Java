package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays
				.asList("Ana", "Bia", "Carol");
		
		System.out.println("Forma tradicional...");
		for(String nome : aprovados) {
			System.out.println(nome);
			}
		
		System.out.println("\nLambda #01");
		aprovados.forEach(nome -> System.out.println("Aprovado foi: " + nome));
		
		System.out.println("\nMethod Reference #01");
		aprovados.forEach(System.out::println); //Para cada pessoa na lsita de aprovados -> Imprima
		
		System.out.println("\nLambda #02");
		aprovados.forEach(nome -> imprimir(nome));
		
		System.out.println("\nMethod Reference #01");
		aprovados.forEach(Foreach::imprimir); //Usamos o Foreach classe, pelo fato do metodo ser static
	}
	
	static void imprimir(String nome) {
		System.out.println("Oi eu sou " + nome);
	}

}
