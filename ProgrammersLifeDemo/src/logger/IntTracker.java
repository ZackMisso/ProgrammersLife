// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package logger;

public class IntTracker {
	private String name;
	private int track;
	
	public void increment(){
		track++;
	}
	
	// getter methods
	public String getName(){return name;}
	public int getTrack(){return track;}
	
	// setter methods
	public void setName(String param){name = param;}
	public void setTrack(int param){track = param;}
}
