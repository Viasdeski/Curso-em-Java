package desafios.classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.dia = 01;
		data1.mes = 01;
		data1.ano = 1998;
		
		
		Data data2 = new Data();
		data2.dia = 28;
		data2.mes = 02;
		data2.ano = 2002;
		
		Data data3 = new Data(16,07,1998);
		
		
		Data data4 = new Data();
		
		System.out.printf("A data 1 é: %s\n", data1.formataData());
		System.out.printf("A data 2 é: %s\n", data2.formataData());
		System.out.printf("A data 3 é: %s\n", data3.formataData());
		System.out.printf("A data 4 é: %s", data4.formataData());
		
		
	}

}
