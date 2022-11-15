import java.awt.Frame;
import java.awt.FlowLayout;

import java.awt.TextField;
import java.awt.Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.lang.Exception;
import java.lang.Math;

class MyFrame extends Frame {
	int[] arr = new int[100];
	Button show;
	TextField input, output;

	MyFrame(String t) {
		super(t);
		for (int i = 0; i < 100; i++)
			arr[i] = (int) (Math.random() * (1e6 - 1e4)) + 10000;
		// int r = (int) (Math.random() * (upper - lower)) + lower;

		show = new Button("show");

		input = new TextField(20);
		output = new TextField(20);
		output.setEditable(false);

		show.addActionListener(new Helper());

		this.setLayout(new FlowLayout());
		this.add(show);
		this.add(input);
		this.add(output);
	}

	class Helper implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if (input.getText().equals("")) {
				input.setText("Enter Proper Number : ");
				return;
			}
			try {
				int indx = Integer.parseInt(input.getText().trim());
				int value = arr[indx];
				output.setText(value + "");
			} catch (Exception e) {
				output.setText("Out Of Bounds");
				input.setText("");
			}
		}
	}

}

public class exp8_2 {
	public static void main(String arg[]) {
		MyFrame f = new MyFrame("Random Access Indx of an Array");
		f.setVisible(true);
		f.setSize(500, 500);
	}
}