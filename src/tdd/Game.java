package tdd;

public class Game {
	private int score = 0;
	private int nbBoost = 0;
	private int scorePremierTir;
	private boolean secondTir = false;
	
	private static int SCORE_SPARE = 10;
	
	public void roll(int nbQuilles) {
		if(!secondTir) {
			scorePremierTir = nbQuilles;
			
			if(nbBoost == 0) {
				score += nbQuilles;
			}else {
				score += nbQuilles * 2;
				nbBoost--;
			}
		}else {
			if(scorePremierTir + nbQuilles == SCORE_SPARE) {
				nbBoost ++;
			}
			score += nbQuilles;
		}
		
		secondTir = !secondTir; 
	}
	
	public int score() {
		return score;
	}
}
