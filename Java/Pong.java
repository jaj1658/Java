/* 
 Jean Jeon
 21 November, 2016
 Program to use the Paddle class to make paddle for a game of Pong.
 Wait for program to load once Processing canvas comes up, because
 it needs some time to load due to imported images from the web.
 */

// Import processing for use in this program
import processing.core.*;
public class Pong extends PApplet{
	
	// Initialize global booleans for later use
	boolean isRight;
	boolean isLeft;
	
	// Create instance of the Paddle class, setting the screen's width and height to 500x500 through its paramaters
	Paddle pongPaddle = new Paddle (500, 500);

	public static void main(String[] args) {
		PApplet.main("Pong");

	}
	
	// Set canvas width to 500x500 
	public void settings(){
		size(pongPaddle.screenWidth,pongPaddle.screenHeight);
	}
	
	// Create two new PImage constructors, one for the background of the canvas, and one for the paddle 
	PImage webImg;
	
	PImage charmander;
	
	public void setup(){
		// Import image of pokéball from web 
		String url = "http://images5.fanpop.com/image/photos/30600000/pokemon-pokemon-30613442-500-500.png";
		// Import image of charmander from web
		String pokéPaddle = "https://ecs7.tokopedia.net/img/cache/100-square/user-1/2016/7/19/3564126/3564126_479e61a1-1c33-4355-bfbb-256f10e7d685.png";
		
		// Set constructor 'webImg' to image of pokéball
		webImg = loadImage (url, "png");
		
		// Set constructor 'charmander' to image of charmander
		charmander = loadImage (pokéPaddle, "png");
		
	}
	
	public void draw(){
		// Set background of canvas to 'webImg," the image of the pokéball
		background(0);
		image (webImg, 0, 0);
		
		// Make paddle the constructor 'charmander,' the image of the charmander
		image(charmander, pongPaddle.getxPos(),pongPaddle.getyPos(),pongPaddle.getPWidth(), pongPaddle.getPHeight());
		
			// Set up conditions such that if the charmander reaches the right-hand edge of the canvas, then
			// it cannot go any further
			if (pongPaddle.getxPos()<393){
				// Otherwise, invoke the "moveRight" method on the 'pongPaddle' instance of the Paddle class
				// such that if the right-arrow key is pressed, then the charmander will move right
				if (isRight){
					pongPaddle.moveRight();
				}
			}
			// Set up conditions such that if the charmander reaches the left-hand edge of the canvas, then
			// it cannot go any further
			if (pongPaddle.getxPos()>15){
				// Otherwise, invoke the "moveRight" method on the 'pongPaddle' instance of the Paddle class
				// such that if the left-arrow key is pressed, then the charmander will move left
				if (isLeft){
					pongPaddle.moveLeft();
				}
			}
		
	}
	
	/*Set up a method that will change the previously initialized global boolean variable isRight to true if
	//the right-arrow key is pressed, and the previously initialized global boolean variable isLeft to true if
	//the left-arrow key is pressed */
	public void keyPressed(){
		if (key == CODED){
			if (keyCode == RIGHT){
				isRight = true;
			}
			
			}
		
		if (key == CODED){
			if (keyCode == LEFT){
				isLeft = true;
			}
		}

	}
	
	/*Set up a method that will change the previously initialized global boolean variable isRight to false if
	the right-arrow key is released, and the previously initialized global boolean variable isLeft to false if
	the left-arrow key is released. This is so that the paddle will not continue to move left or right on its
	own even when no key is any longer being pressed */
	public void keyReleased(){
		if (key == CODED){
			if (keyCode == RIGHT){
				isRight = false;
			}
		}
		
		if (key == CODED){
			if (keyCode == LEFT){
				isLeft = false;
			}
		}
	}
	
	

}


