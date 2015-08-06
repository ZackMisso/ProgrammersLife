// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package dataStructures;

public class SkillRequirement {
	private Skill skill;
	private int neededLevel;
	private int forLevel;
	
	public boolean checkReq(){
		if(skill.getLevel() >= neededLevel)
			return true;
		return false;
	}
	
	public boolean checkReqForLevel(int lev){
		if(lev > forLevel)
			return true;
		return checkReq();
	}
	
	// getter methods
	public Skill getSkill(){return skill;}
	public int getNeededLevel(){return neededLevel;}
	public int getForLevel(){return forLevel;}
	
	// setter methods
	public void setSkill(Skill param){skill = param;}
	public void setNeededLevel(int param){neededLevel = param;}
	public void setForLevel(int param){forLevel = param;}
}
