import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyMouseMotion extends JFrame implements MouseMotionListener
{
    JButton bt;
    JLabel status;
    MyMouseMotion()
    {
        status = new JLabel("Started");
        addMouseMotionListener(this);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        add(status);


    }
    public void mouseMoved(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        status.setText("Mouse is at x:"+x+"y:"+y);
    }
    public void mouseDragged(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        status.setText("Mouse is at x:"+x+"y:"+y);
    }

    public static void main(String args[])
    {
        new MyMouseMotion();
    }

}
