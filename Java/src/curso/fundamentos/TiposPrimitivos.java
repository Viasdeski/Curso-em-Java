package curso.fundamentos;
/*
 * São 8:
 * --INTEIROS-----------
 * byte = 1 byte
 * short = 2 bytes
 * int = 4 bytes
 * long = 8bytes
 * ---------------------
 * -------DECIMAIS------
 * float = 4 bytes
 * double = 8 bytes
 * ---------------------
 * ----CARACTER-------
 * char
 * ---------------------
 * -------BOOLEAN-------
 * boolean
 * ---------------------
 * DEFAULT ==> int(inteiros) e double(decimais);
 * */
public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do Funcionário
		
		//INTEIROS
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56768;//DEFAULT
		long pontoAcumulados = 2900600300L;//==> DECLARAÇÃO LITERAL
		
		//DECIMAIS
		float salario = 11445.78F;//==> DECLARAÇÃO LITERAL
		double vendasAcumuladas = 35000333.08; //DEFAULT
		
		//CARACTER
		char status = 'A'; //ASPAS SIMPLES, APENAS UM CARACTER
		
		//BOOLEAN
		boolean estaDeFerias = false;
		
		
		//Dias na empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos * 2);
		
		//Pontos porb real gasto
		System.out.println(pontoAcumulados / vendasAcumuladas);
		
		//Salario
		System.out.println("o funcionário com o id: " + id + " recebe: " + salario);
		
		//Férias
		System.out.println("Está de férias: " + estaDeFerias);
		
		//Status Usuario
		System.out.println("Status usuário: " + status);
		
		
	}

}
