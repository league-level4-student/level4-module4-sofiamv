package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int height = 50;
    private int width = 50;
    
    public void setX(int x) {
    	this.x = x;
    }
    public int getX() {
    	return this.x;
    }
    
    public void setY(int y) {
    	this.y = y;
    }
    public int getY() {
    	return this.y;
    }
    public void setWidth(int w) {
    	this.width = w;
    }
    public int getWidth() {
    	return this.width;
    }
    public void setHeight(int h) {
    	this.height = h;
    }
    public int getHeight() {
    	return this.height;
    }
    
    
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
