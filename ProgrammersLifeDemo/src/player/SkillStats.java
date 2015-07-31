// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package player;
import java.util.ArrayList;

public class SkillStats {
	private ArrayList<SkillStats> skills;
	
	public SkillStats(){
		skills = new ArrayList<>();
		initializeSkills();
	}
	
	public void initializeSkills(){
		// to be implemented
	}
	
	public void initializeNewGame(){
		// to be implemented
	}
	
	// getter methods
	public ArrayList<SkillStats> getSkills(){return skills;}
	
	// setter methods
	public void setSkills(ArrayList<SkillStats> param){skills = param;}
}
