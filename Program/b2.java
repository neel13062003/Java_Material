import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

class MyFrame extends Frame{
	
	int angle = 90;
	double posX, posY;
	int radius, screenMiddle;
	
	MyFrame(String t){
		super(t);
		radius = 80;
		screenMiddle = 280;
		
		posX = 120.0;
		posY = 40.0;
		
		//posX = (radius * Math.cos(Math.toRadians(angle))) + screenMiddle;
		//posY = (radius * Math.sin(Math.toRadians(angle))) + screenMiddle;
		
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){

				angle = (angle - 10)%360;
				posX = (radius * Math.cos(Math.toRadians(angle)));
				posY = (radius * Math.sin(Math.toRadians(angle)));
				
				System.out.println("Deg : "+posX+", "+posY+", Radian : " + radius);
				repaint();
			}
		});
	}
	
	public void paint(Graphics g){
		g.drawOval(10+40, 40+40, 160, 160); // 220, 215
		g.drawOval((int)posX, (int)posY, 40, 40);
	}
}

public class b2{
	public static void main(String[] arg){
		MyFrame f = new MyFrame("2-Rolls");
		f.setVisible(true);
		f.setSize(600, 600);
		f.setLayout(new FlowLayout());
	}
}


/*if(pos){
	if(angle == 0){pos = false; neg = true;}
	else angle = (angle - 10) % 360;
}
if(neg){
	if(angle == 0){pos = true; neg = false;}
	else angle = (angle - 10) % -360;
}*/