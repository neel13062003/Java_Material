import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Graphics;

import java.awt.Button;
import java.awt.TextField;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Banner extends Thread{
	String dir;
	MyFrame f;
	boolean isKilled;
	
	Banner(MyFrame f){
		this.f = f;
		this.dir = f.dir;
		isKilled = false;
	}
	
	public void moveBanner(int s, int e){

		while(!isKilled){
			try{Thread.sleep(50);}catch(InterruptedException ie){}
			
			if(s > 800)s=0;
			
			if(dir.equals("left")) f.setPos(e-s);
			else f.setPos(s);
			
			f.repaint();
			s++;
		}
	}	
	
	public void run(){
		moveBanner(0,800);
	}
	
	public void kill(){isKilled = true;}
}

class MyFrame extends Frame implements ActionListener{
	TextField msg, color, size;
	Choice direction;
	Button start;
	Banner banner;
	
	int posX;
	int fontSize;
	String str="", clr="", dir="";
	boolean threadRun = false;
	
	MyFrame(String t){
		super(t);
		
		msg = new TextField("Hello World",20);
		color = new TextField(20);
		size = new TextField("40",20);
		
		direction = new Choice();
		direction.addItem("left");
		direction.addItem("right");
		direction.select(0);
		
		start = new Button("Start");
		
		start.addActionListener(this);
		
		this.add(msg);
		this.add(color);
		this.add(size);
		this.add(direction);
		this.add(start);
		
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == start){
			fontSize = Integer.parseInt(size.getText());
			str = msg.getText();
			clr = color.getText();
			dir = direction.getSelectedItem();
			
			if(threadRun) banner.kill();
			
			banner = new Banner(this);
			threadRun = true;
			banner.start();
		}
	}
	
	public void setPos(int x){this.posX = x;}
	
	public void paint(Graphics g){
		Font f = new Font("Consolas", Font.BOLD, fontSize);
		g.setFont(f);
		
		if(clr.equals("red") || clr.equals("RED")) g.setColor(Color.RED);
		else if(clr.equals("blue") || clr.equals("BLUE")) g.setColor(Color.BLUE);
		else if(clr.equals("green") || clr.equals("GREEN")) g.setColor(Color.GREEN);
		else g.setColor(Color.BLACK);
		
		g.drawString(str,posX, 300);
	}
}

public class exp9_1{
	public static void main(String[] arg){
		
		MyFrame f = new MyFrame("Title - exp9-1");
		
		f.setSize(800, 800);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
	}
}