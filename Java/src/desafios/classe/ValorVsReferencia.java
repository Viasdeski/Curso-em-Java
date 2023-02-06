package desafios.classe;

public class ValorVsReferencia {
	public static void main(String[] args) {

		double a = 2;
		double b = a; //atribuicao por valor (copia do valor)
		System.out.println(a);
		System.out.println(b);

		a++;
		b--;
		System.out.println(a);
		System.out.println(b);


		Data d1 = new Data(21,12,2022);
		Data d2 = d1;//As duas variaveis apontam para o mesmo objeto em memoria

		d2.dia = 10;
		d1.mes = 07;
		//Indiferente se eu manipular d1, ou d2, em tese ambos são o mesmo objeto.

		System.out.println(d1.formataData());
		System.out.println(d2.formataData());

		dataPadrao(d1);
		dataPadrao(d2);

		System.out.println(d1.formataData());
		System.out.println(d2.formataData());

		int c = 5;
		alteraPrimitivo(c);//O que é passado para o método é uma cópia e não uma referência
		System.out.println(c);//Locais na memória não são os mesmo, diferente do que ocorre com referencia.

	}

	static void dataPadrao(Data data) {
		data.dia = 1;
		data.mes = 1;
		data.ano = 1970; 	
	}

	static void alteraPrimitivo(int inteiro) {
		inteiro++;
	}

}
