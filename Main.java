import processing.core.PApplet;

public class Main extends PApplet{

	Controller controller = new Controller();
	
	public static void main(String[] args) {
		
		PApplet.main("Main");

	}
	
	public void settings(){
		size(1000, 500); 
	}

	public void setup(){
		 
	}

	public void draw(){
		background(0);
		ellipse(width/2, height/12, controller.a[0], controller.a[0]);
		ellipse(width/2, height*3/12, controller.a[1], controller.a[1]);
		ellipse(width/2, height*5/12, controller.a[2], controller.a[2]);
		ellipse(width/2, height*7/12, controller.a[3], controller.a[3]);
		ellipse(width/2, height*9/12, controller.a[4], controller.a[4]);
		ellipse(width/2, height*11/12, controller.a[5], controller.a[5]);
	}
	

}
