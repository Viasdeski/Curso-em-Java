package classe;

public class Equals {
	public static void main(String[] args) {
		
		UserEquals u1 = new UserEquals();
		u1.nome = "Pedro";
		u1.email = "pedro@";
		
		UserEquals u2 = new UserEquals();
		u2.nome = "Pedro";
		u2.email = "pedro@";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2)); //APOS IMPLEMENTAR O EQUALS, ESSA EXPRESSAO IRA SER "TRUE"
		System.out.println(u1.nome.equals(u2.nome));
	}

}
