package curso.fundamentos;

public class ConversaoPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a  = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1234.56789; //explicita (CAST)
		System.out.println(b);
		
		int c  = 340;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f  = (int) e; //havera perda == explicita (CAST)
		System.out.println(f);
		
	}

}
