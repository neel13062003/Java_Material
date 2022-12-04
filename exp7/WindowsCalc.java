import java.awt.*;
import java.awt.event.*;

public class WindowsCalc extends Frame implements ActionListener {
    private TextField tf;
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private GridBagLayout gbl;
    private GridBagConstraints gbcn;

    private int a;
    private Double n;
    private String s1, s2, s3, s4, s5;

    public static void main(String args[]) {
        Frame f = new WindowsCalc();
        f.setSize(300, 300);
        f.setVisible(true);
        f.setTitle("Windows Calculator");
    }

    public void addComp(Component c, GridBagLayout gbl, GridBagConstraints gbcn, int ro, int co, int nr, int nc, int wx,
            int wy) {
        gbcn.gridx = co;
        gbcn.gridy = ro;
        gbcn.gridwidth = nc;
        gbcn.gridheight = nr;
        gbcn.weightx = wx;
        gbcn.weighty = wy;

        gbl.setConstraints(c, gbcn);

        add(c);
    }

    public WindowsCalc() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        tf = new TextField("", 15);
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("+");
        b11 = new Button("-");
        b12 = new Button("*");
        b13 = new Button("/");
        b14 = new Button(".");
        b15 = new Button("=");
        b16 = new Button("C");

        gbl = new GridBagLayout();
        gbcn = new GridBagConstraints();
        setLayout(gbl);

        gbcn.fill = GridBagConstraints.BOTH;
        gbcn.anchor = GridBagConstraints.WEST;
        addComp(tf, gbl, gbcn, 0, 0, 1, 5, 0, 0);

        addComp(b16, gbl, gbcn, 1, 4, 4, 1, 0, 0);

        addComp(b7, gbl, gbcn, 1, 0, 1, 1, 0, 0);
        addComp(b8, gbl, gbcn, 1, 1, 1, 1, 0, 0);
        addComp(b9, gbl, gbcn, 1, 2, 1, 1, 0, 0);
        addComp(b10, gbl, gbcn, 1, 3, 1, 1, 0, 0);

        addComp(b4, gbl, gbcn, 2, 0, 1, 1, 0, 0);
        addComp(b5, gbl, gbcn, 2, 1, 1, 1, 0, 0);
        addComp(b6, gbl, gbcn, 2, 2, 1, 1, 0, 0);
        addComp(b11, gbl, gbcn, 2, 3, 1, 1, 0, 0);

        addComp(b1, gbl, gbcn, 3, 0, 1, 1, 0, 0);
        addComp(b2, gbl, gbcn, 3, 1, 1, 1, 0, 0);
        addComp(b3, gbl, gbcn, 3, 2, 1, 1, 0, 0);
        addComp(b12, gbl, gbcn, 3, 3, 1, 1, 0, 0);

        addComp(b0, gbl, gbcn, 4, 0, 1, 1, 0, 0);
        addComp(b14, gbl, gbcn, 4, 1, 1, 1, 0, 0);
        addComp(b15, gbl, gbcn, 4, 2, 1, 1, 0, 0);
        addComp(b13, gbl, gbcn, 4, 3, 1, 1, 0, 0);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            s1 = tf.getText();
            s2 = "0";
            s3 = s1 + s2;
            tf.setText(s3);
        }
        if (e.getSource() == b1) {
            s1 = tf.getText();
            s2 = "1";
            s3 = s1 + s2;
            tf.setText(s3);
        }
        if (e.getSource() == b2) {
            s1 = tf.getText();
            s2 = "2";
            s3 = s1 + s2;
            tf.setText(s3);
        }
        if (e.getSource() == b3) {
            s1 = tf.getText();
            s2 = "3";
            s3 = s1 + s2;
            tf.setText(s3);
        }
        if (e.getSource() == b4) {
            s1 = tf.getText();
            s2 = "4";
            s3 = s1 + s2;
            tf.setText(s3);
        }
        if (e.getSource() == b5) {
            s1 = tf.getText();
            s2 = "5";
            s3 = s1 + s2;
            tf.setText(s3);
        }
        if (e.getSource() == b6) {
            s1 = tf.getText();
            s2 = "6";
            s3 = s1 + s2;
            tf.setText(s3);
        }
        if (e.getSource() == b7) {
            s1 = tf.getText();
            s2 = "7";
            s3 = s1 + s2;
            tf.setText(s3);
        }
        if (e.getSource() == b8) {
            s1 = tf.getText();
            s2 = "8";
            s3 = s1 + s2;
            tf.setText(s3);
        }
        if (e.getSource() == b9) {
            s1 = tf.getText();
            s2 = "9";
            s3 = s1 + s2;
            tf.setText(s3);
        }
        if (e.getSource() == b14) {
            s1 = tf.getText();
            s2 = ".";
            s3 = s1 + s2;
            tf.setText(s3);
        }
        if (e.getSource() == b10) {
            s4 = tf.getText();
            tf.setText("");
            a = 1;
        }
        if (e.getSource() == b11) {
            s4 = tf.getText();
            tf.setText("");
            a = 2;
        }
        if (e.getSource() == b12) {
            s4 = tf.getText();
            tf.setText("");
            a = 3;
        }
        if (e.getSource() == b13) {
            s4 = tf.getText();
            tf.setText("");
            a = 4;
        }

        if (e.getSource() == b15) {
            s5 = tf.getText();
            if (a == 1) {
                n = Double.parseDouble(s4) + Double.parseDouble(s5);
                tf.setText(String.valueOf(n));
            }
            if (a == 2) {
                n = Double.parseDouble(s4) - Double.parseDouble(s5);
                tf.setText(String.valueOf(n));
            }
            if (a == 3) {
                n = Double.parseDouble(s4) * Double.parseDouble(s5);
                tf.setText(String.valueOf(n));
            }
            if (a == 4) {
                if ((Double.parseDouble(s5)) == 0) {
                    tf.setText("Cannot Divide By Zero");
                } else {
                    n = Double.parseDouble(s4) / Double.parseDouble(s5);
                    tf.setText(String.valueOf(n));
                }
            }
        }
        if (e.getSource() == b16) {
            tf.setText("");
        }
    }
}