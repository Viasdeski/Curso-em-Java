package collections;


//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); //<> declara o tipo dos dados aceitos no SET
		SortedSet<String> listaAprovados = new TreeSet<>(); //Tree = Garante a ordem alfabetica
		
		listaAprovados.add("Ana");
		listaAprovados.add("Pedro");
		listaAprovados.add("Henrique");
		listaAprovados.add("Daniel");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
	}

}
