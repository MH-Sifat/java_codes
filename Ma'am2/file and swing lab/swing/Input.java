package swing;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Input {
    public static void main(String args[]){
        String f_name=JOptionPane.showInputDialog(null,"Enter your first name");
        String l_name=JOptionPane.showInputDialog(null,"Enter your last name");
        String name=f_name+" "+l_name;
        JOptionPane.showMessageDialog(null,name);

}}
