package collections;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<User> usuarios = new HashSet<>();
		
		usuarios.add(new User("Ana"));
		usuarios.add(new User("Paulo"));
		usuarios.add(new User("Bruna"));
		
		boolean resultado = usuarios.contains(new User("Ana")); //Retorna TRUE devido ao hashcode
		System.out.println(resultado);
	}

}
