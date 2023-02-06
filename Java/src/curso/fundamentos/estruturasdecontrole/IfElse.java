package curso.fundamentos.estruturasdecontrole;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite o número");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("É par");
		}
		else{ 
			System.out.println("É ímpar");
		}
		
	
	
	
	
	}

}
