// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package player;
import dataStructures.Job;

public class Player {
	private RepositoryContainer repositories;
	private BaseStats baseStats;
	private SkillStats skills;
	private PointStats points;
	private Job job;
	private PlayerStatus status;
	private int hackerPoints;
	
	public Player(){}
	
	public void initializeForNewGame(){
		baseStats.initializeNewGame();
		points.initializeNewGame();
		skills.initializeNewGame();
		// to be implemented
	}
	
	public void update(){
		// to be implemented
	}
	
	// getter methods
	public RepositoryContainer getRepositories(){return repositories;}
	public BaseStats getBaseStats(){return baseStats;}
	public SkillStats getSkillStats(){return skills;}
	public PointStats getPoints(){return points;}
	public Job getJob(){return job;}
	public PlayerStatus getStatus(){return status;}
	public int getHackerPoints(){return hackerPoints;}
	
	// setter methods
	public void setRepositories(RepositoryContainer param){repositories = param;}
	public void setBaseStats(BaseStats param){baseStats = param;}
	public void setSkills(SkillStats param){skills=param;}
	public void setPointStats(PointStats param){points=param;}
	public void setJob(Job param){job=param;}
	public void setHackerPoints(int param){hackerPoints=param;}
}
