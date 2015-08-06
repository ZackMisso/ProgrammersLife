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
			days.clear();
			for(int i=0;i<31;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}else if(currentMonth == 2){
			title = "February";
			for(int i=0;i<28;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}else if(currentMonth == 3){
			title = "March";
			for(int i=0;i<31;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}else if(currentMonth == 4){
			title = "April";
			for(int i=0;i<30;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}else if(currentMonth == 5){
			title = "May";
			for(int i=0;i<31;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}else if(currentMonth == 6){
			title = "June";
			for(int i=0;i<30;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}else if(currentMonth == 7){
			title = "July";
			for(int i=0;i<31;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}else if(currentMonth == 8){
			title = "August";
			for(int i=0;i<31;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}else if(currentMonth == 9){
			title = "September";
			for(int i=0;i<30;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}else if(currentMonth == 10){
			title = "October";
			for(int i=0;i<31;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}else if(currentMonth == 11){
			title = "November";
			for(int i=0;i<30;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}else if(currentMonth == 12){
			title = "December";
			for(int i=0;i<31;i++){
				Day day = new Day();
				// make changes on the day
				days.add(day);
			}
		}
	}
	
	// getter methods
	public ArrayList<Day> getDays(){return days;}
	public EventController getEventReference(){return eventReference;}
	public String getTitle(){return title;}
	public int getCurrentMonth(){return currentMonth;}
	
	// setter methods
	public void setDays(ArrayList<Day> param){days = param;}
	public void setEventReference(EventController param){eventReference = param;}
	public void setTitle(String param){title = param;}
	public void setCurrentMonth(int param){currentMonth = param;}
}
