import java.awt.*;

import java.awt.event.*;
import java.io.*;

class NotePad extends Frame implements ActionListener, WindowListener {
    static Frame p;
    TextArea ta;
    BufferedReader br;
    FileInputStream fin;
    String path;
    int i = 0;

    NotePad() {
        setSize(800, 600);
        setVisible(true);
        setTitle("NotePad");
        ta = new TextArea();

        MenuBar m = new MenuBar();

        Menu c = new Menu("Edit");
        Menu a = new Menu("File");

        MenuItem an = new MenuItem("New");
        MenuItem a2 = new MenuItem("Save");
        MenuItem a3 = new MenuItem("Save As");
        MenuItem a1 = new MenuItem("Open");
        MenuItem ae = new MenuItem("Exit");

        an.addActionListener(this);
        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        ae.addActionListener(this);

        m.add(a);
        a.add(an);
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(ae);
        m.add(c);

        add(ta);
        setMenuBar(m);
        addWindowListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("New")) {
            NotePad m = new NotePad();
        } else if (e.getActionCommand().equals("Open")) {

            FileDialog fd = new FileDialog(p, "Open", FileDialog.LOAD);
            fd.setVisible(true);
            String s = fd.getFile();
            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader(s));
                path = br.readLine();
                boolean fl = true;
                while (br != null) {
                    if (fl) {
                        fl = false;
                        ta.append(path);
                    } else {
                        ta.append("\n" + path);
                    }
                    path = br.readLine();
                    if (path == null)
                        break;
                }
            } catch (FileNotFoundException ef) {
            } catch (IOException eio) {
            }
        } else if (e.getActionCommand().equals("Save")) {

            FileDialog fd = new FileDialog(p, "Save", FileDialog.SAVE);
            fd.setVisible(true);
            System.out.println("file:-..." + fd.getFile());
            System.out.println("file:-..." + fd.getDirectory());
            try {
                FileWriter fw = new FileWriter("temp.txt", true);
                FileWriter(fd.getDirectory() + fd.getFile(), true);
                fw.write(ta.getText());
                fw.close();
            } catch (Exception ep) {
                System.out.println(ep);
            }
            System.out.println("Success...");
        } else if (e.getActionCommand().equals("Save As")) {

            FileDialog fd = new FileDialog(p, "Save", FileDialog.SAVE);
            fd.setVisible(true);
            System.out.println("file:-..." + fd.getFile());
            System.out.println("file:-..." + fd.getDirectory());
            try {
                FileWriter fw = new FileWriter(fd.getDirectory() + fd.getFile());
                fw.write(ta.getText());
            } catch (Exception ep) {
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

    public static void main(String a[]) {
        NotePad m = new NotePad();
    }
}