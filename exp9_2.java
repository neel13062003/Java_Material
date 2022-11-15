import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Graphics;

import java.awt.Color;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.lang.Math;

class Ball extends Thread{
	MyFrame f;
	int xBound, yBound;
	int posX, posY;
	int xDir, yDir;
	boolean isPause = false;
	
	Ball(MyFrame f){
		this.f = f;
		
		this.posX = f.posX;
		this.posY = f.posY;
		
		this.xDir = 1;
		this.yDir = 1;
		
		this.xBound = 800-30;
		this.yBound = 600-30;
	}
	
	public void run(){
		while(!isPause){
			try{Thread.sleep(100);}catch(InterruptedException ie){}
			
			if(posX <= 0 || posX >= xBound) xDir *= -1;
			if(posY <=40 || posY >= yBound) yDir *= -1;
			
			posX += xDir;
			posY += yDir;
			f.setPos(posX, posY);
			f.repaint();
		}
	}
	
	public void allPause(){isPause = true;}
}

class MyFrame extends Frame{
	int posX, posY;
	Ball newBall;
	MyFrame f;
	int cntr = 4;
	
	MyFrame(String t){
		super(t);
		f = this;
		
		this.addMouseListener(new Helper());
	}

	public void paint(Graphics g){
		int R = (int)(Math.random()*255);
		int G = (int)(Math.random()*255);
		int B = (int)(Math.random()*255);
		g.setColor(new Color(R, G, B));
		g.fillOval(posX, posY, 30,30);
	}
	
	public void setPos(int x, int y){
		this.posX = x;
		this.posY = y;
	}
	
	class Helper extends MouseAdapter{

		public void mousePressed(MouseEvent me){
			posX = me.getX();
			posY = me.getY();
			//repaint();

			
			newBall = new Ball(f);
			cntr--;
			newBall.start();
			if(cntr < 0)newBall.allPause();
			//System.out.println(cntr);
		}
	}
}

public class exp9_2{
	public static void main(String[] arg){
		MyFrame f = new MyFrame("Bouncing Ball - exp9-2");
		f.setVisible(true);
		f.setSize(800, 600);
		f.setLayout(new FlowLayout());
	}
}