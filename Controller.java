import processing.core.PApplet;

public class Controller extends PApplet {
	
	int[] a = new int[6];
		
	public Controller(){
		
		newArray();
		Bubble bubble = new Bubble(a);
		bubble.start();
	}
	
	public void newArray(){
		
		for(int i = 0; i < a.length; i++){
			
			a[i] = round(random(10, 50));
		
		}
			
		
	}
	
	
}
