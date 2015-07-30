// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package dataStructures;
import java.util.ArrayList;

public class Job {
	private ArrayList<SkillRequirement> minReqs;
	private float performance;
	private int minHoursPerTwoWeeks;
	private int hoursAssigned;
	private boolean isInternship;
	private boolean isJob;
	
	// getter methods
	public ArrayList<SkillRequirement> getMinReqs(){return minReqs;}
	public float getPerformance(){return performance;}
	public int getMinHoursPerTwoWeeks(){return minHoursPerTwoWeeks;}
	public int getHoursAssigned(){return hoursAssigned;}
	public boolean getIsInternship(){return isInternship;}
	public boolean getIsJob(){return isJob;}
	
	// setter methods
	public void setMinReqs(ArrayList<SkillRequirement> param){minReqs=param;}
	public void setPerformance(float param){performance = param;}
	public void setMinHoursPerTwoWeeks(int param){minHoursPerTwoWeeks = param;}
	public void setHoursAssigned(int param){hoursAssigned = param;}
	public void setIsInternship(boolean param){isInternship=param;}
	public void setIsJob(boolean param){isJob=param;}
}
