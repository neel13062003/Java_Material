import java.awt.*;
import java.awt.event.*;

public class multable_frame extends Frame implements ActionListener {
    int m[] = new int[11];
    private TextField tf;
    private Button show;
    int a, i;

    public static void main(String args[]) {
        Frame f = new multable_frame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setTitle("Multiplication Table");
    }

   multable_frame() {
        Panel p1 = new Panel();
        Label l1 = new Label("Enter Number : ", Label.LEFT);
        setLayout(new FlowLayout());
        tf = new TextField(5);
        p1.add(l1);
        p1.add(tf);
        p1.setLayout(new FlowLayout());
        add(p1);

        Panel p2 = new Panel();
        p2.add(show = new Button("Show Table"));
        add(p2);
        show.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = e.getActionCommand();
        if ("Show Table".equals(s1)) {
            a = Integer.parseInt(tf.getText());
            int b = 1;
            for (i = 1; i <= 10; i++, b++) {
                m[i] = a * b;
            }
            i = 1;
            repaint();
        }
    }

    public void paint(Graphics g) {
        if (i == 1) {
            int x = 150, y = 150, k = 1;
            g.drawString("Multiplication Table Is : ", 150, 130);
            g.setColor(Color.red);
            for (int j = 1; j <= 10; j++, k++) {
                g.drawString(a + "X" + k + "=" + m[j], x, y);
                y = y + 20;
            }
        }
    }
}