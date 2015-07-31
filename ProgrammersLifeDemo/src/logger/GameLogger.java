// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package logger;
import java.util.ArrayList;

// This class exists to send data of the testers playthrough to the creator

public class GameLogger {
	private ArrayList<Tracker> floats;
	private long startTime;
	
	public GameLogger(){
		floats = new ArrayList<>();
		ints = new ArrayList<>();
	}
	
	public Tracker getTrackerForName(String name){
		// to be implemented
		return null;
	}
	
	// getter methods
	public ArrayList<FloatTracker> getFloats(){return floats;}
	public ArrayList<IntTracker> getInts(){return ints;}
}
