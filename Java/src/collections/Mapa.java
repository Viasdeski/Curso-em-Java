package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mapa = new HashMap<>();
		
		//PUT, adiciona e substitui.
		mapa.put(1, "Roberto");
		System.out.println(mapa);
		mapa.put(1, "Ana");
		mapa.put(2, "Carlos");
		mapa.put(3, "Daniel");
		mapa.put(4, "Vasco");
		System.out.println(mapa);
		
		
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		System.out.println(mapa.entrySet());
		
		for(int chave : mapa.keySet()) {
			System.out.println(chave);
		}

	}

}
