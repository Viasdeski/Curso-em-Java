package curso.fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*O nextInt(), nextDouble() leem apenas números, logo quando utilizamos a classe Scanner, ao pressionarmos ENTER
		 * é colcoado no buffer(fila de comandos de entrada) o \n, isso ocasionara o erro: "Digite o seu nome: Digite o seu sobrenome:"
		 * visto o nextLine() parar de ser executado após encontrar um "\n", sendo que dessa forma ele encontra de primeira, visto o nextInt()
		 * pular.
		 * 
		 * Para corrigirmos esse problema, podemos setar um nextLine() após o uso do nextInt();
		*/
		System.out.print("Digite seu ID: ");
		int ID = entrada.nextInt();
		entrada.nextLine(); //CORRIGI O ERRO DE IMPRESSAO NO CONSOLE
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite o seu salario: ");
		double salario = entrada.nextDouble();
		
				
		String frase = String.format("O [%d]%s %s possui %d anos. Recebendo R$%.2f", ID, nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		entrada.close();
	}

}
