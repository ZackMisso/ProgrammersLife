// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package events;
import time.TimeStamp;

public abstract class Event {
	private EventController reference;
	
	public abstract void reactToEvent(PlayerStatus status);
	
	// getter methods
	public EventController getReference(){return reference;}
	
	// setter methods
	public void setReference(EventController param){reference = param;}
}
