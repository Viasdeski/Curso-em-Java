package desafios.classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	

	Data(){
		//this.dia = 1;
		//this.mes = 1;
		//this.ano = 1970;
		this(1,1,1970);//Como metodo, somente valido dentro de outro construtor
		//CONSTRUTOR CHAMANDO OUTRO CONSTRUTOR
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;	
	}
	
	String formataData(){
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);	
	}
	

}
