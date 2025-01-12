
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private final int WIDTH = 600, HEIGHT = 600, UNIT_SIZE = 25;
    private Snake snake;
    private Food food;
    private boolean running;
    private int score, highScore;
    private Timer timer;

    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        startGame();
    }

    private void startGame() {
        snake = new Snake(UNIT_SIZE, UNIT_SIZE, UNIT_SIZE);
        food = new Food(new Random().nextInt(WIDTH / UNIT_SIZE) * UNIT_SIZE,
                new Random().nextInt(HEIGHT / UNIT_SIZE) * UNIT_SIZE, UNIT_SIZE);
        running = true;
        score = 0;
        highScore = ScoreManager.loadHighScore();
        timer = new Timer(100, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (running) {
            food.draw(g);
            snake.draw(g);
            g.setColor(Color.WHITE);
            g.drawString("Score: " + score, 10, 10);
            g.drawString("High Score: " + highScore, 10, 25);
        } else {
            gameOver(g);
        }
    }

    private void gameOver(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Game Over", WIDTH / 2 - 100, HEIGHT / 2);
        ScoreManager.saveHighScore(Math.max(score, highScore));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            snake.move();
            if (snake.checkCollision() || snake.isOutOfBounds(WIDTH, HEIGHT)) {
                running = false;
            }
            if (snake.getBody().get(0).x == food.getX() && snake.getBody().get(0).y == food.getY()) {
                snake.grow();
                score++;
                food.setPosition(new Random().nextInt(WIDTH / UNIT_SIZE) * UNIT_SIZE,
                        new Random().nextInt(HEIGHT / UNIT_SIZE) * UNIT_SIZE);
            }
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> snake.setDirection('U');
            case KeyEvent.VK_DOWN -> snake.setDirection('D');
            case KeyEvent.VK_LEFT -> snake.setDirection('L');
            case KeyEvent.VK_RIGHT -> snake.setDirection('R');
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
}
