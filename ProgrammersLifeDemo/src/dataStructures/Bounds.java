package dataStructures;

public class Bounds {
	private int xpos;
	private int ypos;
	private int width;
	private int height;
	
	public boolean contains(int x, int y){
		if(x < xpos || x > xpos + width)
			return false;
		if(y < ypos || y > ypos + height)
			return false;
		return true;
	}
	
	// getter methods
	public int getXpos(){return xpos;}
	public int getYpos(){return ypos;}
	public int getWidth(){return width;}
	public int getHeight(){return height;}
	
	// setter methods
	public void setXpos(int param){xpos = param;}
	public void setYpos(int param){ypos = param;}
	public void setWidth(int param){width = param;}
	public void setHeight(int param){height = param;}
}
