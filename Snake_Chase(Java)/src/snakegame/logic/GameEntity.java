package snakegame.logic;

import java.awt.*;

public abstract class GameEntity {
    protected int x, y, size; // Position and size of the entity

    public GameEntity(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public abstract void draw(Graphics g); // Abstract method to draw the entity

    // Getters and setters methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/*
What it does:

Provides common properties (x, y, size) and Defines an abstract draw method that must be implemented by subclasses

This is an abstract class that serves as the base class for Snake and Food. It provides common properties and methods.
*/