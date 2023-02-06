package desafios.estruturadecontroles;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean jogando = true;
		
		
		while(jogando){
			System.out.println("Você deseja sair: SIM ou NÃO ?");
			String opcao = entrada.next().toUpperCase();
			
			if("SIM".equalsIgnoreCase(opcao)) {
				jogando = false;
			}else {
				System.out.println("O jogo continua");
			}
			
		}
		entrada.close();
		
		
	}

}
