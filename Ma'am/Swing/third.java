//swing classes and application
package swing;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class third{
	public static void main(String args[]){
ImageIcon icon=new ImageIcon("r.png");
		//show option dialog
String[] button={"Yes I am good","No I am not okay","Neutral"};
JOptionPane.showOptionDialog(null,"Are you okay?","QueryBox",
JOptionPane.YES_NO_OPTION,
JOptionPane.INFORMATION_MESSAGE,icon, button, 2);}}
		
		
	