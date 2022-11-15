import java.awt.Frame;
import java.awt.FlowLayout;

import java.awt.Graphics;

class MyFrame extends Frame{
	MyFrame(String title){
		super(title);
	}
	
	public void paint(Graphics g){
		
		int X=0; // horizontal nubers
		for(int i=1; i<=10; i++, X+=50)
			g.drawString(i+"", 100+X, 50);
		
		int Y=0; // vertical numbers
		for(int i=1; i<=10; i++, Y+=50)
			g.drawString(i+"", 50, 100+Y);
		
		g.drawLine(0, 75, 1000, 75); // horozontal Line
		g.drawLine(75, 0, 75, 600); // Vertical Line
		
		Y=0;
		for(int i=1; i<=10; i++, Y+=50){
			X=0;
			for(int j=1; j<=10; j++, X+=50)
				g.drawString((i*j)+"", 100+X, 100+Y);
		}
	}
}

public class exp5_2{
	public static void main(String[] arg){
		MyFrame f = new MyFrame("Multiplication-table");
		f.setVisible(true);
		f.setSize(600,600);
		f.setLayout(new FlowLayout());
	}
};
