package jogo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jogo.SuperHeroi;
import jogo.Vilao;

class Teste {

	static SuperPoder poder1;
	static SuperPoder poder2;
	static SuperPoder poder3;
	static SuperPoder poder4;
	static SuperPoder poder5;
	static SuperPoder poder6;
	static SuperPoder poder7;
	static SuperPoder poder8;
	static SuperPoder poder9;
	static SuperPoder poder10;
	static SuperPoder poder11;
	static SuperPoder poder12;
	static SuperPoder poder13;
	static SuperPoder poder14;
	static SuperPoder poder15;
	static SuperPoder poder16;
	static SuperPoder poder17;
	static SuperPoder poder18;
	static SuperPoder poder19;
	static SuperPoder poder20;
	static SuperPoder poder21;
	static SuperPoder poder22;
	static SuperPoder poder23;

	static SuperHeroi heroi1;
	static SuperHeroi heroi2;
	static SuperHeroi heroi3;
	static SuperHeroi heroi4;
	static SuperHeroi heroi5;
	static SuperHeroi heroi6;

	static Vilao vilao1;
	static Vilao vilao2;
	static Vilao vilao3;
	static Vilao vilao4;

	@Test
	void testA() {
		// Classe Superpoder

		poder1 = new SuperPoder("soltar teia", 3);
		poder2 = new SuperPoder("andar em paredes", 2);
		poder3 = new SuperPoder("sentido apurado", 1);
		poder4 = new SuperPoder("voar", 3);
		poder5 = new SuperPoder("força", 5);
		poder6 = new SuperPoder("visão de raio x", 4);
		poder7 = new SuperPoder("sopro congelante", 4);
		poder8 = new SuperPoder("supersoldado", 3);
		poder9 = new SuperPoder("escudo", 3);
		poder10 = new SuperPoder("velocidade", 5);
		poder11 = new SuperPoder("armadura", 4);
		poder12 = new SuperPoder("dispositivos eletrônicos", 2);
		poder13 = new SuperPoder("velocidade", 3);
		poder14 = new SuperPoder("forca", 3);
		poder15 = new SuperPoder("braceletes", 1);

		poder16 = new SuperPoder("força", 5);
		poder17 = new SuperPoder("mente aguçada", 5);
		poder18 = new SuperPoder("voar", 3);
		poder19 = new SuperPoder("força", 5);
		poder20 = new SuperPoder("visão de raio x", 4);
		poder21 = new SuperPoder("sopro congelante", 4);
		poder22 = new SuperPoder("tentáculos indestrutíveis", 5);
		poder23 = new SuperPoder("velocidade", 1);

		assertEquals(poder1.getNome(), "soltar teia");
		assertEquals(poder1.getCategoria(), 3);

		assertEquals(poder2.getNome(), "andar em paredes");
		assertEquals(poder2.getCategoria(), 2);

		assertEquals(poder3.getNome(), "sentido apurado");
		assertEquals(poder3.getCategoria(), 1);
	}

	@Test
	void testB() {
		// Classe Personagem
		Personagem personagem1 = new Personagem("Octopus", "Otto Octavius");

		personagem1.adicionarSuperPoder(poder1);
		personagem1.adicionarSuperPoder(poder5);

		assertEquals(personagem1.getPoderTotal(), 8);

		Personagem personagem2 = new Personagem("Octopus", "Otto Octavius");

		personagem2.adicionarSuperPoder(poder5);
		personagem2.adicionarSuperPoder(poder10);
		personagem2.adicionarSuperPoder(poder20);

		assertEquals(personagem2.getPoderTotal(), 14);
	}

	@Test
	void testC() {
		// Classe Vilao
		vilao1 = new Vilao("Duende-Verde", "Norman Osbourne", 3);
		vilao1.adicionarSuperPoder(poder16);
		assertEquals(vilao1.getPoderTotal(), 5);

		vilao2 = new Vilao("Lex Luthor", "Lex Luthor", 2);
		vilao2.adicionarSuperPoder(poder17);
		assertEquals(vilao2.getPoderTotal(), 5);

		vilao3 = new Vilao("Bizarro", "Bizarro", 1);
		vilao3.adicionarSuperPoder(poder18);
		vilao3.adicionarSuperPoder(poder19);
		vilao3.adicionarSuperPoder(poder20);
		vilao3.adicionarSuperPoder(poder21);
		assertEquals(vilao3.getPoderTotal(), 16);

		vilao4 = new Vilao("Octopus", "Otto Octavius", 5);
		vilao4.adicionarSuperPoder(poder22);
		vilao4.adicionarSuperPoder(poder23);
		assertEquals(vilao4.getPoderTotal(), 6);
	}

