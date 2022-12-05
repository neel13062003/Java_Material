import java.awt.*;
import java.awt.event.*;

class MyCanvas extends Canvas{
	
	private int mid = 300, radius = 20;
	private int posX, posY;
	String btnLabel;

	
	MyCanvas(){
		mid = 300;
		radius = 20;
		posX = mid - radius;
		posY = mid - radius;
		btnLabel = "";
		
		this.addKeyListener(new KeyAdapter(){
		
			public void keyPressed(KeyEvent ke){
				//System.out.println("Pressed");
				if(ke.getKeyCode() == KeyEvent.VK_RIGHT) posX += 10;
				else if(ke.getKeyCode() == KeyEvent.VK_LEFT) posX -= 10;
				else if(ke.getKeyCode() == KeyEvent.VK_DOWN) posY += 10;
				else if(ke.getKeyCode() == KeyEvent.VK_UP) posY -= 10;
				
				repaint();
			}
		});
	}
	
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(posX, posY, 40, 40);
		
		if(btnLabel.equals("circle"))
			g.fillOval(posX, posY, 40, 40);
		else if(btnLabel.equals("square"))
			g.fillRect(posX, posY, 40, 40);
		
		System.out.println(posX + " : " + posY);
	}
}


class MyFrame extends Frame {

	Button circle, square;
	Panel p;
	MyCanvas mc;
	
	MyFrame(String t){
		super(t);
		
		p = new Panel();
		circle = new Button("Circle");
		square = new Button("Square");
		p.add(square);
		p.add(circle);
		
		circle.addActionListener(new Helper());
		square.addActionListener(new Helper());
		
		mc = new MyCanvas();
		mc.setBackground(Color.YELLOW);
		
		add(p, BorderLayout.SOUTH);
		add(mc, BorderLayout.CENTER);
	}

	
	class Helper implements ActionListener{
		
		public void actionPerformed(ActionEvent ae){
			if(ae.getSource() == circle) mc.btnLabel = "circle";
			else if(ae.getSource() == square) mc.btnLabel = "square";
			
			mc.repaint();
		}
	}

}

public class b3{
	public static void main(String[] arg){
		MyFrame f = new MyFrame("2-Rolls");
		f.setVisible(true);
		f.setSize(600, 600);
		//f.setLayout(new FlowLayout());
	}
}
