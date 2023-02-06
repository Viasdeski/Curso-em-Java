package curso.fundamentos;

import javax.swing.JOptionPane;

public class StringParaNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		String imprimiSoma = String.format("A soma é %f", soma);
		System.out.println(imprimiSoma);
		
		double media = soma / 2;
		String imprimiMedia = String.format("A media é %f", media);
		System.out.println(imprimiMedia);
		
		//%e(com notacao), %f e %g(possivelmente com notacao) para pontos flutuantes

	}

}
