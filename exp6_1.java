import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
	TextField inp1, inp2, res;
	Button add, sub, mul, div;

	MyFrame() {
		super("User Calculator : ");
		this.setLayout(new FlowLayout());

		inp1 = new TextField(20);
		inp2 = new TextField(20);
		res = new TextField(20);

		add = new Button(" + ");
		sub = new Button(" - ");
		mul = new Button(" * ");
		div = new Button(" / ");

		// registration
		Helper h = new Helper();
		add.addActionListener(h);
		sub.addActionListener(h);
		mul.addActionListener(h);
		div.addActionListener(h);

		this.add(inp1);
		this.add(inp2);
		this.add(res);
		this.add(add);
		this.add(sub);
		this.add(mul);
		this.add(div);

	}

	class Helper implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if(inp1.getText().equals("") || inp2.getText().equals("") ){
				res.setText("please Enter valid Inputs");
				return;
			}
			
			int n1 = Integer.parseInt(inp1.getText());
			int n2 = Integer.parseInt(inp2.getText());
			
			if (ae.getSource() == add)
				res.setText("" + (n1 + n2));
			else if (ae.getSource() == sub)
				res.setText("" + (n1 - n2));
			else if (ae.getSource() == mul)
				res.setText("" + (n1 * n2));
			else if (ae.getSource() == div)
				res.setText("" + (n1 / n2));
			
			inp1.setText("");
			inp2.setText("");
		}
	}
}

public class exp6_1 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		f.setSize(600, 500);
		f.setVisible(true);
	}
}
