import java.awt.Frame;
import java.awt.FlowLayout;

import java.awt.Graphics;
import java.awt.Color;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

class MyFrame extends Frame{
	int posX, posY;
	String msg="";
	
	MyFrame(String title){
		super(title);
		
		//registration
		this.addMouseListener(new Helper());
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.drawString(msg, posX, posY);
	}
	
	class Helper extends MouseAdapter{
		public void mousePressed(MouseEvent me){
			posX = me.getX();
			posY = me.getY();
			msg = "posX : "+posX+", posY : "+posY;
			repaint();
		}
	}
};

public class exp5_1{
	public static void main(String[] arg){
		MyFrame f = new MyFrame("Mouse-position");
		f.setVisible(true);
		f.setSize(600,500);
		f.setLayout(new FlowLayout());
	}
};