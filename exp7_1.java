import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
	MenuBar mb;
	Menu lights;
	MenuItem red, green, yellow;
	Object Source;

	MyFrame(String title) {
		super(title);
		this.setLayout(new FlowLayout());

		mb = new MenuBar();
		lights = new Menu("lights");

		red = new MenuItem("red");
		green = new MenuItem("green");
		yellow = new MenuItem("yellow");

		// registration
		Helper h = new Helper();
		red.addActionListener(h);
		green.addActionListener(h);
		yellow.addActionListener(h);

		// add & set them
		lights.add(red);
		lights.add(green);
		lights.add(yellow);

		mb.add(lights);

		this.setMenuBar(mb);
		repaint(); // repaint
	}

	public void paint(Graphics g) {

		if (Source == red) {
			g.setColor(Color.RED);
			g.fillOval(400, 80, 50, 50);
		} else {
			g.setColor(Color.BLACK);
			g.drawOval(400, 80, 50, 50);
		}

		if (Source == green) {
			g.setColor(Color.GREEN);
			g.fillOval(400, 140, 50, 50);
		} else {
			g.setColor(Color.BLACK);
			g.drawOval(400, 140, 50, 50);
		}

		if (Source == yellow) {
			g.setColor(Color.YELLOW);
			g.fillOval(400, 200, 50, 50);
		} else {
			g.setColor(Color.BLACK);
			g.drawOval(400, 200, 50, 50);
		}
	}

	class Helper implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
			Source = ae.getSource();
			repaint();
		}
	}
};

public class exp7_1 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame("Traffic Lights");
		f.setVisible(true);
		f.setSize(600, 800);
	}
};