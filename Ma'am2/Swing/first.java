//swing classes and application
package swing;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class first{
	public static void main(String args[]){
ImageIcon icon=new ImageIcon("r.png");
// number of parameters inside the method= 2, 4,5
JOptionPane.showMessageDialog(null,"Wrong Password");
JOptionPane.showMessageDialog(null,"Wrong Name","warning",JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null,"Wrong ID","warning",JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null,"Wrong Email","warning",JOptionPane.PLAIN_MESSAGE,icon);
	
	}
}