package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

	Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
	}
	
	
	@Test
	void testEntreeVide() {
		assertEquals(0, game.score());
	}
	
	@Test
	void test20TirsDe0() {
		rollMultiple(20, 0);
		assertEquals(0, game.score());
	}
	
	@Test
	void test20TirsDe1() {
		rollMultiple(20, 1);
		assertEquals(20, game.score());
	}
	
	@Test
	void test10TirsDe1Puis2() {
		rollMultiple(10, 1);
		rollMultiple(10, 2);
		assertEquals(30, game.score());
	}
	
	@Test
	void testSpare() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		rollMultiple(17, 0);
		assertEquals(18, game.score());
		
	}
	
	@Test
	void testStrike() {
		game.roll(10);
		game.roll(3);
		game.roll(4);
		rollMultiple(16, 0);
		assertEquals(24, game.score());
	}

	
	private void rollMultiple(int nb_iter, int nb_quilles) {
		for(int i=0; i<nb_iter; ++i) {
			game.roll(nb_quilles);
		}
	}
}
