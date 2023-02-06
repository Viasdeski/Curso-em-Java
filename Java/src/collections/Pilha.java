package collections;

import java.util.ArrayDeque;
import java.util.Deque;

class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<>();
		
		pilha.add("Livro 1");
		pilha.push("Livro 2"); //Lanca uma exceção
		pilha.push("Livro 3");
		pilha.push("Livro 4");
		pilha.push("Livro 5");
		
		System.out.println(pilha);
		
		System.out.println(pilha.peek());
		System.out.println(pilha.element());
		
		System.out.println(pilha.pop());
		System.out.println(pilha.poll());
		System.out.println(pilha.remove());
		
		System.out.println(pilha);
		
		
		
	}
}
 