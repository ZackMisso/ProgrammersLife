package logger;

public class Tracker {
	private String name;
	private long startTracking;
	private long stopTracking;
	
	public void start(){
		// to be implemented
	}
	
	public void stop(){
		// to be implemented
	}
	
	// getter methods
	public String getName(){return name;}
	public long getStartTracking(){return startTracking;}
	public long getStopTracking(){return stopTracking;}
	
	// setter methods
	public void setName(String param){name = param;}
	public void setStartTracking(long param){startTracking = param;}
	public void setStopTracking(long param){stopTracking = param;}
}
