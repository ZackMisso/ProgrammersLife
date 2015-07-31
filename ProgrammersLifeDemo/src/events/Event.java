// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package events;
import time.TimeStamp;

public class Event {
	private EventController reference;
	private TimeStamp date;
	
	// getter methods
	public EventController getReference(){return reference;}
	public TimeStamp getDate(){return date;}
	
	// setter methods
	public void setReference(EventController param){reference = param;}
	public void setDate(TimeStamp param){date = param;}
}
