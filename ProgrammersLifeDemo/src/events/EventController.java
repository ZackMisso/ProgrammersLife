// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package events;
import java.util.ArrayList;
import time.TimeStamp;

public class EventController {
	private ArrayList<Event> events;
	
	public EventController(){
		events = new ArrayList<>();
	}
	
	public ArrayList<Event> getAllEventsForMonth(TimeStamp time){
		// to be implemented
		return null;
	}
	
	public void clearMonth(TimeStamp time){
		// to be implemented
	}
	
	// getter methods
	public ArrayList<Event> getEvents(){return events;}
	
	// setter methods
	public void setEvents(ArrayList<Event> param){events = param;}
}
