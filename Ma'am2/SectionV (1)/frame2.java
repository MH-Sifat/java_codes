// frames and button in JAVA GUI
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
public class frame2 extends JFrame{ 
private Container c;//

	frame2(){
		init();
		
	}
	public void init(){
		      c=this.getContentPane();// this getter method to find colors
        c.setBackground(Color.YELLOW);
        JButton btn=new JButton();
        btn.setBounds(50,10,50,40);
		//btn.setSize(100,50);
		//btn.setLocationRelativeTo(null);
        add(btn);
        btn.setText("Click Button");

   
		
	}
	public static void main(String args[]){
		frame2 f=new frame2();//DEFAULT 
		f.setSize(640, 480);
	f.setLocationRelativeTo(null);
	f.setLocation(400, 150);

	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setTitle("Demo Frame2");
	f.setLayout(null);
	f.setResizable(false);
		f.setVisible(true);
		
	}
}
	
	