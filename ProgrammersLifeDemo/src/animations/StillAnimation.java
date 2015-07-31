// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package animations;
import gameState.GameView;

public class StillAnimation extends Animation{
	public StillAnimation(GameView param, String image){
		super(param);
		addImage(image);
	}
	
	public void update() {}
}
