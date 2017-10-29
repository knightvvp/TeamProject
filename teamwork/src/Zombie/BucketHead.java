package Zombie;
import GameObject.*;

import java.awt.Color;
import java.awt.Graphics;

public class BucketHead extends Enemy{
	public BucketHead(int x,int y){
		super(x,y,35,1,15);
	}
	public void render(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(x, y, 30, 80);
		if (this.health>5){
			g.setColor(Color.white);
			g.fillRect(x, y-10, 30, 10);
		}
	}
}
