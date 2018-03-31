
public class Paddle {
	
	/* Set up data fields width and height of the screen, width and height of the paddle, x Position, y Position, and
	 * speed
	 */
	int screenWidth;

	int screenHeight;

	private int paddleWidth;
	
	private int paddleHeight;
	
	private int xPos;
	
	private int yPos;
	
	private int speed;

	// Create Paddle constructor that takes in two ints, ScreenWidth and screenHeight, for its parameters
Paddle (int screenWidth, int screenHeight){
	
	// Set previously initialized data fields to default values
	this.screenWidth = screenWidth;
	
	this.screenHeight = screenHeight;
	
	this.paddleWidth = 100;
	
	this.paddleHeight = 100;
	
	this.xPos = 250;
	
	this.yPos = 385;
	
	this.speed = 3;

	}
	
	// Set up a method that will decrease the x Position by the value of the 'speed' variable, 3
	void moveLeft (){

		this.xPos -= 3;

	}

	// Set up a method that will increase the X Position by the value of the 'speed' variable, 3
	void moveRight(){
		this.xPos += speed;
	}
	
	// Set up a method that will return the value of the X Position
	int getxPos(){
		return this.xPos;
	}
	
	// Set up a method that will return the value of the Y Position
	int getyPos(){
		return this.yPos;
	}
	
	// Set up a method that will return the value of the width of the paddle
	int getPWidth(){
		return this.paddleWidth;
	}
	
	// Set up a method that will return the value of the height of the paddle
	int getPHeight(){
		return this.paddleHeight;
	}
	}
