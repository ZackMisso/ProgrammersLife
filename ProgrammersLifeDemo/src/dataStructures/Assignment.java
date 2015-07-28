// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package dataStructures;
import time.TimeStamp;
import player.Player;

public class Assignment {
	private TimeStamp dueDate;
	private int checkPointsNeeded;
	private int currentCheckPoints;
	private int meanBrainPoints;
	private int payPerHour;
	
	public int calculateCheckPointsToAdd(Player player){
		// to be implemented
		return -1;
	}
	
	// getter methods
	public TimeStamp getDueDate(){return dueDate;}
	public int getCheckPointsNeeded(){return checkPointsNeeded;}
	public int getCurrentCheckPoints(){return currentCheckPoints;}
	public int getMeanBrainPoints(){return meanBrainPoints;}
	public int getPayPerHour(){return payPerHour;}
	
	// setter methods
	public void setDueDate(TimeStamp param){dueDate = param;}
	public void setCheckPointsNeeded(int param){checkPointsNeeded = param;}
	public void setCurrentCheckPoints(int param){currentCheckPoints = param;}
	public void setMeanBrainPoints(int param){meanBrainPoints = param;}
	public void setPayPerHour(int param){payPerHour = param;}
}
