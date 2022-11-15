import java.lang.Math;
import java.io.File;

import java.awt.Frame;
import java.awt.FlowLayout;

import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;

/*
	For Notepad like application create one menubar which contains different menus for 
	opening a file, creating a new file, deleting a file, to copy file etc. Create one file and one 
	frame. When user selects particular menu item like opening a file then file contents should 
	be displayed in the frame
*/
class MyFrame extends Frame{
	MenuBar mb ;
	Menu open, create, delete, copy;
	
	MyFrame(String t){
		super(t);
	
		File f = new File("./");
		File[] listOfFiles = f.listFiles();
		int n = listOfFiles.length;
		
		mb = new MenuBar();
		file = new Menu("File");
		MenuItem[] fileMenuItem = new MenuItem[n];
		
		for(int i = 0;i<n; i++){
			Menu[i] = new 
		}
		
		this.setMenuBar(mb);
	}
	
}

public class exp10{
	public static void main(String[] arg){
		MyFrame f = new MyFrame("Notepad");
		f.setVisible(true);
		f.setSize(800, 600);
		f.setLayout(new FlowLayout());
	}
}