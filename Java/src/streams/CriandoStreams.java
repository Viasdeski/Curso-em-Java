package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Python ", "C++ ", "JavaScript\n");
		langs.forEach(print);
		
		String[] maisLangs = {"GO ", "Perl ", "Lua ", "Elixir\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print);// 1 - inicio, 2 - final não incluso (indices)
		
		List<String> outrasLangs = Arrays.asList("PHP ", "FLutter ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);; //Em paralelo, varia a oredem
		
		//GERANDO STRING DE FORMA INFINITA
		//Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n +1).forEach(println);
		
		
	}

}
