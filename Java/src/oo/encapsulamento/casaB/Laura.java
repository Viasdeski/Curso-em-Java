package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Paula;

public class Laura extends Paula {
	
	void testeAcessos() {
		//System.out.println(paula.segredo);
		//System.out.println(paula.facoDentroCasa);
		//System.out.println(paula.formaDeFalar); -- PARA ACESSAR N�O UTILIZO DA PESSOA HERDADA, MAS SIM DA PR�PRIA CLASSE HEREDEIRA
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		
	}
	

}
