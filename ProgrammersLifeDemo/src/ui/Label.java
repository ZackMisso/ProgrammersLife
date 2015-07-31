// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package ui;
import java.awt.Graphics2D;
import gameState.GameView;

public class Label extends GameView {
	private String label;
	
	public Label(){
		super();
	}
	
	public void update(){
		// to be implemented
	}
	
	public void draw(Graphics2D g){
		// to be implemented
	}
	
	// getter methods
	public String getLabel(){return label;}
	
	// setter methods
	public void setLabel(String param){label = param;}
}
