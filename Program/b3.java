import java.awt.*;

class MyFrame extends Frame{
	
	GridBagLayout gb;
	GridBagConstraints gbc;
	Button[] b = new Button[6];
	
	MyFrame(String t){
		super(t);
		gb = new GridBagLayout();
		setLayout(gb);
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		
		for(int i=0; i<b.length; i++){
			b[i] = new Button((i+1)+"");
		}
		
		//addComponents(component, col, row, width, height);
		addComponents(b[0],0,0,3,1);
		addComponents(b[1],3,0,1,2);
		
		addComponents(b[2],1,2,3,1);
		addComponents(b[3],0,1,1,2);
		
		addComponents(b[4],1,1,1,1);
		addComponents(b[5],2,1,1,1);
	}
	public void addComponents(Component c, int x, int y, int width, int height){
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		add(c, gbc);
	}
}

public class b3{
	public static void main(String[] arg){
		MyFrame f = new MyFrame("Sessional-3");
		f.setVisible(true);
		f.setSize(600, 600);
	}
}