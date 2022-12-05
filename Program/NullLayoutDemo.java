import java.awt.*;
import java.awt.event.*;
class NullLayoutDemo extends Frame implements ActionListener{
    private Label nameLbl;
    private TextField nameTF;
    private Label semLbl;
    private TextField semTF;
    private Label rollNoLbl;
    private TextField rollNoTF;
    private Label emailLbl;
    private TextField emailTF;
    private Button okBtn;
    private TextArea summaryTA;

    public NullLayoutDemo(){                                                                // void setBounds(int x, int y, int width, int height)
        setTitle("Null Layout: Student Registration Form");
        setLayout(null);

        nameLbl=new Label("Name:");
        nameTF=new TextField();
        add(nameLbl);
        add(nameTF);
        nameLbl.setBounds(20,50,50,25);
        nameTF.setBounds(100,50,300,25);
       
        semLbl=new Label("Sem:");
        semTF=new TextField();
        add(semLbl);
        add(semTF);
        semLbl.setBounds(20,90,50,25);
        semTF.setBounds(100,90,50,25);

        rollNoLbl=new Label("Roll No:");
        rollNoTF=new TextField();
        add(rollNoLbl);
        add(rollNoTF);
        rollNoLbl.setBounds(200,90,50,25);
        rollNoTF.setBounds(270,90,50,25);


        emailLbl=new Label("Email:");
        emailTF=new TextField();
        add(emailLbl);
        add(emailTF);
        emailLbl.setBounds(20,130,50,25);
        emailTF.setBounds(100,130,250,25);


        okBtn=new Button("OK");
        add(okBtn);
        okBtn.setBounds(100,170,70,25);

        summaryTA=new TextArea();
        add(summaryTA);
        summaryTA.setBounds(20,250,300,200);
        //Register listener
        okBtn.addActionListener(this);
        setSize(600,500);
        setVisible(true);
    }        
    public static void main(String[] args){
            new NullLayoutDemo();
    }

    public void actionPerformed(ActionEvent e){
            String command=e.getActionCommand();
            if("OK".equals(command))
            prepareSummary();
    }
    private void prepareSummary(){
            summaryTA.setText("");
            summaryTA.append("Name : "+nameTF.getText()+"\n");
            summaryTA.append("Sem : "+semTF.getText()+"\n");
            summaryTA.append("Roll No : "+rollNoTF.getText()+"\n");
            summaryTA.append("Email : "+emailTF.getText()+"\n");
    }    
}
    