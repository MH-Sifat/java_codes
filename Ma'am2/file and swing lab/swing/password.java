package swing;
import javax.swing.JPasswordField; import javax.swing.JTextField;
import javax.swing.*; import java.awt.*; import java.awt.Font; import java.awt.Cursor;
import java.awt.Color;
public class password extends JFrame{
    private Container c; private Font f; password(){ init();}
    public void init() { c = this.getContentPane();// this getter method to find colors
        c.setLayout(null); c.setBackground(Color.YELLOW);
      JPasswordField p1=new JPasswordField();
        f=new Font("Cambria",Font.BOLD,25);
       p1.setEchoChar('*');
        p1.setBounds(100,50,200,70);p1.setFont(f);
        p1.setForeground(Color.PINK);p1.setBackground(Color.BLUE); c.add(p1);}
    public static void main(String[] args) {
       password t=new password();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setBounds(100, 50, 500,400);
        t.setTitle("Text Tables are Turning"); t.setVisible(true);}}