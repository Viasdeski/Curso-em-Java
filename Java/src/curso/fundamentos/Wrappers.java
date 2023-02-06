package curso.fundamentos;


//Versao orientada a objetos para os tipos primitivos
public class Wrappers {
	
	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);	
		
		Byte b = 100;
		System.out.println("b: " + b.getClass().getSimpleName());
		
		Short s = 1000;
		System.out.println("s: " + s.getClass().getSimpleName());
		
		Integer i = 10000;
		System.out.println("i: " + i.getClass().getSimpleName());
		//Integer i = Integer.parseInt(entrada.next());
		
		Long l = 100000L;   //Preciso fazer o casting explicito
		System.out.println("l: " + l.getClass().getSimpleName());
		
		Float f = 123.456F; //Preciso fazer o casting explicito
		System.out.println("f: " + f.getClass().getSimpleName());
		
		Double d = 2131.789;
		System.out.println("d:" + d.getClass().getSimpleName());
		
		Boolean bo = Boolean.parseBoolean("true"); //converte STRING para BOOLEAN
		System.out.println("bo:" + bo.getClass().getSimpleName());//RETORNAO TIPO DA VARIAVEL
		
		Character c = '#';
		System.out.println("c: " + c.getClass().getSimpleName());
		
		System.out.println(b.byteValue()); //PEGA O VALOR de "b"
		System.out.println(s.toString()); //CONVERTE "s" PARA STRING
		System.out.println(i * 100);
		System.out.println(l / 13);
		System.out.println(bo.toString().toUpperCase());//CONVERT boolean PARA string NOVAMENTE
		System.out.println(bo.booleanValue());
		System.out.println(c.charValue()); //OUTRA FORMA PARA CONVERTER PARA STRING
		
	}

}

