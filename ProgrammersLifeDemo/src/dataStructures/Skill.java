// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package dataStructures;
import java.util.ArrayList;

public class Skill {
	private ArrayList<SkillRequirement> reqs;
	private String name;
	private int level;
	private int currentPts;
	private int ptsToGo;
	private boolean unlocked;
	
	public void levelUp(){
		// to be implemented
	}
	
	public void unlock(){
		// to be implemented
	}
	
	public boolean checkRequirements(){
		// to be implemented
		return false;
	}
	
	public String toString(){
		// to be implemented
		return "";
	}
	
	// getter methods
	public ArrayList<SkillRequirement> getReqs(){return reqs;}
	public String getName(){return name;}
	public int getLevel(){return level;}
	public int getCurrentPts(){return currentPts;}
	public int getPtsToGo(){return ptsToGo;}
	public boolean getUnlocked(){return unlocked;}
	
	// setter methods
	public void setReqs(ArrayList<SkillRequirement> param){reqs = param;}
	public void setName(String param){name = param;}
	public void setLevel(int param){level = param;}
	public void setCurrentPts(int param){currentPts = param;}
	public void setPtsToGo(int param){ptsToGo = param;}
	public void setUnlocked(boolean param){unlocked = param;}
}
