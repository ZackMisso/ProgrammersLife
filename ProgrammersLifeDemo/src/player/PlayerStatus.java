// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package player;

public class PlayerStatus {
	private boolean sleeping;
	private boolean studying;
	private boolean reading;
	private boolean coding;
	
	private boolean goingToSleep;
	private boolean goingToStudy;
	private boolean goingToRead;
	private boolean goingToCode;
	
	private boolean noSchool;
	private boolean highSchool;
	private boolean college;
	private boolean gradSchool;
	
	// getter methods
	public boolean getSleeping(){return sleeping;}
	public boolean getStudying(){return studying;}
	public boolean getReading(){return reading;}
	public boolean getCoding(){return coding;}
	public boolean getGoingToSleep(){return goingToSleep;}
	public boolean getGoingToStudy(){return goingToStudy;}
	public boolean getGoingToRead(){return goingToRead;}
	public boolean getGoingToCode(){return goingToCode;}
	public boolean getNoSchool(){return noSchool;}
	public boolean getHighSchool(){return highSchool;}
	public boolean getCollege(){return college;}
	public boolean getGradSchool(){return gradSchool;}
	
	// setter methods
	public void setSleeping(boolean param){sleeping = param;}
	public void setStudying(boolean param){studying = param;}
	public void setReading(boolean param){reading = param;}
	public void setCoding(boolean param){coding = param;}
	public void setGoingToSleep(boolean param){goingToSleep = param;}
	public void setGoingToStudy(boolean param){goingToStudy = param;}
	public void setGoingToRead(boolean param){goingToRead = param;}
	public void setGoingToCode(boolean param){goingToCode = param;}
	public void setNoSchool(boolean param){noSchool = param;}
	public void setHighSchool(boolean param){highSchool = param;}
	public void setCollege(boolean param){college = param;}
	public void setGradSchool(boolean param){gradSchool = param;}
}
