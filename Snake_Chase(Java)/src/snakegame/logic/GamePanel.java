package snakegame.logic;

import snakegame.management.ScoreManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;



// defines a class GamePanel in Java that extends the JPanel class and implements the ActionListener and KeyListener interfaces.
// The KeyListener interface listens for keyboard events like key presses, key releases, or key typing.
// implements: This keyword is used to implement interfaces in Java. An interface defines a set of methods that a class must implement.
public class GamePanel extends JPanel implements ActionListener, KeyListener {
    public final int width = 800, height = 600, unit_size = 25;
    public Snake snake;
    public Food food;  // normal food
    public Food bonusFood; //  bonus food
    public boolean running, paused, bonusFoodActive; // Game states
    public int score, highScore;
    /*
    In Java, the Timer class is part of the javax.swing package and is used to schedule tasks for one-time or repeated execution.
     It can be used to perform an action at a fixed time interval or after a delay.

     In your snake game project, the Timer is used to repeatedly trigger updates in the game, such as moving the snake, checking for collisions, and redrawing the game screen.
    */
    public Timer timer, bonusTimer; // Timers for game updates and bonus food
    public Random random; // Random number generator

    public GamePanel() {
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.BLACK);
        setFocusable(true); // Allow the panel to receive key events
        addKeyListener(this); // Add a key listener for controlling the snake
        random = new Random(); // Initialize the random number generator
        startGame(); // Start the game
    }
    // unit_size represents the size of a single "unit" in the game, like the size of a single segment of the snake and the size of each piece of food.
    // unit_size = 25 means that each unit (segment) is 25 pixels in both width and height. So, each snake segment and food item will be a square of 25x25 pixels.
    public void startGame() {
        /*
        Snake(unit_size, unit_size, unit_size): This is the constructor of the Snake class, which takes three parameters (unit_size, unit_size, and unit_size):
        The first unit_size likely refers to the starting position of the snake's head (in terms of the x-coordinate).
        The second unit_size is for the y-coordinate of the snake's head (vertical position).
        The third unit_size is the size of each snake segment. So, each segment of the snake will have a width and height of 25 pixe
        */
        snake = new Snake(unit_size, unit_size, unit_size);
        // By dividing the width by unit_size, we ensure that the food is placed within the bounds of the game area and on a grid.
        food = new Food(random.nextInt(width / unit_size) * unit_size,
                random.nextInt(height / unit_size) * unit_size, unit_size);
        bonusFood = null; // No bonus food
        running = true; // Game is running
        paused = false; // Game is not paused
        bonusFoodActive = false; // Bonus food is not active
        score = 0; // Reset the score
        highScore = ScoreManager.loadHighScore(); // Load the high score
        /*
        This creates a new Timer that triggers every 100 milliseconds (0.1 seconds).
        The second parameter, this, refers to the current object (GamePanel), and since GamePanel implements ActionListener, it will listen for the action events triggered by the timer.
        This means every 100 milliseconds, the actionPerformed() method in GamePanel will be called.
         */
        timer = new Timer(100, this);  // / Timer for game updates (100ms delay)
        bonusTimer = new Timer(5000, e -> spawnBonusFood()); // calling method after every 5 sec to show Bonus food
        timer.start(); // Start the game timer
        // This starts the timer, which means the game will start updating the snake's position, checking for collisions, and performing other game logic every 100 milliseconds.
        bonusTimer.start(); // Start the bonus food timer
        requestFocusInWindow(); // Focus the panel to receive key events
    }

    private void spawnBonusFood() {
        if (score > 0 && score % 10 == 0 && !bonusFoodActive) {
            bonusFood = new Food(random.nextInt(width / unit_size) * unit_size,
                    random.nextInt(height / unit_size) * unit_size, unit_size);
            bonusFoodActive = true; // Bonus food is active

            //  bonus food will Remove after 10 seconds if not eaten
            Timer removeBonusTimer = new Timer(10000, e -> {
                bonusFood = null;
                bonusFoodActive = false;
                repaint(); // Redraw the panel
            });
            removeBonusTimer.setRepeats(false); // Run the timer only once
            removeBonusTimer.start();
            // removeBonusTimer.start(): Starts the timer, which counts for 10 seconds and removes the bonus food if it isn't eaten.
        }
    }

    public void pauseGame() {
        if (running && !paused) {
            paused = true; // Game is paused
            timer.stop(); // Stop the game timer
            bonusTimer.stop(); // Stop the bonus food timer
        }
    }

    public void resumeGame() {
        if (running && paused) {
            paused = false; // Game is resumed
            timer.start(); // Start the game timer
            bonusTimer.start(); // Start the bonus food timer
            requestFocusInWindow(); // Focus the panel to receive key events
        }
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (running) {
            food.draw(g);// Draw the food
            if (bonusFoodActive && bonusFood != null) {
                g.setColor(Color.YELLOW); // Set color for bonus food
                g.fillOval(bonusFood.getX(), bonusFood.getY(), bonusFood.size, bonusFood.size); // Draw bonus food
            }
            snake.draw(g); // Draw the snake
            g.setColor(Color.WHITE);  // Set color for text
            g.setFont(new Font("Arial", Font.BOLD, 13)); // Set font for text
            g.drawString("Score: " + score, 10, 10); // Draw the  score
            g.drawString("High Score: " + highScore, 10, 25);// Draw the high score
        } else {
            gameOver(g); // Draw the game over screen
        }
    }

    private void gameOver(Graphics g) {
        g.setColor(Color.RED); // Set color for game over text
        g.setFont(new Font("Arial", Font.BOLD, 40)); // Set font for game over text
        g.drawString("Game Over", width / 2 - 100, 300); // Draw "Game Over"

        // Check if the current score is higher than the high score
        if (score > highScore) {
            highScore = score; // Update the high score
            ScoreManager.saveHighScore(highScore); // Save the high score
        }
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score:" + score, width / 2 - 20, 250 );
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("High Score:" + highScore, width / 2 - 50, 350);

    }

