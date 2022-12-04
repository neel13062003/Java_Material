import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MvBanner extends Frame implements Runnable,ActionListener
{
	
	Button b;
	TextField tf1;
	TextField tf2;
	TextField tf3;
	Label l1;
	Label l2;
	Label l3;
	Choice c;
	Thread t;
	String msg="";
	String col="";
	int x=200;
	int y=200;
	int z=0;
	public static void main(String[] args)
	{
		MvBanner f=new MvBanner("MOVING BANNER");
	}
	MvBanner(String title)
	{
		super(title);
		t=new Thread(this,title);
		//container containing components
		Panel p=new Panel();
		tf1=new TextField(20);
		tf2=new TextField(10);
		tf3=new TextField(3);
		l1=new Label("Enter the String");
		l2=new Label("Color");
		l3=new Label("Size");
		Panel p2=new Panel();
		b=new Button("Start");
		c=new Choice();
		c.add("Right");
		c.add("Left");
		setLayout(new BorderLayout());
		p.add(l1);
		p.add(tf1);
		p.add(l2);
		p.add(tf2);
		p.add(l3);
		p.add(tf3);
		add("North",p);
		p2.add(b);
		p2.add(c);
		add("South",p2);
		setSize(800,400);
		setVisible(true);
		//setBackground(Color.white);
		b.setBackground(Color.gray);
		b.setForeground(Color.white);
		b.addActionListener(this);
		//closing the window
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		}
		);
	}
	public void run()
	{
		//Proper formatting of the movement of the banner.Handling exception
		try
		{
			while(true)
			{
				Thread.sleep(200);
				msg=tf1.getText();
				z=Integer.parseInt(tf3.getText());
				col=tf2.getText();
				if(c.getSelectedItem().equals("Left"))
				{
					x=x-20;
					if(x<(-100))
					x=800;
					repaint();
				}
				else
				{
					x=x+20;
					if(x>(800))
					x=0;
					repaint();
				}
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void paint(Graphics g)
	{
		//Changing the colour of the text as per user requirement
		Font f=new Font("Serif",Font.BOLD,z);
		g.setFont(f);
		if(col.equals("red"))
		setForeground(Color.red);
		else if(col.equalsIgnoreCase("blue"))
		setForeground(Color.blue);
		else if(col.equalsIgnoreCase("orange"))
		setForeground(Color.orange);
		else if(col.equalsIgnoreCase("cyan"))
		setForeground(Color.cyan);
		else if(col.equalsIgnoreCase("magenta"))
		setForeground(Color.magenta);
		else if(col.equalsIgnoreCase("yellow"))
		setForeground(Color.yellow);
		else
		setForeground(Color.black);
		g.drawString(msg,x,y);
	}
	public void actionPerformed(ActionEvent ae)
	{
		//Start button is pressed - start moving the banner
		String s=ae.getActionCommand();
		if(ae.getSource() instanceof Button) //if source of event is button the do the following
		{
			if(s.equals("Start"))
			t.start();
		}
	}
}
