import java.awt.*;
import java.awt.event.*;
class CardLayoutDemo extends Frame implements ActionListener, ItemListener{
    private CardLayout cardLayout=new CardLayout();
    private Panel cardPanel=new Panel();
    private TextField nameTF;
    private TextField rollNoTF;
    private TextField emailTF;
    private TextArea summaryTA;
    private Button firstBtn, nextBtn, previousBtn, lastBtn;
    private Choice cardSelectChoice;

    public CardLayoutDemo(){
        setTitle("Student Registration...");
        cardPanel.setLayout(cardLayout);

        Panel namePanel=new Panel();
        namePanel.add(new Label("Name:"));
        namePanel.add(nameTF=new TextField(30));

        Panel rollNoPanel=new Panel();
        rollNoPanel.add(new Label("Roll No:"));
        rollNoPanel.add(rollNoTF=new TextField(30));

        Panel emailPanel=new Panel();
        emailPanel.add(new Label("Email:"));
        emailPanel.add(emailTF=new TextField(30));

        summaryTA=new TextArea(5,30);

        cardPanel.add(namePanel,"1");
        cardPanel.add(rollNoPanel,"2");
        cardPanel.add(emailPanel,"3");
        cardPanel.add(summaryTA,"4");

        //Add buttons
        Panel buttonPanel=new Panel();
        buttonPanel.setLayout(new FlowLayout());

        buttonPanel.add(firstBtn=new Button("First"));
        buttonPanel.add(nextBtn=new Button("Next"));
        buttonPanel.add(previousBtn=new Button("Previous"));
        buttonPanel.add(lastBtn=new Button("Last"));
        buttonPanel.add(new Label("Page No."));
        buttonPanel.add(cardSelectChoice=new Choice());
        for(int i=1; i<=4;i++)
            cardSelectChoice.addItem(String.valueOf(i));


        setLayout(new BorderLayout());
        add("Center", cardPanel);
        add("South", buttonPanel);
        //Register listener
        firstBtn.addActionListener(this);
        nextBtn.addActionListener(this);
        previousBtn.addActionListener(this);
        lastBtn.addActionListener(this);
        cardSelectChoice.addItemListener(this);

        setSize(600,400);
        setVisible(true);
    }
    public static void main(String[] args){
        new CardLayoutDemo();
    }

    public void actionPerformed(ActionEvent e){
        prepareSummary();
        String command=e.getActionCommand();

        if("First".equals(command))          cardLayout.first(cardPanel);
        else if("Last".equals(command))      cardLayout.last(cardPanel);
        else if("Previous".equals(command))  cardLayout.previous(cardPanel);
        else if("Next".equals(command))      cardLayout.next(cardPanel);
    }

    public void itemStateChanged(ItemEvent e){
        prepareSummary();
        if(e.getSource() instanceof Choice)  cardLayout.show(cardPanel, (String)e.getItem());
    }
    private void prepareSummary(){
        summaryTA.setText("");
        summaryTA.append("Name : "+nameTF.getText()+"\n");
        summaryTA.append("Roll No : "+rollNoTF.getText()+"\n");
        summaryTA.append("Email : "+emailTF.getText()+"\n");
    }
}


