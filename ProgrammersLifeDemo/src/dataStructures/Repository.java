// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package dataStructures;
import player.Player;

public class Repository {
	private String name;
	private Feature currentFeature;
	private float designScore;
	private int additions;
	private int deletions;
	
	public int calculateChangesToBeMade(Player player){
		// to be implemented
		return -1;
	}
	
	// getter methods
	public String getName(){return name;}
	public Feature getCurrentFeature(){return currentFeature;}
	public float getDesignScore(){return designScore;}
	public int getAdditions(){return additions;}
	public int getDeletion(){return deletions;}
	
	// setter methods
	public void setName(String param){name = param;}
	public void setCurrentFeature(Feature param){currentFeature = param;}
	public void setDesignScore(float param){designScore = param;}
	public void setAdditions(int param){additions = param;}
	public void setDeletions(int param){deletions = param;}
}
