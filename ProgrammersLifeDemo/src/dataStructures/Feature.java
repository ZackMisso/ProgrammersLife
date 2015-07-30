// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package dataStructures;

public class Feature {
	private float featureDesignScore;
	private float difficulty;
	private int numberOfAdditionsNeededAtBest;
	private int numberOfAdditionsMade;
	private int numberOfDeletionsMade;
	
	// getter methods
	public float getFeatureDesignScore(){return featureDesignScore;}
	public float getDifficulty(){return difficulty;}
	public int getNumberOfAdditionsNeededAtBest(){return numberOfAdditionsNeededAtBest;}
	public int getNumberOfAdditionsMade(){return numberOfAdditionsMade;}
	public int getNumberOfDeletionsMade(){return numberOfDeletionsMade;}
	
	// setter methods
	public void setFeatureDesignScore(float param){featureDesignScore = param;}
	public void setDifficulty(float param){difficulty = param;}
	public void setNumberOfAdditionsNeededAtBest(int param){numberOfAdditionsNeededAtBest = param;}
	public void setNumberOfAdditionsMade(int param){numberOfAdditionsMade = param;}
	public void setNumberOfDeletionsMade(int param){numberOfDeletionsMade = param;}
}
