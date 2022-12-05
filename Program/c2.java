import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

class MyFrame extends Frame{
	
	Label l;
	MyFrame(String t){
		l = new Label("Welcome To Java");
		l.setForeground(Color.RED);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(l, gbc);
	}

}

public class c2{
	public static void main(String[] arg){
		MyFrame f = new MyFrame("2-Rolls");
		f.setVisible(true);
		f.setSize(600, 600);
	}
}
