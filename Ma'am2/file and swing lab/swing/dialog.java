package swing;
import javax.swing.JOptionPane;
public class dialog{
    public static void main(String args[]){
        // number of parameters inside the method= 2, 4,5
        JOptionPane.showMessageDialog(null,"Wrong Password");
        JOptionPane.showMessageDialog(null,"Wrong Name","warning",JOptionPane.ERROR_MESSAGE);
    }
}