package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 9.9);
		Aluno a2 = new Aluno("Gil", 7.9);
		Aluno a3 = new Aluno("Bia", 6.9);
		Aluno a4 = new Aluno("Zac", 8.9);
		Aluno a5 = new Aluno("Isa", 5.9);
		Aluno a6 = new Aluno("Gui", 3.9);
		
		Consumer<String> println = System.out::println;
		
		List<Aluno> aluno = Arrays.asList(a1, a2, a3, a4, a5, a6);
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> noticia = a -> String.format("Parabéns %s, você foi aprovado(a)", a.nome);
		
		
		aluno.stream()
			 .filter(aprovado)
			 .map(noticia)
			 .forEach(println);
			 
		
	}

}
