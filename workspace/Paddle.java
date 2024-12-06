import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	int width;
	int height;
	int xPos;
	int yPos;
	int xVelocity;
	
	//constructor(s):
	public Paddle(int x, int y, int w, int h){
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}



	//methods:

	//getters and setters
	public void addVelocity(int v){
		xVelocity += v;
	}
	public void setX(int x){
		xPos = x;
	}
	public int getX(){
		return xPos;
	}
	public int getY(){
		return yPos;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public int getVelocity(){
		return xVelocity;
	}
	public void setVelocity(int v){
		xVelocity = v;
	}




	public void move(){
		setX(xPos += xVelocity);
	}
	public void draw(Graphics g){
		g.fillRect(xPos, yPos, width, height);
	}
	
}
