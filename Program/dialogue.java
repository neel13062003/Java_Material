import java.awt.*;
import java.awt.event.*;

class loginDialogueBox extends Dialog implements ActionListener{
	MyFrame f;
	Panel p;
	TextField tf1, tf2;
	Button submit;
	
	loginDialogueBox(MyFrame f, String t, boolean modal){
		super(f, t, modal);
		this.f = f;
		
		submit = new Button("Submit");
		p = new Panel();
		tf1 = new TextField(20);
		tf2 = new TextField(20);
		tf2.setEchoChar('*');
		p.add(tf1);
		p.add(tf2);
		
		submit.addActionListener(this);	
		
		add(p, BorderLayout.CENTER);
		add(submit, BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == submit){
			if(tf1.getText().trim().equals(f.usrname) &&
				tf2.getText().trim().equals(f.passwrd))
				{
					f.isLogin = true;					
					f.loginTo();
					dispose();
				}
				else {
					System.out.println("UnSuccessfull Login:)");
				}
		}
	}
}

class MyFrame extends Frame implements ActionListener{
	private Button login;
	TextArea ta;
	
	String usrname = "elon";
	String passwrd = "1234";
	
	boolean isLogin = false;
	loginDialogueBox ldb;
	
	public MyFrame(){
		
		ldb = new loginDialogueBox(this, "Login", false);
		ldb.setSize(300, 300);
		ldb.setVisible(false);
		ldb.setResizable(false);
		
		login = new Button("Login");
		ta = new TextArea(5,20);
		ta.setEditable(false);
		
		login.addActionListener(this);
		loginTo();
		add(ta);
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == login){
			System.out.println("Dialog Visible:)");
			ldb.setVisible(true);
		}
	}
	
	public void loginTo(){
		if(isLogin){
			ta.setText("Name : "+usrname+"\nPassword : "+passwrd);
			remove(login);
			return;
		}
		add(login);
	}
}

public class dialogue{
	public static void main(String[] arg){
		MyFrame f = new MyFrame();
		f.setVisible(true);
		f.setSize(700, 700);
		f.setLayout(new FlowLayout());
		//f.setResizable(false);
	}
}