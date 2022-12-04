import java.awt.event.*;
import java.awt.*;
import java.io.*;
		
class NotePad extends Frame implements ActionListener,WindowListener
{
	int i=0;
	TextArea ta;
	static Frame p;
	BufferedReader br;
	FileInputStream fin;
	String path;
	NotePad()
	{	
		setSize(800,600);
		setVisible(true);
		setTitle("NotePad");
		MenuBar m=new MenuBar();
		setMenuBar(m);
		
		Menu a=new Menu("File");
		m.add(a);
		MenuItem an=new MenuItem("New");
		an.addActionListener(this);
		a.add(an);
		MenuItem a1=new MenuItem("Open");
		a1.addActionListener(this);
		a.add(a1);
		MenuItem a2=new MenuItem("Save");
		a2.addActionListener(this);
		a.add(a2);
		MenuItem a3=new MenuItem("Save As");
		a3.addActionListener(this);
		a.add(a3);
		MenuItem ae=new MenuItem("Exit");
		ae.addActionListener(this);
		a.add(ae);
		
		Menu c=new Menu("Edit");
		m.add(c);
		MenuItem m21=new MenuItem("Cut");
		MenuItem m22=new MenuItem("Copy");
		MenuItem m23=new MenuItem("Paste");
		MenuItem m24=new MenuItem("Delete");
		c.add(m21);
		c.add(m22);
		c.add(m23);
		c.add(m24);
		m21.addActionListener(this);
		m22.addActionListener(this);
		m23.addActionListener(this);
		m24.addActionListener(this);
		
		
		ta=new TextArea();
		add(ta);
		addWindowListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("New"))
		{
			NotePad m=new NotePad(); 
		}
		else if(e.getActionCommand().equals("Open"))
		{
				FileDialog fd=new FileDialog(p,"Open",FileDialog.LOAD);
				fd.setVisible(true);
				String s=fd.getFile();
				BufferedReader br=null;
				try
				{
					br=new BufferedReader(new FileReader(s));
					path=br.readLine();
					boolean fl=true;
					while(br!=null)
					{
						if(fl)
						{
							fl=false;
							ta.append(path);
						}
						else
						{
							ta.append("\n"+path);
						}
						path=br.readLine();
						if(path == null)
							break;
					}
				}
				catch(FileNotFoundException ef)
				{
				}
				catch(IOException eio)
				{
				}
		}		
		else if(e.getActionCommand().equals("Save"))
		{			
				
				FileDialog fd=new FileDialog(p,"Save",FileDialog.SAVE);
				fd.setVisible(true);
				System.out.println("file:-..."+fd.getFile());        
				System.out.println("file:-..."+fd.getDirectory());        

				try{    
					FileWriter fw=new FileWriter(fd.getDirectory()+fd.getFile(),true);    
					fw.write(ta.getText());    
					fw.close();
				}
				catch(Exception ep)
				{
					System.out.println(ep);
				}    
				System.out.println("Success...");        

		}
		else if(e.getActionCommand().equals("Save As"))
		{
				FileDialog fd=new FileDialog(p,"Save",FileDialog.SAVE);
				fd.setVisible(true);
				System.out.println("file:-..."+fd.getFile());        
				System.out.println("file:-..."+fd.getDirectory());        

				try{    
					FileWriter fw=new FileWriter(fd.getDirectory()+fd.getFile());    
					fw.write(ta.getText());        
				}
				catch(Exception ep)
				{
					System.out.println(ep);
				}    
				System.out.println("Success...");        

		}	
	}
	public void windowActivated(WindowEvent arg0) {  
		}  
		public void windowClosed(WindowEvent arg0) {  
		}  
		public void windowClosing(WindowEvent arg0) {  
			System.out.println("closing");  
			dispose();  
		}  
		public void windowDeactivated(WindowEvent arg0) {  
		}  
		public void windowDeiconified(WindowEvent arg0) {  
		}  
		public void windowIconified(WindowEvent arg0) {  
		}  
		public void windowOpened(WindowEvent arg0) {  
		}
	
	public static void main(String a[])
	{
		NotePad m=new NotePad(); 
	}
}
