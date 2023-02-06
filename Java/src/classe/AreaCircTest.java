package classe;

public class AreaCircTest {
	
	public static void main(String[] args) {
		
		//É possível alterar PI e RAIO pois são valores de instancias e NÃO da CLASSE
		AreaCirc area1 = new AreaCirc(10);
		//area1.pi = 0; // VALOR É ASSUMIDO PARA TODA A CLASSE
		
		
		AreaCirc area2 = new AreaCirc(5);
		//area2.pi = 2; // VALOR É ASSUMIDO PARA TODA A CLASSE
		
		
		//AreaCirc.pi = 3.1415; APLICAMOS O FINAL VISTO O PI SER CONSTANTE E NAO QUEREMOS QUE POSSA SER ALTERADO SEU VALOR 
		
		System.out.printf("A área da circunferência é: %.2f cm²\n", area1.calculaAreaCirc());//TIVE QUE INSTANCIAR VISTO O METODO NAO SER DA CLASSE
		System.out.printf("A área da circunferência é: %.2f cm²\n", area2.calculaAreaCirc());
		System.out.printf("A área da circunferência é: %.2f cm²", AreaCirc.calculaAreaCirc(100));
		
	}

}
