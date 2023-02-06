package curso.fundamentos;

//INVOCA UM MÉTODO

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
			String s = "Bom dia X";
			s = s.replace("X", "Senhor(a)");
			s = s.toUpperCase();
			s = s.concat("!!!");
			
			System.out.println(s);
			
			String x = "Vitor".toUpperCase();
			System.out.println(x);
			
			String y = "Bom dia X".replace("X","Senhor(a)")
					.toUpperCase()
					.concat("!!!");
			System.out.println(y);
			
			//-----------------TIPOS PRIMITIVOS NAO POSSUEM NOTACAO PONTO
			
			
	}

}
