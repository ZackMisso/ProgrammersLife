// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package dataStructures;

public class SkillRequirement {
	private Skill skill;
	private int neededLevel;
	
	public boolean checkReq(){
		// to be implemented
		return false;
	}
	
	// getter methods
	public Skill getSkill(){return skill;}
	public int getNeededLevel(){return neededLevel;}
	
	// setter methods
	public void setSkill(Skill param){skill = param;}
	public void setNeededLevel(int param){neededLevel = param;}
}
