package Zombie;
import GameObject.*;

import java.awt.Color;
import java.awt.Graphics;

public class ConeHead extends Enemy{
	public ConeHead(int x,int y){
		super(x,y,15,1,15);
	}
	public void render(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(x, y, 30, 80);
		if (this.health>5){
			g.setColor(Color.red);
			g.fillRect(x, y-10, 30, 10);
		}
	}
}
