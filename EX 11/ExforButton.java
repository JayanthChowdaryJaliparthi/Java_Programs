import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ExforButton extends JFrame
{
    JRadioButton r1,r2;
    JButton b1;
    ExforButton()
    {
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        r1 =new JRadioButton("Male");
        r2 =new JRadioButton("Female");
        b1 =new JButton("click");  
        
       

        setLayout(new FlowLayout());
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);
        bg.add(r2);
        add (r1);
        add (r2);
        add (b1);

    }
    public static void main(String args[])
    {
        new ExforButton();
    }
}