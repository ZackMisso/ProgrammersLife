// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package dataStructures;
import java.util.ArrayList;

public class Skill {
	private static int LevelOnePoints = 100;
	private static int LevelTwoPoints = 1000;
	private static int LevelThreePoints = 5000;
	private static int LevelFourPoints = 30000;
	private static int LevelFivePoints = 200000;
	private static int LevelSixPoints = 1000000;
	private static int LevelSevenPoints = 10000000;
	
	private ArrayList<SkillRequirement> reqs;
	private String name;
	private int level;
	private int currentPts;
	private int ptsToGo;
	private boolean unlocked;
	
	public Skill(){
		reqs = new ArrayList<>();
		level = -1;
	}
	
	public void levelUp(){
		if(level == 0){
			level = 1;
			ptsToGo = LevelTwoPoints;
			// implement global check
		}else if(level == 1){
			level = 2;
			ptsToGo = LevelThreePoints;
			// implement global check
		}else if(level == 2){
			level = 3;
			ptsToGo = LevelFourPoints;
			// implement global check
		}else if(level == 3){
			level = 4;
			ptsToGo = LevelFivePoints;
			// implement global check
		}else if(level == 4){
			level = 5;
			ptsToGo = LevelSixPoints;
			// implement global check
		}else if(level == 5){
			level = 6;
			ptsToGo = LevelSevenPoints;
			// implement global check
		}else if(level == 6){
			level = 7;
			// implement global check
			// unlock achievement
		}
	}
	
	public void unlock(){
		// implement special event
		level = 0;
		ptsToGo = LevelOnePoints;
	}
	
	public boolean checkRequirements(){
		for(int i=0;i<reqs.size();i++)
			if(!reqs.get(i).checkReqForLevel(level+1))
				return false;
		return true;
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
