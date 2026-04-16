package tdd;

public class Game {
	private int score = 0;
	private int nbBoost = 0;
	private int scorePremierTir;
	private boolean secondTir = false;
	
	private static int SCORE_SPARE_STRIKE = 10;
	
	public void roll(int nbQuilles) {
		if(!secondTir) {
			scorePremierTir = nbQuilles;
			
			ajouterPoints(nbQuilles);
			
			// Strike Case
			if(nbQuilles == SCORE_SPARE_STRIKE) {
				nbBoost += 2;
				secondTir = true; //Il n'y a pas de 2e lancer pour ce tour 
			}
			
		}else {
			ajouterPoints(nbQuilles);
			
			// Spare case
			if(scorePremierTir + nbQuilles == SCORE_SPARE_STRIKE) {
				nbBoost ++;
			}
		}
		
		secondTir = !secondTir; 
	}
	
	private void ajouterPoints(int nbQuilles) {
		if(nbBoost == 0) {
			score += nbQuilles;
		}else {
			nbBoost--;
			score += nbQuilles*2;
		}
	}
	
	public int score() {
		return score;
	}
}
