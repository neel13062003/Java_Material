import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<APPLET CODE ="exp8_1.class" WIDTH="500" HEIGHT="400"></APPLET>
*/

public class exp8_1 extends Applet {
	int x, y, indx = 0;
	Point[] p = new Point[10000];

	public void init() {
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent me) {
				x = me.getX();
				y = me.getY();
				p[indx] = new Point(x, y);
				indx++;
				repaint();
			}
		});
	}

	public void paint(Graphics g) {
		if (indx > 0)
			for (int i = 0; i < indx; i++)
				g.drawRect((int) p[i].getX(), (int) p[i].getY(), 1, 1);
	}
}