package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Menu extends MouseAdapter{
	
	
	public void mousePressed(MouseEvent e){
		int mx=e.getX();
		int my=e.getY();
		if (mouseOver(mx,my,450,300,200,64) && State.getGameState()==ID.Menu){
			Anou.setAnou("Can you survive for 4 minutes");
			State.setGameState(ID.Game);
		}
	}
	
	public void mouseRelease(MouseEvent e){
		
	}
	
	public void tick(){

	}
	
	private boolean mouseOver(int mx,int my,int x, int y, int width , int height){
		if (mx>x && mx < x + width){
			if (my > y && my< y + height){
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	public void render(Graphics g){
		
		Font fnt = new Font("arial",1,50);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Menu", 500, 50);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Play", 500, 350);
		
		g.setColor(Color.white);
		g.drawRect(450, 300, 200, 64);
	}
}
