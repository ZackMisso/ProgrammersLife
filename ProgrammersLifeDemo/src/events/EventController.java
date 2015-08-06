// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package events;
import java.util.ArrayList;
import player.PlayerStatus;
//import time.TimeStamp;

public class EventController {
	// This class will manage the events that happen to the player in real time ex:
	// The player getting a notification for unlocking a language.
	private ArrayList<Event> events;
	private Event currentEvent;
	private PlayerStatus playerStatus;
	private boolean onHold;
	
	public EventController(){
		events = new ArrayList<>();
	}
	
	//public ArrayList<Event> getAllEventsForMonth(TimeStamp time){
	//	ArrayList<Event> list = new ArrayList<>();
	//	for(int i=0;i<events.size();i++)
	//		if(events.get(i).getDate().getMonth() == time.getMonth())
	//			list.add(events.get(i));
	//	return events;
	//}
	
	//public void clearMonth(TimeStamp time){
	//	for(int i=0;i<events.size();i++)
	//		if(events.get(i).getDate().getMonth()==time.getMonth())
	//			events.remove(i--);
	//}
	
	// getter methods
	public ArrayList<Event> getEvents(){return events;}
	public Event getCurrentEvent(){return currentEvent;}
	public PlayerStatus getPlayerStatus(){return playerStatus;}
	public boolean getOnHold(){return onHold;}
	
	// setter methods
	public void setEvents(ArrayList<Event> param){events = param;}
	public void setCurrentEvent(Event param){currentEvent = param;}
	public void setPlayerStatus(PlayerStatus param){playerStatus = param;}
	public void setOnHold(boolean param){onHold = param;}
}
