package swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
public class label extends JFrame{
    private Container d;
    private JLabel user;
    private JLabel pass;
    private Font ft;
    label(){ init();}
    public void init(){
        d=this.getContentPane(); //bg color
        d.setLayout(null);
        d.setBackground(Color.YELLOW);// pink
        ft=new Font("Times new roman",Font.BOLD,12);
        user=new JLabel();
        user.setText("Enter your username");
        user.setBounds(50,20,150,60);
        user.setFont(ft);
        d.add(user);
        pass=new JLabel();
        pass.setText("Enter your password");
        pass.setBounds(50,90,150,60);
        pass.setFont(ft);
        d.add(pass); }
public static void main(String args[]){
        label frame=new label();
      frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,500,400);
        frame.setTitle("Frames with label");
    frame.setVisible(true);}}



