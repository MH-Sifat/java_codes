package swing;
import javax.swing.*; import java.awt.*; import java.awt.Font;
import java.awt.Color;
public class Testfield extends JFrame{
    private Container c; private Font f; Testfield(){ init();}
    public void init() { c = this.getContentPane();// this getter method to find colors
        c.setLayout(null); c.setBackground(Color.YELLOW);
        JTextField f1=new JTextField(); JTextField f2=new JTextField();
        f=new Font("Cambria",Font.BOLD,14);
        f1.setBounds(50,50,200,50); f1.setFont(f); f1.setHorizontalAlignment(JTextField.CENTER);
        f1.setForeground(Color.PINK);f1.setBackground(Color.BLUE);
        f2.setBounds(50,120,200,50); f2.setFont(f);f2.setHorizontalAlignment(JTextField.RIGHT);
        f2.setForeground(Color.PINK);f2.setBackground(Color.BLUE);
        c.add(f1);c.add(f2);}
    public static void main(String[] args) {
        Testfield t=new Testfield();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setBounds(100, 50, 500,400);
        t.setTitle("Text Tables are Turning");
        t.setVisible(true);}}
