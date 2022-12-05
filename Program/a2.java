import java.awt.*;


class MyFrame extends Frame{
	
	Panel p1,p2,p3,p4;
	Button[] b2 = new Button[12];
	Button[] b4 = new Button[3];
	
	MyFrame(String t){
		super(t);
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		
		//p2
		p2.setLayout(new GridLayout(3, 4));
		for(int i=0; i<12; i++){
			b2[i] = new Button("OK");
			p2.add(b2[i]);
		}
		
		//p4
		p4.setLayout(new GridLayout(1, 3));
		for(int i=0; i<3; i++){
			b4[i] = new Button("OK");
			p4.add(b4[i]);
		}
		
		//p1 & p3
		p1.setLayout(new GridLayout(1,1));
		p3.setLayout(new GridLayout(1,1));
		
		p1.add(new Button("OK"));
		p3.add(new Button("OK"));
		
		add(p1, BorderLayout.WEST);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.EAST);
		add(p4, BorderLayout.SOUTH);
	}
}

public class a2{
	public static void main(String[] arg){
		MyFrame f = new MyFrame("GridLayout");
		f.setVisible(true);
		f.setSize(500, 500);
	}
}