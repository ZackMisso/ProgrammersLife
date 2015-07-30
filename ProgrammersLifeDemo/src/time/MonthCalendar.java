// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package time;
import java.util.ArrayList;
import events.EventController;

public class MonthCalendar {
	private ArrayList<Day> days;
	private EventController eventReference;
	private String title;
	private int currentMonth;
	
	public MonthCalendar(){
		days = new ArrayList<>();
	}
	
	public void initializeFromBeginning(){
		// to be implemented
	}
	
	public void initializeMonth(){
		if(currentMonth == 1){
			title = "January";
			// to be implemented
		}else if(currentMonth == 2){
			title = "February";
			// to be implemented
		}else if(currentMonth == 3){
			title = "March";
			// to be implemented
		}else if(currentMonth == 4){
			title = "April";
			// to be implemented
		}else if(currentMonth == 5){
			title = "May";
			// to be implemented
		}else if(currentMonth == 6){
			title = "June";
			// to be implemented
		}else if(currentMonth == 7){
			title = "July";
			// to be implemented
		}else if(currentMonth == 8){
			title = "August";
			// to be implemented
		}else if(currentMonth == 9){
			title = "September";
			// to be implemented
		}else if(currentMonth == 10){
			title = "October";
			// to be implemented
		}else if(currentMonth == 11){
			title = "November";
			// to be implemented
		}else if(currentMonth == 12){
			title = "December";
			// to be implemented
		}
	}
	
	// getter methods
	public ArrayList<Day> getDays(){return days;}
	public String getTitle(){return title;}
	public int getCurrentMonth(){return currentMonth;}
	
	// setter methods
	public void setDays(ArrayList<Day> param){days = param;}
	public void setEventReference(EventController param){eventReference = param;}
	public void setTitle(String param){title = param;}
	public void setCurrentMonth(int param){currentMonth = param;}
}
