package desafios.fundamentos;


public class OperadoresLogicos {
	
	
	public static void main(String[] args) {
		
		//se um der = tv 32
		//se ambos = tv 50
		//se tv compra sorvete
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		
		boolean ambosTrabalhos = trabalhoTerca && trabalhoQuinta;
		boolean apenasUm = trabalhoTerca ^ trabalhoQuinta;
		//boolean nenhumTrabalhos = !(trabalhoTerca && trabalhoQuinta);
		//boolean tomaSorvete = trabalhoTerca || trabalhoQuinta;
		
		
		if(ambosTrabalhos) {
	    	//tomaSorvete = true;
			System.out.println("A TV de 50 foi comprada e tomou-se sorvete");
		}
		else if(apenasUm){
			//tomaSorvete = true;
			System.out.println("A TV de 32 foi comprada e tomou-se sorvete");
		}else {
			System.out.println("Não foi possível comprar nenhuma TV e nem toamr sorvete.");
		}
		
		

		
	}

}
