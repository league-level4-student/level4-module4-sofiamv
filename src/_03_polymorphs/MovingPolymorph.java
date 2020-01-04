package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph{
	MovingPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {
	setX(getX()+5);
	setY(getY()+3);
	}
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}
