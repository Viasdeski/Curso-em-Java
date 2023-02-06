package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		
		
		Jogador heroi = new Heroi();
		Jogador monstro = new Monstro();
		
		System.out.println(heroi.x);
		System.out.println(heroi.y);
		System.out.println(monstro.x);
		System.out.println(monstro.y);
		
		System.out.println("Herói tem ==>: " + heroi.vida);
		System.out.println("Monstro tem ==>: " + monstro.vida);
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Vida restante herói: " + heroi.vida);
		System.out.println("Vida restante mostro: " + monstro.vida);
	
	}

}