// The actionPerformed() method is part of the ActionListener interface, and it defines what should happen every time the timer triggers an action.
    public void actionPerformed(ActionEvent e) {
        // This code runs every 100 milliseconds

        if (running && !paused) {
            // Update snake's position
            snake.move(); // Move the snake
            // Check for collision or if the snake is out of bounds
            if (snake.checkCollision() || snake.isOutOfBounds(width, height)) {
                running = false;
                timer.stop(); // Stop the game if the snake collides with itself or goes out of bounds
                bonusTimer.stop();
            }

            // checking collision with normal food
            // Handle snake eating food
            // This checks if the snake's head (the first body segment) has collided with the food. If the coordinates of the snake’s head match the coordinates of the food, the snake has eaten the food.
            if (snake.getBody().get(0).x == food.getX() && snake.getBody().get(0).y == food.getY()) {
                snake.grow(); // Grow the snake if it eats food
                score++;
                food.setPosition(random.nextInt(width / unit_size) * unit_size,
                        random.nextInt(height / unit_size) * unit_size); // Move food to a new location

                if (score > highScore) {
                    highScore = score;
                    ScoreManager.saveHighScore(highScore);
                }

            }

            // checking collision with bonus food
            if (bonusFoodActive && bonusFood != null &&
                    snake.getBody().get(0).x == bonusFood.getX() && snake.getBody().get(0).y == bonusFood.getY()) {
                score += 5; // Bonus food add 5 points
                bonusFood = null; // Removing bonus food
                bonusFoodActive = false;
            }
        }
        // Redraw the screen to update the game view
        repaint();
        // it triggers the paintComponent() method, which redraws the snake, food, bonus food, score, and any other necessary elements.
    }


    public void keyPressed(KeyEvent e) {
        if (!paused) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP -> snake.setDirection('U'); // Move up
                case KeyEvent.VK_DOWN -> snake.setDirection('D'); // Move down
                case KeyEvent.VK_LEFT -> snake.setDirection('L'); // Move left
                case KeyEvent.VK_RIGHT -> snake.setDirection('R'); // Move right
            }
        }
    }

// egula KeyListener er  methods jegula override korte hobe karon KeyListener ekta interface
    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}
}

/*
This is the core of the game logic.

It handles:

The snake's movement.

Collision detection (with food, walls, and itself).

Rendering the game (snake, food, score, etc.).

Bonus food mechanics.

Manages game states (running, paused, game over).

java
*/
