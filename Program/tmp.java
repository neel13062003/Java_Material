import java.awt.*;

class MyFrame extends Frame{
	Button b;
	TextField tf;
	
	public MyFrame(){
		setLayout(null);

		b = new Button("button");
		tf = new TextField(30);
		
		b.setBounds(100, 100, 200, 100);
		tf.setBounds(100, 300, 300, 200);
		
		add(b);
		add(tf);
	}
}

public class tmp{
	public static void main(String[] arg){
		MyFrame f = new MyFrame();
		f.setVisible(true);
		f.setSize(600, 600);
		//f.setResizable(false);
	}
}