import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
	
	TextField tf;
	GridBagLayout gb;
	GridBagConstraints gbc;
	
	MyFrame(String title){
		super(title);
		
		gb = new GridBagLayout();
		setLayout(gb);
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		
		tf = new TextField();
		addComponent(tf, gb, gbc, 0, 0, 6, 1);
		
		Button[] b = new Button[16];
		
		for(int i=1; i<=3; i++){ // b = 0 to 2
			b[i-1] = new Button(i+"");
			addComponent(b[i-1], gb, gbc, i-1, 1, 1,1);
		}
		for(int i=4; i<=6; i++){// b = 3 to 5
			b[i-1] = new Button(i+"");
			addComponent(b[i-1], gb, gbc, i-4, 2, 1,1);
		}
		for(int i=7; i<=9; i++){ // b = 6 to 8
			b[i-1] = new Button(i+"");
			addComponent(b[i-1], gb, gbc, i-7, 3, 1,1);
		}
		int j = 9;
		addComponent(b[j++] = new Button("0"),gb,gbc,4,1,1,1);
		addComponent(b[j++] = new Button("+"),gb,gbc,4,2,1,1);
		addComponent(b[j++] = new Button("-"),gb,gbc,4,3,1,1);
		addComponent(b[j++] = new Button("*"),gb,gbc,5,1,1,1);
		addComponent(b[j++] = new Button("/"),gb,gbc,5,2,1,1);
		addComponent(b[j++] = new Button("="),gb,gbc,5,3,1,1);
		addComponent(b[j++] = new Button("CE"),gb,gbc,0,4,6,1);
		
		for(int i=0; i<b.length ; i++)
			b[i].addActionListener(new Helper());
	}
	
	public void addComponent(Component c, GridBagLayout gb, GridBagConstraints gbc, int x, int y, int width, int height){
		/*
		x = col, y = row, width = width of c , height = height of c
		*/
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gb.setConstraints(c, gbc);
		add(c);
	}
	
	String  op1="", op2="", operator="";
	Boolean flag = false;
	class Helper implements ActionListener{

		public void actionPerformed(ActionEvent ae){
			String actnLabel = ae.getActionCommand();
			
			if(flag) allReset();
			
			if(actnLabel.equals("CE")) allReset();
			else if(actnLabel.equals("+") || actnLabel.equals("-") || actnLabel.equals("*") || actnLabel.equals("/")){
				operator = actnLabel;
				tf.setText(tf.getText()+actnLabel);
			}
			else if(actnLabel.equals("=")){
				double n1 = Double.parseDouble(op1.trim());
				int n2 = Integer.parseInt(op2.trim());
				flag = true;
				
				if(operator.equals("+"))
					tf.setText((n1+n2)+"");
				else if(operator.equals("-"))
					tf.setText((n1-n2)+"");
				else if(operator.equals("*"))
					tf.setText((n1*n2)+"");
				else if(operator.equals("/"))
					tf.setText((n1/n2)+"");
			}
			else{
				String updateContent = tf.getText()+actnLabel;
				tf.setText(updateContent);
				
				if(operator.equals("")) op1 += actnLabel;
				else op2 += actnLabel;
				
				System.out.println(op1+" : "+op2);
			}
		}
		
		public void allReset(){
			op1 = op2 = operator = "";
			tf.setText("");	
			flag = false;
		}
	}
};

public class exp7_2{
	public static void main(String[] args){
		MyFrame f = new MyFrame("GridBagLayout- Calculator");
		f.setVisible(true);
		f.setSize(600, 800);
	}
};