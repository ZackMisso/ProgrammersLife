// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package player;
import java.util.ArrayList;
import dataStructures.Repository;

public class RepositoryContainer {
	private ArrayList<Repository> repositories;
	
	public RepositoryContainer(){
		repositories = new ArrayList<>();
	}
	
	// getter methods
	public ArrayList<Repository> getRepositories(){return repositories;}
	
	// setter methods
	public void setRepositories(ArrayList<Repository> param){repositories = param;}
}
