// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package events;
import java.util.ArrayList;
import time.TimeStamp;

public class TimeEventController {
	private ArrayList<TimeEvent> timeEvents;
	
	public TimeEventController(){
		timeEvents = new ArrayList<>();
	}
	
	public void update(){
		// to be implemented
	}
	
	public ArrayList<TimeEvent> getAllEventsForMonth(TimeStamp time){
		ArrayList<TimeEvent> list = new ArrayList<>();
		for(int i=0;i<timeEvents.size();i++)
			if(timeEvents.get(i).getDate().getMonth() == time.getMonth())
				list.add(timeEvents.get(i));
		return timeEvents;
	}
	
	public void clearMonth(TimeStamp time){
		for(int i=0;i<timeEvents.size();i++)
			if(timeEvents.get(i).getDate().getMonth()==time.getMonth())
				timeEvents.remove(i--);
	}
	
	// getter methods
	public ArrayList<TimeEvent> getTimeEvents(){return timeEvents;}
	
	// setter methods
	public void setTimeEvents(ArrayList<TimeEvent> param){timeEvents = param;}
}
