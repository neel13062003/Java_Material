import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

//<APPLET CODE="b3OR.class" HEIGHT="500" WIDTH="500"></APPLET>

public class b3OR extends Applet implements ActionListener{
	
	Label name, gender, sem, intrest;
	TextField tf_name;
	Checkbox male, female;
	CheckboxGroup cbg;
	Choice dropbox;
	List selectList;
	TextArea result;
	Button ok;
	Panel p1, p2, p3, p4, p5, p6;
	
	public void init(){
		setLayout(new GridLayout(6,1));
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		p6 = new Panel();


		
		name = new Label("Name : ");
		tf_name = new TextField(30);

		gender = new Label("Gender : ");
		cbg = new CheckboxGroup();
		male = new Checkbox("Male", true, cbg);
		female = new Checkbox("Female", false, cbg);
		
		sem = new Label("Semester : ");
		dropbox = new Choice();
		dropbox.addItem("1");
		dropbox.addItem("2");
		dropbox.addItem("3");
		dropbox.addItem("4");
		dropbox.addItem("5");
		dropbox.addItem("6");
		dropbox.addItem("7");
		dropbox.addItem("8");
		dropbox.select(0);
		
		intrest = new Label("Intrest : ");
		selectList = new List(5, true);
		selectList.add("Programming");
		selectList.add("Hardware");
		selectList.add("Web Technologies");
		selectList.add("Software Design");
		selectList.add("Database and Analystic");
		
		ok = new Button("OK");
		
		result = new TextArea(100,200);
		result.setEditable(false);
		
		p1.add(name);
		p1.add(tf_name);
		add(p1);
		
		p2.add(gender);
		p2.add(male);
		p2.add(female);
		add(p2);
		
		p3.add(sem);
		p3.add(dropbox);
		add(p3);
		
		p4.add(intrest);
		p4.add(selectList);
		add(p4);
		
		p5.add(ok);
		add(p5);
		
		p6.add(result);
		add(p6);
		
		ok.addActionListener(this);
		
		//setLayout
		p1.setLayout(flow);
		p2.setLayout(flow);
		p3.setLayout(flow);
		p4.setLayout(flow);
		p5.setLayout(flow);
		p6.setLayout(flow);
	}
	
	public void allClear(){
		tf_name.setText("");
		
		male.setState(false);
		female.setState(false);
		
		dropbox.select(0);
		
		for(int i=0; i<selectList.countItems(); i++)
			if(selectList.isIndexSelected(i))
				selectList.deselect(i);
	}
	
	public void actionPerformed(ActionEvent ae){
		String str = "";
		if(ae.getSource() == ok){
			str = "Name : "+tf_name.getText().trim();
			
			str += "\nGender : ";
			str +=(male.getState())? male.getLabel() : female.getLabel();
			
			str += "\nSemester : "+dropbox.getSelectedItem();
			result.append(str);
			
			String[] SelectedItems = selectList.getSelectedItems();
			str += "\nIntrest : ";
			
			int size = SelectedItems.length;
			for(int i=0; i<size; i++){
				str += SelectedItems[i];
				if(i != size - 1)
					str +=", ";
			}
			System.out.println(str);
			result.setText(str);
			
			allClear();
		}
	}
}