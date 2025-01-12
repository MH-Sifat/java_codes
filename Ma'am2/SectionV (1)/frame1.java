// frames in JAVA GUI

import javax.swing.JFrame;
public class frame1{ 
public static void main(String args[]){
	JFrame f=new JFrame();
	f.setSize(640, 480);
	f.setLocationRelativeTo(null);
	f.setLocation(200, 300);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setTitle("Demo Frame");
	f.setResizable(false);
}
}
	
	