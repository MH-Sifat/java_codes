package swing;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

public class frame2 extends JFrame{
    private Container c;
    frame2(){
        init();
    }
    public void init(){
        c=this.getContentPane();// this getter method to find colors
        c.setBackground(Color.YELLOW);
        JButton btn=new JButton();
        //btn.setBounds(200,100,100,40);
        add(btn);
        btn.setText("Click Button");

    }
    public static void main(String args[])
    {    frame2 frame=new frame2();
        frame.setSize(200, 300);
        frame.setLocation(200,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Demo Frame");
        frame.setResizable(false);
        frame.setVisible(true);

}}
