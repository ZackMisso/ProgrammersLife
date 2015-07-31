// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package logger;

public class IntTracker extends Tracker{
	private int track;
	
	public void increment(){
		track++;
	}
	
	public String toString(){
		//return "int :: "+name+" track :: "+track;
		return "";
	}
	
	// getter methods
	public int getTrack(){return track;}
	
	// setter methods
	public void setTrack(int param){track = param;}
}
