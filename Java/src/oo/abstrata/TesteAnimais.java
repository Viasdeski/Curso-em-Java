package oo.abstrata;

public class TesteAnimais {
	
	public static void main(String[] args) {
		
		Animal dog = new Cachorro();
		dog.mover();
		
		Mamifero dog2 = new Cachorro();
		System.out.println(dog2.mover());
		System.out.println(dog2.mamar());
			
		
	

	}
}
