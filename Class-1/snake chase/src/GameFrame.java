
import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Snake Game");
        add(new GamePanel());
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
