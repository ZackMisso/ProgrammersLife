// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package gameControllers;
import events.EventController;
import generators.AssignmentGenerator;
import generators.FeatureGenerator;
import generators.JobGenerator;
import time.TimeStamp;
import time.MonthCalendar;

public class MainGameController {
	private EventController events;
	private AssignmentGenerator assignments;
	private FeatureGenerator features;
	private JobGenerator jobs;
	private MonthCalendar month;
	private TimeStamp mainTime;
	private int ticksPerDay;
	
	public MainGameController(){
		events = new EventController();
		assignments = new AssignmentGenerator();
		features = new FeatureGenerator();
		jobs = new JobGenerator();
		ticksPerDay = 3000;
	}
	
	public void update(){
		// to be implemented
	}
	
	// getter methods
	public EventController getEvents(){return events;}
	public AssignmentGenerator getAssignments(){return assignments;}
	public FeatureGenerator getFeatures(){return features;}
	public JobGenerator getJobs(){return jobs;}
	public MonthCalendar getMonth(){return month;}
	public TimeStamp getMainTime(){return mainTime;}
	public int getTicksPerDay(){return ticksPerDay;}
	
	// setter methods
	public void setEvents(EventController param){events = param;}
	public void setAssignments(AssignmentGenerator param){assignments = param;}
	public void setFeatures(FeatureGenerator param){features = param;}
	public void setJobs(JobGenerator param){jobs = param;}
	public void setMonthCalendar(MonthCalendar param){month = param;}
	public void setMainTime(TimeStamp param){mainTime = param;}
	public void setTicksPerDay(int param){ticksPerDay = param;}
}
