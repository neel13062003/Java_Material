import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code = "FreeHandDrawingDemo" height="400" width="400">
</applet>
*/

public class FreeHandDrawingDemo extends Applet {
    public static void main(String s[]) {
        Frame f = new Frame("Mouse Event Demo");
        FreeHandDrawingDemo fhd = new FreeHandDrawingDemo();
        fhd.init();
        f.add("Center",fhd);
        f.setSize(400,400);
        f.setVisible(true);
    }


    public void init() {
        Canvas c = new PaintCanvas();
        c.setBackground(Color.white);
        setLayout(new BorderLayout());
        add("Center",c);
    }

    
}

class PaintCanvas extends Canvas implements MouseMotionListener,MouseListener {
    final int circlesize = 20;
    private Point lineStart = new Point(0,0);
    public PaintCanvas() {
        addMouseMotionListener(this);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {
        lineStart.move(e.getX(),e.getY());
    }
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        if(e.isMetaDown()) {
            g.setColor(getBackground());
            g.fillOval(e.getX() - (circlesize/2),e.getY() - (circlesize/2),circlesize,circlesize);
        } else {
            g.setColor(Color.black);
            g.drawLine(lineStart.x,lineStart.y,e.getX(),e.getY());
        }
        lineStart.move(e.getX(),e.getY());
    }
    public void mouseMoved(MouseEvent e) {

    }
    public void paint(Graphics g) {
        System.out.println("Print Called");
    }
}