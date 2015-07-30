// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package time;

public class GameTimer {
	private TimeStamp date;
	private int counter;
	private int countsPerDay;
	
	public void initializeNewGameTime(){
		// to be implemented
	}
	
	// getter methods
	public TimeStamp getDate(){return date;}
	public int getCounter(){return counter;}
	public int getCountsPerDay(){return countsPerDay;}
	
	// setter methods
	public void setDate(TimeStamp param){date = param;}
	public void setCounter(int param){counter = param;}
	public void setCountsPerDay(int param){countsPerDay = param;}
}
