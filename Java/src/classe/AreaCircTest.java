package classe;

public class AreaCircTest {
	
	public static void main(String[] args) {
		
		//� poss�vel alterar PI e RAIO pois s�o valores de instancias e N�O da CLASSE
		AreaCirc area1 = new AreaCirc(10);
		//area1.pi = 0; // VALOR � ASSUMIDO PARA TODA A CLASSE
		
		
		AreaCirc area2 = new AreaCirc(5);
		//area2.pi = 2; // VALOR � ASSUMIDO PARA TODA A CLASSE
		
		
		//AreaCirc.pi = 3.1415; APLICAMOS O FINAL VISTO O PI SER CONSTANTE E NAO QUEREMOS QUE POSSA SER ALTERADO SEU VALOR 
		
		System.out.printf("A �rea da circunfer�ncia �: %.2f cm�\n", area1.calculaAreaCirc());//TIVE QUE INSTANCIAR VISTO O METODO NAO SER DA CLASSE
		System.out.printf("A �rea da circunfer�ncia �: %.2f cm�\n", area2.calculaAreaCirc());
		System.out.printf("A �rea da circunfer�ncia �: %.2f cm�", AreaCirc.calculaAreaCirc(100));
		
	}

}
