package swing;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Message {
    public static void main(String args[]){
        ImageIcon icon=new ImageIcon("E:\\AIUB\\Swing\\ty.png");

JOptionPane.showMessageDialog(null,"Wrong Password","Title",JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null,"Wrong Password","Title2",2,icon);

    }
}
