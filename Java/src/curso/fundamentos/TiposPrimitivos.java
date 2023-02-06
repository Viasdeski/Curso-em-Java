package curso.fundamentos;
/*
 * S�o 8:
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
		//Informa��es do Funcion�rio
		
		//INTEIROS
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56768;//DEFAULT
		long pontoAcumulados = 2900600300L;//==> DECLARA��O LITERAL
		
		//DECIMAIS
		float salario = 11445.78F;//==> DECLARA��O LITERAL
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
		System.out.println("o funcion�rio com o id: " + id + " recebe: " + salario);
		
		//F�rias
		System.out.println("Est� de f�rias: " + estaDeFerias);
		
		//Status Usuario
		System.out.println("Status usu�rio: " + status);
		
		
	}

}
