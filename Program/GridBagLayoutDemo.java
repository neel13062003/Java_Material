import java.awt.*;
import java.awt.event.*;
class GridBagLayoutDemo extends Frame{
    private Label l;
    private TextArea ta1, ta2;
    private TextField tf;
    private Canvas c;
    private Button b1, b2;
    private GridBagLayout gbLayout;
    private GridBagConstraints gbConstraints;

    public static void main(String[] args){
        new GridBagLayoutDemo();
    }
    public void addComponent(Component c, GridBagLayout gbl,GridBagConstraints gbc, 
                             int row, int column, int numRows, int numColumns, int weightx, int weighty){
        gbc.gridx=column;
        gbc.gridy=row;
        gbc.gridwidth=numColumns;
        gbc.gridheight=numRows;
        gbc.weightx=weightx;
        gbc.weighty=weighty;
        gbl.setConstraints(c, gbc);
        add(c);
    }
    public GridBagLayoutDemo(){
        setTitle("GridBagLayout Demo...");
        l=new Label("Resize the Window and Study GridBagLayout", Label.CENTER); 
        c=new Canvas();
        ta1=new TextArea("Text Area ",5,15);
        ta2=new TextArea("Text Area ",5,15);
        tf=new TextField("TextField");
        b1=new Button("Cancel");
        b2=new Button("OK");
        //Create GridBagLayout and GridBagConstraints object
        gbLayout=new GridBagLayout();
        gbConstraints=new GridBagConstraints();
        setLayout(gbLayout);

        //place label to occupy row 0
        gbConstraints.fill=GridBagConstraints.BOTH;
        gbConstraints.anchor=GridBagConstraints.CENTER;
        addComponent(l, gbLayout,gbConstraints, 0, 0, 1, 4, 0, 0);
        //place text area 1 in row 1 and 2, and column 0
        addComponent(ta1, gbLayout, gbConstraints, 1, 0, 2, 1, 0,0);

        //place canvas in row 1 and 2, and column 1 and 2
        addComponent(c, gbLayout, gbConstraints, 1, 1, 2, 2, 100, 100);
        c.setBackground(Color.red);
        //place text area 2 in row 1, and column 3
        addComponent(ta2, gbLayout, gbConstraints, 1, 3, 1, 1, 0, 100);
        //place text field in row 2, and column 3
        addComponent(tf, gbLayout, gbConstraints, 2, 3, 1, 1, 0,0);

        //place button 1 in row 3, and column 1
        addComponent(b1, gbLayout, gbConstraints, 3, 1, 1, 1, 0,0);
        //place button 2 in row 3, and column 2
        addComponent(b2, gbLayout, gbConstraints, 3, 2, 1, 1, 0,0);
        setSize(400,400);
        setVisible(true); 
    }
} 

