package collections;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<User> listUsers = new ArrayList<>();
		
		User u1 = new User("Ana");
		
		listUsers.add(u1);
		listUsers.add(new User("Carlos"));
		listUsers.add(new User("Bruna"));
		listUsers.add(new User("Gustavo"));
		listUsers.add(new User("Julia"));
		
		System.out.printf("O usuário com o indice %d é: %s \n",listUsers.indexOf(u1), listUsers.get(listUsers.indexOf(u1)).nome);
		
		for(User usuario : listUsers) {
			System.out.println(usuario.toString());
		}
		
	}

}
