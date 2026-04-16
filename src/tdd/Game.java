package tdd;

public class Game {
	private int score;
	
	
	public void roll(int nbQuilles) {
		score += nbQuilles;
	}
	
	public int score() {
		return score;
	}
}
