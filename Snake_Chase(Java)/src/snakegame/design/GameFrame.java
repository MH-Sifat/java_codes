package snakegame.design;

import snakegame.logic.GamePanel;

import javax.swing.*;
import java.awt.*;

// This is the main game window for the basic version.

public class GameFrame extends JFrame {
    public GameFrame() {
        // Title of the window
        setTitle("Snake Chase");
        // Use BorderLayout for positioning
        setLayout(new BorderLayout());

        // game panel positioning in center
        GamePanel gamePanel = new GamePanel();
        add(gamePanel, BorderLayout.CENTER);

        // button panel positioning right side
        ButtonPanel buttonPanel = new ButtonPanel(gamePanel, this);
        add(buttonPanel, BorderLayout.EAST);

        pack(); // Adjust the window size to fit the components
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true); // Make the window visible
    }
}

/*
What it does:

Creates a window for the basic game.

Adds the GamePanel (game logic) and ButtonPanel (controls) to the window.
*/