//Rowyn Oliver 12/4/24
//Ball.java code for BrickBreak project


import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int xPos;
	private int yPos;
	private int size;

	private int xVelocity;
	private int yVelocity;


	//constructor(s):
	public Ball(int x, int y, int sizeTemp){
		xPos = x;
		yPos = y;
		size = sizeTemp;

	}
	//methods:


	//getters and setters
	public int getYpos(){
		return yPos;
	}
	public int getXpos(){
		return xPos;
	}
	public int getSize(){
		return size;
	}
	public int getVelocity(){
		return xVelocity;
	}

	public void setY(int y){
		yPos = y;
	}
	public void setX(int x){
		xPos = x;
	}
	public void setYVelocity(int v){
		yVelocity = v;
	}
	public void setXVelocity(int v){
		xVelocity = v;
	}
	public void reverseX(){
		xVelocity *= -1;
	}
	public void reverseY(){
		yVelocity *= -1;
	}



	//functions regarding game physics
	public void move(){
		int tempy = yPos += yVelocity;
		int tempx = xPos += xVelocity;
		setY(tempy);
		setX(tempx);


	}

	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillOval(xPos, yPos, size, size);
	}



}
