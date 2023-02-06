package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Filha {
	
	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<>();
		
		//OFFER e ADD adicionam elementos a fila
		//OFFER quando a fila estiver cheia retorna NULL
		//Já o ADD retorna uma exceção
		fila.offer("Ana");
		fila.add("Bruna");
		fila.offer("Carlos");
		fila.add("Daniela");
		fila.offer("Elena");
		fila.add("Isa");
		
		System.out.println(fila);
		
		//PEEK e ELEMENT retornar o primeiro elemento
		//PEEk retorna NULL quando a fila estiver vazia
		//Enquanto ELEMENT lança uma exceção
		System.out.println(fila.peek()); 
		System.out.println(fila.element());
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		
		//POLL e REMOVE retornam o primeiro elemento a sair da fila e remove
		//POLL retorna NULL quando a fila estiver vazia
		//REMOVE lanca uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
	}

}
