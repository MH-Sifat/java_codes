package snakegame.logic;

import java.awt.*;
import java.util.ArrayList;

// Snake represents the snake in the game. It has methods to move, grow, and check collisions.

public class Snake extends GameEntity {
    // In this case, final ensures that the body variable will always reference the same ArrayList<Point> throughout the lifetime of the Snake object.
    private final ArrayList<Point> body; // The snake's body
    /*
    ArrayList is a part of Java’s Collection Framework and provides an implementation of a resizable array that allows elements to be added or removed dynamically.
     Point: This is a class in Java that stores two integer values: x (horizontal position) and y (vertical position). It represents a point in 2D space. Each Point object will represent a segment of the snake's body.
     In the context of your snake game, the ArrayList<Point> holds all the body segments of the snake. Each segment’s position is stored as a Point(x, y).
    */
    private char direction; // Current direction of the snake

    public Snake(int x, int y, int size) {
        super(x, y, size); // Call the constructor of the parent class (GameEntity)
        body = new ArrayList<>(); // Initialize the snake's body
        // Initially, the head of the snake is placed at the coordinates (x, y), which is passed into the constructor.
        body.add(new Point(x, y)); // Add the head of the snake
        direction = 'R'; // default direction
    }

    public void move() {
        // Update the positions of the snake's body
        for (int i = body.size() - 1; i > 0; i--) {
            body.set(i, new Point(body.get(i - 1))); // Shift each body segment forward
        }
        // Move the head of the snake
        Point head = body.get(0); // Get the current head of the snake
        switch (direction) { // Move the head in the appropriate direction based on the current direction
           // If the direction is 'U' (up), the y-coordinate of the head is decreased by the size of each segment (typically 25 pixels)
            case 'U' -> head.y -= size; // decrease the y-coordinate
            //  If the direction is 'D' (down), the y-coordinate of the head is increased by size, making the snake move downward.
            case 'D' -> head.y += size; // increase the y-coordinate
            // If the direction is 'L' (left), the x-coordinate of the head is decreased by size, making the snake move to the left.
            case 'L' -> head.x -= size; // decrease the x-coordinate
            //  If the direction is 'R' (right), the x-coordinate of the head is increased by size, making the snake move to the right.
            case 'R' -> head.x += size; // increase the x-coordinate
        }
    }

    public void grow() {
        // Add a new segment to the snake's body
        body.add(new Point(body.get(body.size() - 1)));
    }

    public boolean checkCollision() {
        Point head = body.get(0); // Get the head of the snake
        for (int i = 1; i < body.size(); i++) {
            if (head.equals(body.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isOutOfBounds(int width, int height) {
        Point head = body.get(0); // Get the head of the snake
         // Check if the head is out of bounds
        return head.x < 0 || head.x >= width || head.y < 0 || head.y >= height;
    }

    public void setDirection(char direction) {
         // Set the direction of the snake
        this.direction = direction;
    }

    public ArrayList<Point> getBody() {
        return body; // Return the snake's body
    }

    public void draw(Graphics g) {
        for (int i = 0; i < body.size(); i++) {
            g.setColor(i == 0 ? Color.BLUE : Color.LIGHT_GRAY); // Set color for the head and body
            g.fillRect(body.get(i).x, body.get(i).y, size, size); // // Draw each segment of the snake
        }
    }
}


/*
What it does:

Represents the snake in the game.

Handles movement, growth, and collision detection.

Draws the snake on the screen.

*/