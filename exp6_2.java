import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
	Button rectangle, circle, oval;
	Panel btnPnl;
	MyCanvas mc;
	MyFrame(){
		super("My Canvas : ");
		
		// BUTTON
		rectangle = new Button("rectangle");
		circle = new Button("circle");
		oval = new Button("oval");
		
		btnPnl = new Panel();
		btnPnl.add(rectangle);
		btnPnl.add(oval);
		btnPnl.add(circle);
		
		//canvas
		mc = new MyCanvas();
		
		// Registartion
		rectangle.addActionListener(this);
		circle.addActionListener(this);
		oval.addActionListener(this);
		
		this.add(btnPnl, BorderLayout.SOUTH);
		this.add(mc, BorderLayout.CENTER);
		
	}
	public void actionPerformed(ActionEvent ae){
		mc.drawShape(ae.getActionCommand());
		mc.repaint();
	}
}

class MyCanvas extends Canvas {
	private String shape = "";
	MyCanvas(){
		//this.setBackground(Color.red);
		this.setSize(600,300);
	}
	public void paint(Graphics g) {
		if(shape.equals("rectangle")) g.drawRect(10, 10, 500, 300);
		else if(shape.equals("oval")) g.drawOval(10,10, 500, 300);
		else if(shape.equals("circle")) g.drawOval(10, 10, 250, 250);
	}
	public void drawShape(String action){
		if(action.equals("rectangle")) shape = "rectangle";
		if(action.equals("circle")) shape = "circle";
		if(action.equals("oval")) shape = "oval";
	}
}

class exp6_2{
	public static void main(String[] args){
		MyFrame f = new MyFrame();
		f.setVisible(true);
		f.setSize(900, 500);
	}
}