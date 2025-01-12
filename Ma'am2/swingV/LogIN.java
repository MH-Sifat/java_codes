package swingV;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class LogIN extends JFrame{
    JLabel u,p;
    JTextField td; JPasswordField pd;
    private Container d;
    private Font ft;
    JButton sb,cb;
    Cursor cs;
    ImageIcon ic;
    LogIN(){// dashboard
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setBounds(100,100,640,500);
         this.setTitle("Login dashboard");
         d=this.getContentPane(); d.setLayout(null);
         d.setBackground(Color.orange);
         ft=new Font("Cambria",Font.BOLD,14);
         cs= new Cursor(Cursor.HAND_CURSOR);
         ic=new ImageIcon(getClass().getResource("btn.png"));


         u=new JLabel("Enter username: ");
    u.setBounds(50,60,150,50);
    u.setFont(ft); u.setForeground(Color.BLUE);
    d.add(u);
    td=new JTextField();
        td.setBounds(200,60,200,60);td.setFont(ft);
        d.add(td);

p=new JLabel("Enter Password");
p.setBounds(50,120,150,50);
p.setFont(ft); p.setForeground(Color.BLUE);d.add(p);
pd=new JPasswordField();
pd.setBounds(200,130,200,60);
pd.setFont(ft); d.add(pd);
//
        sb=new JButton("Submit");
        sb.setBounds(200,210,90,55);
        sb.setFont(ft); d.add(sb);

        cb=new JButton(ic);
        cb.setBounds(300,210,90,55);
        cb.setFont(ft); d.add(cb);

        //actions on button
        sb.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String w=td.getText();
                if(!w.isEmpty()){

                    JOptionPane.showMessageDialog(null,
                            w+" ,you have logged in");
                }

            }
        });
        cb.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               td.setText(""); pd.setText("");


            }
        });



    }

    public static void main(String[] args) {
        LogIN demo=new LogIN();
        demo.setVisible(true);
    }


}
