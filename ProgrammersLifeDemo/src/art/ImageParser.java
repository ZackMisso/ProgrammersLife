// This is the Game Tester's version of ProgrammersLife
// Author :: Zackary Misso / FiralStudios
// Version :: 0.0.1

package art;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

public class ImageParser {
	private Map<String,Image> cache;
	
	public ImageParser(){
		cache = new HashMap<String,Image>();
	}
	
	public Image getImage(String loc){
		if(cache.containsKey(loc))
			return cache.get(loc);
		else{
			Image img;
			try{
				img = ImageIO.read(getClass().getResourceAsStream(loc+".png"));
			}catch(IOException e){
				System.out.println("Image Parser Error");
				return null;
			}
			cache.put(loc, img);
			return img;
		}
	}
	
	public ArrayList<Image> getImages(String loc,int count){
		ArrayList<Image> imgs = new ArrayList<>();
		for(int i=0;i<count;i++){
			if(cache.containsKey(loc))
				imgs.add(cache.get(loc));
			else{
				try{
					Image img = ImageIO.read(getClass().getResourceAsStream(loc+i+".png"));
					imgs.add(img);
					cache.put(loc,img);
				}catch(IOException e){
					System.out.println("Image Parser Error");
				}
			}
		}
		return imgs;
	}
	
	public void clearCache(){
		cache.clear();
	}
}