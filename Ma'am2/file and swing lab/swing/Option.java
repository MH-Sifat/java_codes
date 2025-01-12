package swing;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Option {
    public static void main(String args[]){
        ImageIcon icon=new ImageIcon("E:\\AIUB\\Swing\\r.png");
        String[] btn={"yes i am fine", "no i am sad", "I think I am neutral"};
        JOptionPane.showOptionDialog(null,"Are you fine?","Demo title",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,icon, btn,0);

}
}
