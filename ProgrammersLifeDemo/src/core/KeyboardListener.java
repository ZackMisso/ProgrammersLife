// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package core;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {
	public GameThread thread;
	
	public KeyboardListener(GameThread param){
		thread = param;
	}
	
	public void keyPressed(KeyEvent event){
		thread.getGSC().handleKey(event.getKeyChar(), false);
	}
	
	public void keyReleased(KeyEvent event){
		thread.getGSC().handleKey(event.getKeyChar(), true);
	}
	
	public void keyTyped(KeyEvent event){
		//keyPressed(event);
	}
}
