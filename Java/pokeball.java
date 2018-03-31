
public class pokeball {
	
	private int xPos;
	private int yPos;
	
	Paddle pongPaddle = new Paddle(500,500);
	
pokeball (){
	this.yPos = 30;
	this.xPos = 15+(int)(Math.random()*(pongPaddle.getxPos()+1));
}

void bounceDown(){
	this.yPos +=3;
}

void bounceUp(){
	this.yPos -=3;
}

int getYPos(){
	return this.yPos;
}

int getXPos(){
	return this.xPos;
}

void reset(){
	this.yPos = 30;
}

}


