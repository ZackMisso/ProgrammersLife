// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package logger;
import java.util.ArrayList;

// This class exists to send data of the testers playthrough to the creator

public class GameLogger {
	private ArrayList<Tracker> trackers;
	private long startTime;
	private long endTime;
	
	public GameLogger(){
		trackers = new ArrayList<>();
	}
	
	public Tracker getTrackerForName(String name){
		// to be implemented
		return null;
	}
	
	// getter methods
	public ArrayList<Tracker> getFloats(){return trackers;}
	public long getStartTime(){return startTime;}
	public long getEndTime(){return endTime;}
	
	// setter methods
	public void setTrackers(ArrayList<Tracker> param){trackers = param;}
	public void setStartTime(long param){startTime = param;}
	public void setEndTime(long param){endTime = param;}
}
