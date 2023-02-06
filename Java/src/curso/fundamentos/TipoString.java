package curso.fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		//Imprimir de acordo com o indice
		System.out.println("Bom dia".charAt(0));
		
		//String é um objeto IMUTAVEL
		
		//Verificar se comeca ou termina
		
		String s = "Boa tarde";
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toLowerCase().endsWith("dia"));
		
		System.out.println(s.equals("Boa Tarde"));
		System.out.println(s.equalsIgnoreCase("BoA TarDe"));
		
		//FORMATANDO STRING
		
		var nome = "Vitor";
		var sobrenome = "Viasdeski";
		var idade = 24;
		var salario = 8513.76312;
		
		
		System.out.printf("Nome: %s %s \nIdade: %d \nSalario: R$%.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nNome: %s %s \nIdade: %d \nSalario: R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
	
	}

}
