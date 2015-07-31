// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package animations;
import java.util.ArrayList;
import java.awt.Image;
import java.awt.Graphics2D;
import gameState.GameView;

public abstract class Animation {
	private ArrayList<Image> images;
	private GameView reference;
	private int currentIndex;
	
	public Animation(GameView param){
		reference = param;
	}
	
	public abstract void update();
	
	public void addImage(String img){
		// to be implemented
	}
	
	public void draw(Graphics2D g){
		g.drawImage(images.get(currentIndex),reference.getBounds().getXpos(),reference.getBounds().getYpos(),null);
	}
	
	// getter methods
	public ArrayList<Image> getImages(){return images;}
	public GameView getReference(){return reference;}
	public int getCurrentIndex(){return currentIndex;}
	
	// setter methods
	public void setImages(ArrayList<Image> param){images = param;}
	public void setReference(GameView param){reference = param;}
	public void setCurrentIndex(int param){currentIndex = param;}
}
