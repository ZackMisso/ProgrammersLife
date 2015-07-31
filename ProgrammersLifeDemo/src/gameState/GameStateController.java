// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package gameState;
import java.awt.Graphics2D;
import core.GameThread;
import io.GameIO;
import logger.GameLogger;
import player.Player;

public class GameStateController {
	private GameThread reference;
	private GameView currentView;
	private Player player;
	private GameLogger logger;
	private GameIO io;
	
	public GameStateController(GameThread param){
		reference = param;
		initializeTheGame();
	}
	
	public void initializeTheGame(){
		player = new Player();
		logger = new GameLogger();
		io = new GameIO();
		currentView = new MainMenu();
	}
	
	public void update(){
		// to be implemented
	}
	
	public void draw(Graphics2D g){
		currentView.draw(g);
	}
	
	public void handleKey(char key, boolean released){
		// to be implemented
	}
	
	public void handleClick(int x, int y){
		// to be implemented
	}
	
	// getter methods
	public GameThread getReference(){return reference;}
	public GameView getCurrentView(){return currentView;}
	public Player getPlayer(){return player;}
	public GameLogger getLogger(){return logger;}
	public GameIO getIO(){return io;}
	
	// setter methods
	public void setReference(GameThread param){reference = param;}
	public void setCurrentView(GameView param){currentView = param;}
	public void setPlayer(Player param){player = param;}
	public void setGameLogger(GameLogger param){logger = param;}
	public void setIO(GameIO param){io = param;}
}
