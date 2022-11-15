import java.applet.Applet;

import java.awt.Button;
import java.awt.Panel;
import java.awt.TextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*<APPLET CODE="exp12.class" HEIGHT="500" WIDTH="500"></APPLET>*/

public class exp12 extends Applet implements ActionListener{
	Panel gameInterFace;
	TextField head,result;
	
	Button[] btn = new Button[9];
	boolean turnX = true, turnO = false;
	
	public void init(){
		head = new TextField("TIC - TAC - TOE");
		result = new TextField(20);

		gameInterFace = new Panel();
		gameInterFace.setLayout(new GridLayout(3,3));
		
		for(int i = 0; i<9; i++) {
			btn[i] = new Button();
			btn[i].setBackground(Color.white);
			btn[i].setFont(new Font("Consolas", Font.BOLD, 50));
			
			gameInterFace.add(btn[i]);
			btn[i].addActionListener(this);
		}
	
		head.setEditable(false);
		head.setBackground(Color.white);
		head.setForeground(Color.BLUE);
		head.setFont(new Font("Consolas", Font.BOLD, 30));	
		
		result.setEditable(false);
		result.setBackground(Color.white);
		result.setFont(new Font("Consolas", Font.BOLD, 50));
		
		this.setLayout(new BorderLayout());
		this.add(gameInterFace, BorderLayout.CENTER);
		this.add(result, BorderLayout.SOUTH);
		this.add(head, BorderLayout.NORTH);
	}
	
	public void allClear(){
		for(int i=0; i<9; i++) btn[i].setLabel("");
		for(int i=0; i<9; i++) btn[i].setBackground(Color.white);
	}
	
	public void annoucement(String str){
		if(str.equals("Match is Tied:)")) result.setText("Match is Tied:)");
		else result.setText("winner is : "+str);
		allClear();
		return;
	}
	
	public void actionPerformed(ActionEvent ae){
		for(int i = 0; i<9; i++){
			if(ae.getSource() == btn[i]){
				if(turnX){
					btn[i].setLabel("X");
					btn[i].setBackground(Color.red);
					turnX = false; turnO = true;
				}
				else{
					btn[i].setLabel("O");
					btn[i].setBackground(Color.green);
					turnO = false; turnX = true;
				}
				break;
			}
		}
		
		boolean flag=false;
		for(int i = 0; i<9; i++) if(btn[i].getLabel().equals("")) {flag = true; break;} // check are all boxes filled out ?
		if(!flag) annoucement("Match is Tied:)");
		
		if(
			(
				btn[2].getLabel().equals("X") && 
				btn[4].getLabel().equals("X") &&
				btn[6].getLabel().equals("X")
			)||
			(
				btn[0].getLabel().equals("X") && 
				btn[4].getLabel().equals("X") &&
				btn[8].getLabel().equals("X")
			)
		) annoucement("X");
		else if(
			(
				btn[2].getLabel().equals("O") && 
				btn[4].getLabel().equals("O") &&
				btn[6].getLabel().equals("O")
			)||
			(
				btn[0].getLabel().equals("O") && 
				btn[4].getLabel().equals("O") &&
				btn[8].getLabel().equals("O")
			)
		) annoucement("O");
		else{
			for(int i=0;i<9; i+=3){
				if(
					btn[i].getLabel().equals("X") && 
					btn[i+1].getLabel().equals("X") &&
					btn[i+2].getLabel().equals("X")
				)annoucement("X");
				
				if(
					btn[i].getLabel().equals("O") && 
					btn[i+1].getLabel().equals("O") &&
					btn[i+2].getLabel().equals("O")
				)annoucement("O");
			}
			for(int i=0; i<3; i++){
				if(
					btn[i].getLabel().equals("X") && 
					btn[i+3].getLabel().equals("X") &&
					btn[i+6].getLabel().equals("X")
				)annoucement("X");
				
				if(
					btn[i].getLabel().equals("O") && 
					btn[i+3].getLabel().equals("O") &&
					btn[i+6].getLabel().equals("O")
				)annoucement("O");
			}
		}
	}
}