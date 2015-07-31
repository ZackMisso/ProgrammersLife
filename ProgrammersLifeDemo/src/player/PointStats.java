// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package player;

public class PointStats {
	private int brainPoints;
	private int checkPoints;
	private int starPoints;
	
	public void initializeNewGame(){
		brainPoints = 0;
		checkPoints = 0;
		starPoints = 0;
	}
	
	public String toString(){
		// to be implemented
		return "";
	}
	
	// getter methods
	public int getBrainPoints(){return brainPoints;}
	public int getCheckPoints(){return checkPoints;}
	public int getStarPoints(){return starPoints;}
	
	// setter methods
	public void setBrainPoints(int param){brainPoints = param;}
	public void setCheckPoints(int param){checkPoints = param;}
	public void setStarPoints(int param){starPoints = param;}
}
