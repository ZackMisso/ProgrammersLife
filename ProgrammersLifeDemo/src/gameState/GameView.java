// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package gameState;
import java.awt.Graphics2D;
import java.util.ArrayList;
import animations.Animation;
import dataStructures.Bounds;

public class GameView {
	private ArrayList<GameView> subViews;
	private Animation anim;
	private Bounds bounds;
	
	public GameView(){
		subViews = new ArrayList<>();
	}
	
	public void update(){
		// to be implemented
		for(int i=0;i<subViews.size();i++)
			subViews.get(i).update();
	}
	
	public void draw(Graphics2D g){
		anim.draw(g);
		for(int i=0;i<subViews.size();i++)
			subViews.get(i).draw(g);
	}
	
	public boolean wasClicked(int x,int y){
		return bounds.contains(x,y);
	}
	
	public void handleClick(int x,int y){
		// to be implemented
		for(int i=0;i<subViews.size();i++)
			subViews.get(i).handleClick(x, y);
	}
	
	public void handleKey(char k,boolean release){
		// to be implemented
		for(int i=0;i<subViews.size();i++)
			subViews.get(i).handleKey(k, release);
	}
	
	// getter methods
	public ArrayList<GameView> getSubViews(){return subViews;}
	public Animation getAnimation(){return anim;}
	public Bounds getBounds(){return bounds;}
	
	// setter methods
	public void setSubViews(ArrayList<GameView> param){subViews = param;}
	public void setAnimation(Animation param){anim = param;}
	public void setBounds(Bounds param){bounds = param;}
}
