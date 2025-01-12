package swingV;
import javax.swing.JComboBox;
import javax.swing.JFrame;
public class Combo {
    JFrame ft;
    Combo(){ft=new JFrame("Frame with drop down menu");
        String ty[]={"CSE","Math","EEE","Law"};
        JComboBox cb=new JComboBox(ty);
        cb.setBounds(50,50,90,30);
        ft.add(cb);
        ft.setLayout(null);
        ft.setSize(200,300);
        ft.setVisible(true);
   } public static void main(String[] args) {
        //annoymous object
        new Combo();

    }
}
