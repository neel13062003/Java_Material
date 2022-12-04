import java.awt.*;
import java.awt.event.*;

class gui_calc extends Frame implements ActionListener {
    private Button addbt, subbt, mulbt, divbt, clobt;
    private TextField tf1, tf2, tf3;

    public static void main(String args[]) {
        Frame f = new gui_calc();
        f.pack();
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    gui_calc() {
        setTitle("Simple Calculator");
        Panel p1 = new Panel();
        p1.setLayout(new FlowLayout());
        p1.add(new Label("Enter First Number : "));
        p1.add(tf1 = new TextField(" ", 3));

        Panel p2 = new Panel();
        p2.add(new Label("Enter Second Number : "));
        p2.add(tf2 = new TextField(" ", 3));

        Panel p3 = new Panel();
        p3.add(new Label("Result : "));
        p3.add(tf3 = new TextField(" ", 18));
        tf3.setEditable(false);

        Panel p4 = new Panel();
        p4.setLayout(new FlowLayout());
        p4.add(addbt = new Button("Addition"));
        p4.add(subbt = new Button("Subtraction"));
        p4.add(mulbt = new Button("Multiplication"));
        p4.add(divbt = new Button("Division"));
        p4.add(clobt = new Button("Close"));

        setLayout(new GridLayout(4, 1, 2, 2));
        add(p1);
        add(p2);
        add(p3);
        add(p4);

        addbt.addActionListener(this);
        subbt.addActionListener(this);
        mulbt.addActionListener(this);
        divbt.addActionListener(this);
        clobt.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String s1 = e.getActionCommand();
        if (e.getSource() instanceof Button) {
            if ("Addition".equals(s1)) {
                Double n1 = (Double.parseDouble(tf1.getText().trim()));
                Double n2 = (Double.parseDouble(tf2.getText().trim()));
                Double n3 = n1 + n2;
                tf3.setText(String.valueOf(n3));
            }
            if ("Subtraction".equals(s1)) {
                Double n1 = (Double.parseDouble(tf1.getText().trim()));
                Double n2 = (Double.parseDouble(tf2.getText().trim()));
                Double n3 = n1 - n2;
                tf3.setText(String.valueOf(n3));
            }
            if ("Multiplication".equals(s1)) {
                Double n1 = (Double.parseDouble(tf1.getText().trim()));
                Double n2 = (Double.parseDouble(tf2.getText().trim()));
                Double n3 = n1 * n2;
                tf3.setText(String.valueOf(n3));
            }
            if ("Division".equals(s1)) {
                Double n1 = (Double.parseDouble(tf1.getText().trim()));
                Double n2 = (Double.parseDouble(tf2.getText().trim()));
                if (n2 == 0) {
                    tf3.setText("Cannot Divide By Zero");
                } else {
                    Double n3 = n1 / n2;
                    tf3.setText(String.valueOf(n3));
                }
            }
            if ("Close".equals(s1)) {
                System.exit(0);
            }
        }
    }

}