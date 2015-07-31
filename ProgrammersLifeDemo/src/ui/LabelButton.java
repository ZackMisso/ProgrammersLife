// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package ui;
import gameState.GameView;

public class LabelButton extends GameView{
	private Label label;
	private Button button;
	
	// getter methods
	public Label getLabel(){return label;}
	public Button getButton(){return button;}
	
	// setter methods
	public void setLabel(Label param){label = param;}
	public void setButton(Button param){button = param;}
}
