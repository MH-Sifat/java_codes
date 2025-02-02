package snakegame.design;

import snakegame.logic.GamePanel;
import snakegame.logic.Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/*
This extends GamePanel and adds premium features:

Lives system (player gets 3 lives).

Custom background and bonus food images.
*/

public class PremiumGamePanel extends GamePanel {
    private int lives; // Number of lives
    private Image backgroundImage; // Background image
    private Image lifeImage; // Life icon image


    public PremiumGamePanel() {
        super(); // Call the constructor of the parent class (GamePanel)
        lives = 3; // default number of lives
        backgroundImage = new ImageIcon("Images/playground.jpg").getImage(); // Load the background image
        lifeImage = new ImageIcon("Images/life.png").getImage(); // Load the life icon image

    }


    // The timer.stop() and bonusTimer.stop() methods are used to ensure that old timers are stopped before starting a new game, preventing conflicts and ensuring a clean start.

    public void startGame() {
        if (timer != null) {
            timer.stop(); // Stop the game timer
        }
        if (bonusTimer != null) {
            bonusTimer.stop();
        }

        super.startGame(); //  Reseting snake, food and scores
        lives = 3;         // Reseting the lives count for the premium game
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the paintComponent method of the parent clas

        // Drawing the background image to fill entire panel
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);


        if (running) {
            // Drawing the snake, food and other game things
            snake.draw(g);
            food.draw(g);
            g.setColor(Color.BLACK);
            g.drawString("Score: " + score, 10, 10);
            g.drawString("High Score: " + highScore, 10, 25);

            // Drawing bonus food as an image if it is active
            if (bonusFoodActive && bonusFood != null) {
                Image bonusFoodImage = new ImageIcon("Images/bonus.png").getImage();
                g.drawImage(bonusFoodImage, bonusFood.getX(), bonusFood.getY(), bonusFood.getSize(), bonusFood.getSize(), null);
            }

            // Drawing lives as images at the center
            for (int i = 0; i < lives; i++) {
                // Adjusting the spacing  between each life icon
                g.drawImage(lifeImage, (getWidth() / 2) - (30 * (lives - i)) + 10, 10, 20, 20, null);
            }

        } else {
            // Drawing the game over screen
            super.paintComponent(g);
        }
    }



    public void actionPerformed(ActionEvent e) {
        if (running && !paused) {
            snake.move();
            if (snake.checkCollision() || snake.isOutOfBounds(width, height)) {
                lives--;
                if (lives > 0) {
                    snake = new Snake(unit_size, unit_size, unit_size);
                } else {
                    running = false;
                }
            }

            // Checking collision with food
            if (snake.getBody().get(0).x == food.getX() && snake.getBody().get(0).y == food.getY()) {
                snake.grow();
                score++;
                food.setPosition(random.nextInt(width / unit_size) * unit_size,
                        random.nextInt(height / unit_size) * unit_size);
            }

            // Checking collision with bonus food
            if (bonusFoodActive && bonusFood != null &&
                    snake.getBody().get(0).x == bonusFood.getX() &&
                    snake.getBody().get(0).y == bonusFood.getY()) {
                score += 5;
                bonusFood = null;
                bonusFoodActive = false;
            }

            repaint(); // Redraw the panel
        }
    }
}

/*
What it does:

Extends GamePanel to add premium features.

Adds a lives system and custom graphics.
*/