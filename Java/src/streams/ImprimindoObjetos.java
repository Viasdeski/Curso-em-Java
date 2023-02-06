package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Ana", "Carlos", "Gui");
		
		System.out.println("FOR tradicional");
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
			
		}
		
		System.out.println("\nFOREACH");
		for(String aprovado: aprovados) {
			System.out.println(aprovado);
		}
		
		System.out.println("\nITERATOR");//INTERFACE que possui 2 métodos = TEM PROXIMO
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nSTREAM");//Não necessita o controle do laço
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}

}
