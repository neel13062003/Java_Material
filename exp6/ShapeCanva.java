import java.awt.*;
import java.awt.event.*;

class Canva extends Canvas {
	private int i = 0;

	Canva() {

	}

	public void paint(Graphics g) {
		if (i == 1) {
			g.drawRect(50, 50, 75, 75);
		} else if (i == 2) {
			g.drawRect(40, 40, 90, 100);
		} else if (i == 3) {
			g.drawOval(60, 60, 65, 65);
		}
	}

	public void square() {
		i = 1;
		repaint();
	}

	public void rect() {
		i = 2;
		repaint();
	}

	public void circle() {
		i = 3;
		repaint();
	}
}

public class ShapeCanva extends Frame implements ItemListener {
	Canva c = new Canva();

	public static void main(String args[]) {
		Frame f = new ShapeCanva();
		f.setSize(500, 500);
		f.setVisible(true);
		f.setTitle("Canvas Program");
	}

	ShapeCanva() {
		c.setBackground(Color.gray);
		c.setForeground(Color.red);
		c.setSize(500, 300);
		add(c);

		Panel p1 = new Panel();
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("Square", cbg, false);
		Checkbox cb2 = new Checkbox("Rectangle", cbg, false);
		Checkbox cb3 = new Checkbox("Circle", cbg, false);

		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		add(p1);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getItem().equals("Square")) {
			c.square();
		} else if (e.getItem().equals("Rectangle")) {
			c.rect();
		} else {
			c.circle();
		}
	}
}