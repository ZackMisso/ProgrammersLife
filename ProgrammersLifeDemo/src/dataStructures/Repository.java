// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package dataStructures;
import java.util.ArrayList;
import player.Player;

public class Repository {
	private ArrayList<Skill> skills;
	private ArrayList<Feature> featureHistory;
	private String name;
	private Feature currentFeature;
	private float designScore;
	private int additions;
	private int deletions;
	
	public Repository(){
		skills = new ArrayList<>();
		featureHistory = new ArrayList<>();
	}
	
	public int calculateChangesToBeMade(Player player){
		// to be implemented
		return -1;
	}
	
	public String toString(){
		// to be implemented
		return "";
	}
	
	// getter methods
	public ArrayList<Skill> getSkills(){return skills;}
	public ArrayList<Feature> getFeatureHistory(){return featureHistory;}
	public String getName(){return name;}
	public Feature getCurrentFeature(){return currentFeature;}
	public float getDesignScore(){return designScore;}
	public int getAdditions(){return additions;}
	public int getDeletion(){return deletions;}
	
	// setter methods
	public void setSkills(ArrayList<Skill> param){skills = param;}
	public void setFeatureHistory(ArrayList<Feature> param){featureHistory = param;}
	public void setName(String param){name = param;}
	public void setCurrentFeature(Feature param){currentFeature = param;}
	public void setDesignScore(float param){designScore = param;}
	public void setAdditions(int param){additions = param;}
	public void setDeletions(int param){deletions = param;}
}
