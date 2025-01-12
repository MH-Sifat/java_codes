package swingV; import javax.swing.*; import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
// form options / clickable options
public class radiobtn {

JFrame ft=new JFrame();
radiobtn(){
JRadioButton rt1=new JRadioButton("i) Dhaka");
JRadioButton rt2=new JRadioButton("ii) Comilla");
rt1.setBounds(80,50,100,50);
rt2.setBounds(80,100,100,50);
ButtonGroup bg=new ButtonGroup();
bg.add(rt1); bg.add(rt2);
ft.add(rt1); ft.add(rt2);
    ft.setLayout(null);
    ft.setSize(200,300);
    ft.setVisible(true);

} public static void main(String[] args) { new radiobtn();

    }
}
