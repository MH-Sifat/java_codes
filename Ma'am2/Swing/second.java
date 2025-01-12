//swing classes and application
package swing;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class second{
	public static void main(String args[]){
		String f_name=JOptionPane.showInputDialog(null,"Enter your first name","Display",JOptionPane.QUESTION_MESSAGE);
		String l_name=JOptionPane.showInputDialog(null,"Enter your  surname","Display",JOptionPane.QUESTION_MESSAGE);
		String name=f_name+ " "+l_name;
		
		
		
		JOptionPane.showMessageDialog(null,name+" Welcome to the class");
		
	
	}
	}