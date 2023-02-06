package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();
		
		conjunto.add("A");
		conjunto.add(1.2); //double --> Double
		conjunto.add(3);
		conjunto.add(true);
		
		System.out.println("Tamanho: " + conjunto.size());
		System.out.println(conjunto);
		
		conjunto.remove("A");
		
		System.out.println("Tamanho: " + conjunto.size());
		System.out.println(conjunto);
		
		
		@SuppressWarnings("rawtypes")
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums);
		
		
		System.out.println(conjunto);
		
		
		//USAMOS O CONTAINS PARA SABER SE CERTO ELEMENTO ESTA CONTIDO NO CONJUNTO
	}

}
