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
		ArrayList<Event> list = new ArrayList<>();
		for(int i=0;i<events.size();i++)
			if(events.get(i).getDate().getMonth() == time.getMonth())
				list.add(events.get(i));
		return events;
	}
	
	public void clearMonth(TimeStamp time){
		for(int i=0;i<events.size();i++)
			if(events.get(i).getDate().getMonth()==time.getMonth())
				events.remove(i--);
	}
	
	// getter methods
	public ArrayList<Event> getEvents(){return events;}
	
	// setter methods
	public void setEvents(ArrayList<Event> param){events = param;}
}
