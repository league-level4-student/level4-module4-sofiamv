package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
	CirclePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {
			moveX();
		}
		
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	public void moveX() {
		setX(getX()+1);
	}
	public void moveY() {
		setY(getY()+15);
	}
}
