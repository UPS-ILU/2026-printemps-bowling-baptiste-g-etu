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
		for(int i = 0; i < 20; ++i) {
			game.roll(0);
		}
		assertEquals(0, game.score());
	}
	@Test
	void test20TirsDe1() {
		for(int i = 0; i < 20; ++i) {
			game.roll(1);
		}
		assertEquals(20, game.score());
	}
	@Test
	void test10TirsDe1Puis2() {
		for(int i = 0; i < 10; ++i) {
			game.roll(1);
			game.roll(2);
		}
		assertEquals(30, game.score());
	}

}
