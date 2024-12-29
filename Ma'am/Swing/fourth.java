//swing classes and application
package swing;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class fourth{
	public static void main(String args[]){
		int c;
		// showConfirmation
		c=JOptionPane.showConfirmDialog(null,"Do you want to quit?","Confirm",
		JOptionPane.YES_NO_CANCEL_OPTION);
	if(c==JOptionPane.YES_OPTION){ System.exit(0);}
	else{ System.out.println("User wants to continue");}
	}
	}