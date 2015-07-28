// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package time;

public class Day {
	private int totalHours;
	private int sleepHours;
	private int hoursInSchool;
	private int hoursWorking;
	private int hoursForPlay;
	private int specialHours;
	
	// getter methods
	public int getTotalHours(){return totalHours;}
	public int getSleepHours(){return sleepHours;}
	public int getHoursInSchool(){return hoursInSchool;}
	public int getHoursWorking(){return hoursWorking;}
	public int getHoursForPlay(){return hoursForPlay;}
	public int getSpecialHours(){return specialHours;}
	
	// setter methods
	public void setTotalHours(int param){totalHours = param;}
	public void setSleepHours(int param){sleepHours = param;}
	public void setHoursInSchool(int param){hoursInSchool = param;}
	public void setHoursWorking(int param){hoursWorking = param;}
	public void setHoursForPlay(int param){hoursForPlay = param;}
	public void setSpecialHours(int param){specialHours = param;}
}
