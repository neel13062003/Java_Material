import java.awt.*;
import java.awt.event.*;

public class Signals extends Frame implements ItemListener {
    String msg = "";

    Signals() {

        setTitle("Traffic Signal Program");
        setSize(500, 500);
        setVisible(true);

        Checkbox stop, ready, go;
        CheckboxGroup cbg = new CheckboxGroup();
        stop = new Checkbox("Stop", cbg, false);
        ready = new Checkbox("Ready", cbg, false);
        go = new Checkbox("Go", cbg, false);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(stop);
        add(go);
        add(ready);
        stop.addItemListener(this);
        ready.addItemListener(this);
        go.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        Frame f = new Signals();
    }

    public void itemStateChanged(ItemEvent ie) {
        msg = (ie.getItem()).toString();
        repaint();
    }

    public void paint(Graphics g) {

        g.drawString("Traffic signals", 200, 250);
        g.drawOval(200, 300, 50, 50);
        g.drawOval(200, 400, 50, 50);
        g.drawOval(200, 500, 50, 50);
        g.drawRect(180, 200, 100, 400);

        if (msg.equals("Stop")) {
            g.setColor(Color.red);
            g.fillOval(200, 300, 50, 50);
        } else if (msg.equals("Ready")) {
            g.setColor(Color.yellow);
            g.fillOval(200, 500, 50, 50);
        } else {
            g.setColor(Color.green);
            g.fillOval(200, 400, 50, 50);
        }
    }
}