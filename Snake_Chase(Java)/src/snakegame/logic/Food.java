package snakegame.logic;

import java.awt.*;

// Food represents the food that the snake eats. It is drawn as a red circle.
public class Food extends GameEntity {
    /*
    The Food class constructor is called with three arguments: the x and y coordinates for the food's position,
    and the size of the food (which is the same as unit_size).
    */
    public Food(int x, int y, int size) {

        super(x, y, size);  // Call the constructor of the parent class (GameEntity)
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);  // Set color for the food
        g.fillOval(x, y, size, size); // Draw the food as a red circle
    }
}

/*
What it does:

Represents the food in the game.

Draws the food on the screen.
*/