	@Test
	void testD() {
		// Classe SuperHeroi
		heroi1 = new SuperHeroi("Homem-Aranha", "Peter Park");
		heroi1.adicionarSuperPoder(poder1);
		heroi1.adicionarSuperPoder(poder2);
		heroi1.adicionarSuperPoder(poder3);
		assertEquals(heroi1.getPoderTotal(), 6.6, 0.01);

		heroi2 = new SuperHeroi("Super-Homem", "Crark Kent");
		heroi2.adicionarSuperPoder(poder4);
		heroi2.adicionarSuperPoder(poder5);
		heroi2.adicionarSuperPoder(poder6);
		heroi2.adicionarSuperPoder(poder7);
		assertEquals(heroi2.getPoderTotal(), 17.6, 0.01);

		heroi3 = new SuperHeroi("Capitão América", "Steven Rogers");
		heroi3.adicionarSuperPoder(poder8);
		heroi3.adicionarSuperPoder(poder9);
		assertEquals(heroi3.getPoderTotal(), 6.6, 0.01);

		heroi4 = new SuperHeroi("Flash", "Barry Allen");
		heroi4.adicionarSuperPoder(poder10);
		assertEquals(heroi4.getPoderTotal(), 5.5, 0.01);

		heroi5 = new SuperHeroi("Homem de Ferro", "Tony Stark");
		heroi5.adicionarSuperPoder(poder11);
		heroi5.adicionarSuperPoder(poder12);
		assertEquals(heroi5.getPoderTotal(), 6.6, 0.01);

		heroi6 = new SuperHeroi("Mulher-Maravilha", "Diana");
		heroi6.adicionarSuperPoder(poder13);
		heroi6.adicionarSuperPoder(poder14);
		heroi6.adicionarSuperPoder(poder15);
		assertEquals(heroi6.getPoderTotal(), 7.7, 0.01);
	}

	@Test
	void testE() {
		// Classe Confronto
		Confronto confronto = new Confronto();
		assertEquals(confronto.lutar(heroi1, vilao1), 1);
		assertEquals(confronto.lutar(heroi1, vilao2), 1);
		assertEquals(confronto.lutar(heroi1, vilao3), 2);
		assertEquals(confronto.lutar(heroi1, vilao4), 1);

		assertEquals(confronto.lutar(heroi2, vilao1), 1);
		assertEquals(confronto.lutar(heroi2, vilao2), 1);
		assertEquals(confronto.lutar(heroi2, vilao3), 1);
		assertEquals(confronto.lutar(heroi2, vilao4), 1);

		assertEquals(confronto.lutar(heroi3, vilao1), 1);
		assertEquals(confronto.lutar(heroi3, vilao2), 1);
		assertEquals(confronto.lutar(heroi3, vilao3), 2);
		assertEquals(confronto.lutar(heroi3, vilao4), 1);

		assertEquals(confronto.lutar(heroi4, vilao1), 1);
		assertEquals(confronto.lutar(heroi4, vilao2), 1);
		assertEquals(confronto.lutar(heroi4, vilao3), 2);
		assertEquals(confronto.lutar(heroi4, vilao4), 2);

		assertEquals(confronto.lutar(heroi5, vilao1), 1);
		assertEquals(confronto.lutar(heroi5, vilao2), 1);
		assertEquals(confronto.lutar(heroi5, vilao3), 2);
		assertEquals(confronto.lutar(heroi5, vilao4), 1);

		assertEquals(confronto.lutar(heroi6, vilao1), 1);
		assertEquals(confronto.lutar(heroi6, vilao2), 1);
		assertEquals(confronto.lutar(heroi6, vilao3), 2);
		assertEquals(confronto.lutar(heroi6, vilao4), 1);
		
		// Verifica empate
		SuperHeroi heroi = new SuperHeroi("Flash", "Barry Allen");
		heroi.adicionarSuperPoder(poder3);
		heroi.adicionarSuperPoder(poder5);
		heroi.adicionarSuperPoder(poder6);
		
		Vilao vilao = new Vilao("Bizarro", "Bizarro", 1);
		vilao.adicionarSuperPoder(poder2);
		vilao.adicionarSuperPoder(poder5);
		vilao.adicionarSuperPoder(poder6);
		assertEquals(confronto.lutar(heroi, vilao), 0);
	}
}
