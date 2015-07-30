// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package gameState;
import java.awt.Graphics2D;
import core.GameThread;
import logger.GameLogger;
import player.Player;

public class GameStateController {
	private GameThread reference;
	private GameView currentView;
	private Player player;
	private GameLogger logger;
	
	public GameStateController(GameThread param){
		reference = param;
	}
	
	public void initializeTheGame(){
		// to be implemented
	}
	
	public void update(){
		// to be implemented
	}
	
	public void draw(Graphics2D g){
		// to be implemented
	}
	
	public void handleKey(char key, boolean released){
		// to be implemented
	}
	
	public void handleClick(int x, int y){
		// to be implemented
	}
}
